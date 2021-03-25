package org.example.l15.details;

public class ProcessDetails extends Thread{
    private Detail detail;

    public ProcessDetails(Detail detail) {
        this.detail = detail;
    }

    @Override
    public void run() {
        decrementDetail(detail);
    }

    public void decrementDetail(Detail detail) {
        for (int i = 0; i<4; i++) {
            System.out.println(detail);
            detail.getCount().decrementAndGet();
        }
    }
}
