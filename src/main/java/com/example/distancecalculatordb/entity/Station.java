package com.example.distancecalculatordb.entity;

public class Station {

    private String from;
    private String to;
    private double distance;
    private String unit;

    public Station(String from, String to, double distance, String unit) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.unit = unit;
    }

    public Station() {

    }

    @Override
    public String toString() {
        return "Station{" + "from=" + this.from + ", to='" + this.to + '\'' + ", distance='" + this.distance + '\'' + ", unit='" + this.unit + '\'' +  '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}