package com.company;

public class Eagle <F extends Number> implements Flyable<F> {
    F flightAltitude;

    public Eagle(F flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    @Override
    public F fly() {
        return flightAltitude;
    }
}
