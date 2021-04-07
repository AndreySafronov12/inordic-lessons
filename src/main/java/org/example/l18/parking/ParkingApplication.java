package org.example.l18.parking;

import org.example.l18.parking.model.Car;
import org.example.l18.parking.model.Parking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ParkingApplication {

	@Bean
	public Parking newParking() {
		Parking parking = new Parking();
		parking.addCar(new Car("Volvo1"));
		parking.addCar(new Car("Volvo2"));
		parking.addCar(new Car("BMW1"));
		parking.addCar(new Car("Audi1"));
		parking.addCar(new Car("Lada1"));
		parking.addCar(new Car("BMW2"));
		parking.addCar(new Car("Saab1"));

		return parking;
	}

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

}
