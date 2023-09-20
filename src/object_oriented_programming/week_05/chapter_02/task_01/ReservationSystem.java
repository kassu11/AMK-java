package object_oriented_programming.week_05.chapter_02.task_01;

import java.util.ArrayList;

public class ReservationSystem {
    static private int maxTicketCount = 10;
    static private int ticketCount = 0;
    private ArrayList<Reservation> threads = new ArrayList<>();

    public ReservationSystem(int maxTicketCount) {
        this.maxTicketCount = maxTicketCount;
    }

    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem(10);
        for(int i = 0; i < 15; i++) {
            new Reservation(reservationSystem, (int) (Math.random() * 5) + 1);
        }

        for(Reservation reservation : reservationSystem.getThreads()) {
            reservation.runReservation();
        }

        for(Reservation reservation : reservationSystem.getThreads()) {
            try {
                reservation.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Done.");
        System.out.println("Ticket count: " + ticketCount);
    }

    public ArrayList<Reservation> getThreads() {
        return threads;
    }

    public boolean hasTicketLeft(int amount) {
        return ticketCount + amount <= maxTicketCount;
    }

    public void addTicketCount(int amount) {
        ticketCount += amount;
    }
}
