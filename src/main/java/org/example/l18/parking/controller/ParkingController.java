package org.example.l18.parking.controller;

import org.example.l18.parking.model.Car;
import org.example.l18.parking.model.Parking;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ParkingController {
    private final Parking parking;

    public ParkingController(Parking parking) {
        this.parking = parking;
    }

    @GetMapping ("/")
    public String getParking() {
        return "Here is my parking";
    }

    @GetMapping ("/free")
    public String freePlaces() {
        return parking.getEmptyPlaces();
    }

    @GetMapping ("/cars")
    public List<Car> carsPlaces() {
        return parking.getCarList();
    }

    @PostMapping ("/park")
    public void parkTheCar(@RequestBody Car car) {
        parking.addCar(car);
    }

    @DeleteMapping ("/unpark")
    public void unparkTheCar(@RequestBody Car car) {
        parking.deleteCar(car);
    }

    @DeleteMapping ("/freeplace/{id}")
    public void unparkThePlace(@PathVariable(name = "id") int index) {
        parking.deleteCar(index);
    }



}
