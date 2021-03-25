package org.example.l15.hotel;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(new Semaphore(3));
        Guest guest1 = new Guest("Guest1", hotel);
        Guest guest2 = new Guest("Guest2", hotel);
        Guest guest3 = new Guest("Guest3", hotel);
        Guest guest4 = new Guest("Guest4", hotel);
        Guest guest5 = new Guest("Guest5", hotel);
        Guest guest6 = new Guest("Guest6", hotel);
        Guest guest7 = new Guest("Guest7", hotel);
        Guest guest8 = new Guest("Guest8", hotel);

        guest1.start();
        guest2.start();
        guest3.start();
        guest4.start();
        guest5.start();
        guest6.start();
        guest7.start();
        guest8.start();
    }
}
