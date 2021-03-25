package org.example.l15.hotel;

import java.util.concurrent.Semaphore;

public class Hotel {

    private Semaphore roomCount;

    public Hotel(Semaphore roomCount) {
        this.roomCount = roomCount;
    }

    public Semaphore getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Semaphore roomCount) {
        this.roomCount = roomCount;
    }
}
