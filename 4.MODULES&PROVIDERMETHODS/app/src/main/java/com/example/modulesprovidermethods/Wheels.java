package com.example.modulesprovidermethods;

//suppose we don't own this class so we can't annotate with @Inject
public class Wheels {


    private Rims rims;
    private Tires tires;


    // we can't annotate with @Inject
    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;

    }
}
