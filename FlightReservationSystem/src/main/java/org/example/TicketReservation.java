package org.example;
import java.util.*;
import org.example.Passenger;
public class TicketReservation {
    private static final int CONFIRMEDLIST_LIMIT = 10;
    private static final int WAITINGLIST_LIMIT = 3;

    public List<Passenger> confirmedList = new ArrayList<>();
    public Deque<Passenger> waitingList = new ArrayDeque<>();

    // Book a flight
    public boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {
        Passenger passenger = new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber);

        if (confirmedList.size() < CONFIRMEDLIST_LIMIT) {
            confirmedList.add(passenger);
            return true;
        } else if (waitingList.size() < WAITINGLIST_LIMIT) {
            waitingList.offer(passenger);
            return true;
        }

        return false;
    }

    // Cancel a reservation
    public boolean cancel(String confirmationNumber) {
        if (removePassenger(confirmedList.iterator(), confirmationNumber)) {
            // Move a passenger from waitingList to confirmedList
            Passenger movedPassenger = waitingList.poll();
            if (movedPassenger != null) {
                confirmedList.add(movedPassenger);
            }
            return true;
        }

        return false;
    }
    // Remove passenger using Iterator
    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {
        while (iterator.hasNext()) {
            Passenger passenger = iterator.next();
            if (passenger.getConfirmationNumber().equals(confirmationNumber)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}

