package org.example.l15.details;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Detail {
    private   AtomicInteger count ;

    public Detail(AtomicInteger count) {
        this.count = count;
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void setCount(AtomicInteger count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detail detail = (Detail) o;
        return Objects.equals(count, detail.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }


}
