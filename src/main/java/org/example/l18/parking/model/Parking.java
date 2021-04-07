package org.example.l18.parking.model;

import lombok.*;
import org.example.l18.parking.exception.CarNotFoundException;
import org.example.l18.parking.exception.FullParkingException;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Parking {
    private List<Car> carList = new ArrayList<>(20);
    private int countOfPlaces = 20;

    public String getEmptyPlaces(){
        String emptyList = "";
        for (int i = carList.size(); i < countOfPlaces - 1; i++) {
            emptyList = (emptyList + "Место "+ i + " свободно" + "\n");
        }
        emptyList = (emptyList + "Место "+ (countOfPlaces - 1) + " свободно");
        return emptyList;
    }


    public void addCar(Car car) {
        if (carList.size() == countOfPlaces) throw new FullParkingException("Нет мест!");
        else {
            carList.add(car);
        }
    }

    public void deleteCar(Car car) {
        if (carList.contains(car)) {
            carList.remove(car);
        }
        else throw new CarNotFoundException("Такой машины на парковке нет");
    }

    public void deleteCar(int placeNum) {
        if (placeNum >= carList.size()) {
            throw new CarNotFoundException("Это место пустое");
        }
        else carList.remove(placeNum);
    }


}
