package org.example.l7;

public class Meeting {
    public static void main(String[] args) {
        Person ignat = new Person("Ignat",75,150, 'm');
        ignat.setName("Ignot");
        Person olga = new Person("Olga",78,140, 'm');
        ignat.kiss(olga);
    }
}
