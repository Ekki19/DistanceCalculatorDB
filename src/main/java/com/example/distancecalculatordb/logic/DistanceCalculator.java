package com.example.distancecalculatordb.logic;

import com.example.distancecalculatordb.model.Station;

public class DistanceCalculator {

    /*
        Haversine formula für die Berechnung genutzt
        https://www.daniel-braun.com/technik/distanz-zwischen-zwei-gps-koordinaten-in-java-berchenen/
     */
    final int radius = 6371;

    public double calculateDistance(Station from, Station to){



        double fromLaenge = from.getLaenge();
        double fromBreite = from.getBreite();

        double toLaenge = to.getLaenge();
        double toBreite = to.getBreite();



        double lat = Math.toRadians(toBreite - fromBreite);
        double lon = Math.toRadians(toLaenge- fromLaenge);

        double a = Math.sin(lat / 2) * Math.sin(lat / 2) + Math.cos(Math.toRadians(fromBreite)) * Math.cos(Math.toRadians(toBreite)) * Math.sin(lon / 2) * Math.sin(lon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double d = radius * c;

        return Math.abs(d);
    }

}
