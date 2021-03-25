package org.example.l15.philosophers_table;

import java.util.Objects;
import java.util.concurrent.Semaphore;

public class Fork {
    private Semaphore isTaken;

    public Fork() {
        isTaken = new Semaphore(1, true);
    }

    public Semaphore getIsTaken() {
        return isTaken;
    }

    public void setIsTaken(Semaphore isTaken) {
        this.isTaken = isTaken;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "isTaken=" + isTaken +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fork fork = (Fork) o;
        return Objects.equals(isTaken, fork.isTaken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTaken);
    }
}
