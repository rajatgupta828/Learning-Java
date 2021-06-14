package com.rajat.CollectionsInJava.SetsInJava;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final String bodyType;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return  this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Overriding the equals method :");
        System.out.println(this);
        System.out.println("o.getClass() : " + o.getClass());
        System.out.println("this.getClass() : " + this.getClass());
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        System.out.println("The hash is ...");
        System.out.println(Objects.hash(name));
        return Objects.hash(name);
    }
}
