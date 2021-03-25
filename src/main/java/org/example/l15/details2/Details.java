package org.example.l15.details2;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Details {
    private AtomicInteger countDetails;

    public Details(AtomicInteger countDetails) {
        this.countDetails = countDetails;
    }

    public AtomicInteger getCountDetails() {
        return countDetails;
    }

    public void setCountDetails(AtomicInteger countDetails) {
        this.countDetails = countDetails;
    }

    @Override
    public String toString() {
        return "Details{" +
                "countDetails=" + countDetails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return Objects.equals(countDetails, details.countDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countDetails);
    }
}
