package object_oriented_programming.week_05.chapter_02.task_01;

import java.util.ArrayList;

public class Reservation extends Thread {
    private int ticketsToBuy = 0;
    private int revervationNumber = 0;

    private ReservationSystem reservationSystem = null;

    public Reservation(ReservationSystem reservationSystem, int ticketsToBuy) {
        this.reservationSystem = reservationSystem;
        this.ticketsToBuy = ticketsToBuy;
        this.revervationNumber = this.reservationSystem.getThreads().size() + 1;

        this.reservationSystem.getThreads().add(this);
    }

    public void runReservation() {
        for(Reservation thread : this.reservationSystem.getThreads()) {
            if(thread != this) {
                try {
                    thread.join();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        this.start();
    }

    public void run() {
        if(this.reservationSystem.hasTicketLeft(this.ticketsToBuy)) {
            this.reservationSystem.addTicketCount(this.ticketsToBuy);
            System.out.printf("Customer %d reserved %d tickets.\n", this.revervationNumber, this.ticketsToBuy);
        } else {
            System.out.printf("Customer %d could not reserve %d tickets.\n", this.revervationNumber, this.ticketsToBuy);
        }
    }
}
