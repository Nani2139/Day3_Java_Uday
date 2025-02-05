package org.example;
import java.util.*;
import org.example.TicketReservation;
public class Main {
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();

        // Book 10 confirmed passengers
        for (int i = 1; i <= 10; i++) {
            system.bookFlight("Passenger", String.valueOf(i), 25, "M", "economy", "C" + i);
        }
        // Book 3 waiting list passengers
        for (int i = 11; i <= 13; i++) {
            system.bookFlight("Waiting", String.valueOf(i), 30, "F", "business", "C" + i);
        }
        // Try booking when full
        boolean result = system.bookFlight("Extra", "Passenger", 40, "M", "economy", "C14");
        System.out.println("Booking extra passenger (should be false): " + result);

        // Cancel a passenger in confirmedList
        String cancelPassengerconfirmationNumber="C5";
        boolean cancelResult = system.cancel(cancelPassengerconfirmationNumber);
        System.out.println("Canceled passenger "+ cancelPassengerconfirmationNumber+ ": " + cancelResult);

        // Confirm waitingList moves up
        System.out.println("Confirmed List after cancellation: " + system.confirmedList);
    }
}
