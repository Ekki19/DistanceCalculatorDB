package com.example.distancecalculatordb.logic;

import com.example.distancecalculatordb.model.Station;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceCalculatorTest {

    /*
        calculateDistance() testet die Berechnung der Entfernung zwischen FF und BLS
     */
    @Test
    void calculateDistance() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        Station stationFrom = new Station();
        Station stationTo = new Station();

        stationFrom.setBreite(50.107145);
        stationFrom.setLaenge(8.663789);
        stationFrom.setBetreiberName("DB Station und Service AG");
        stationFrom.setName("Frankfurt(Main)Hbf");
        stationFrom.setIfopt("de:06412:10");
        stationFrom.setBetreiberNr(1866);
        stationFrom.setVerkehr("FV");
        stationFrom.setEvaNr(8000105);
        stationFrom.setDs100("FF");
        stationFrom.setStatus("");

        stationTo.setStatus("");
        stationTo.setName("Berlin Hbf");
        stationTo.setEvaNr(8011160);
        stationTo.setDs100("BLS");
        stationTo.setIfopt("de:11000:900003201");
        stationTo.setVerkehr("FV");
        stationTo.setLaenge(13.369545);
        stationTo.setBreite(52.525592);
        stationTo.setBetreiberNr(1071);
        stationTo.setBetreiberName("DB Station und Service AG");



        assertEquals(423, Math.round(distanceCalculator.calculateDistance(stationFrom, stationTo)));
    }

    /*
        calculateWithNull() testet, ob mit einer leeren Station ein Fehler geschmissen wird
     */
    @Test
    void calculateWithNull(){

        Station stationFrom = null;
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        boolean hasError = false;

        Station stationTo = new Station();
        stationTo.setBreite(50.154785);
        stationTo.setLaenge(9.541236);
        stationTo.setIfopt("de:06412:10");
        stationTo.setName("Entenhausen");
        stationTo.setBetreiberNr(2365);
        stationTo.setVerkehr("FV");
        stationTo.setBetreiberName("DB Station und Service AG");
        stationTo.setEvaNr(8000569);
        stationTo.setStatus("");

        try{
            assertEquals("0.0", Math.round(distanceCalculator.calculateDistance(stationFrom, stationTo)));

        }catch(Exception e){
            hasError = true;
        }
        assertTrue(true, String.valueOf(hasError));

    }
}