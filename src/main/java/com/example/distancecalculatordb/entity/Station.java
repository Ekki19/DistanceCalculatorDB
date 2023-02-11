package com.example.distancecalculatordb.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvNumber;

public class Station {
    @CsvBindByName(column = "EVA_NR")
    private int evaNr;
    @CsvBindByName(column = "DS100")
    private String ds100;
    @CsvBindByName(column = "IFOPT")
    private String ifopt;
    @CsvBindByName(column = "NAME")
    private String name;
    @CsvBindByName(column = "Verkehr")
    private String verkehr;
    @CsvBindByName(column = "Laenge")
    @CsvNumber("#,#")
    private double laenge;
    @CsvBindByName(column = "Breite")
    @CsvNumber("#,#")
    private double breite;
    @CsvBindByName(column = "Betreiber_Name")
    private String betreiberName;
    @CsvBindByName(column = "Betreiber_Nr")
    private int betreiberNr;
    @CsvBindByName(column = "Status")
    private String status;

    public Station(){

    }

    public int getEvaNr() {
        return evaNr;
    }

    public void setEvaNr(int evaNr) {
        this.evaNr = evaNr;
    }

    public String getDs100() {
        return ds100;
    }

    public void setDs100(String ds100) {
        this.ds100 = ds100;
    }

    public String getIfopt() {
        return ifopt;
    }

    public void setIfopt(String ifopt) {
        this.ifopt = ifopt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVerkehr() {
        return verkehr;
    }

    public void setVerkehr(String verkehr) {
        this.verkehr = verkehr;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public String getBetreiberName() {
        return betreiberName;
    }

    public void setBetreiberName(String betreiberName) {
        this.betreiberName = betreiberName;
    }

    public int getBetreiberNr() {
        return betreiberNr;
    }

    public void setBetreiberNr(int betreiberNr) {
        this.betreiberNr = betreiberNr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}