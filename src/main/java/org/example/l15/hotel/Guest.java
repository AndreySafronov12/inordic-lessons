package org.example.l15.hotel;

public class Guest extends Thread {
    private String guestName;
    private Hotel hotel;

    public Guest(String guestName, Hotel hotel) {
        this.guestName = guestName;
        this.hotel = hotel;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public void run() {

        try {
            hotel.getRoomCount().acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        liveInHotel();
        hotel.getRoomCount().release();

    }

    public void liveInHotel() {
        System.out.println(this.getGuestName() + " заселился");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getGuestName() + " выселился");
    }
}
