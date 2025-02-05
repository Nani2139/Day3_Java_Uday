package org.example;

public class Passenger {
    private String firstName, lastName, gender, travelClass, confirmationNumber;
    private int age;

    public Passenger(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.travelClass = travelClass;
        this.confirmationNumber = confirmationNumber;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + confirmationNumber + ")";
    }
}

