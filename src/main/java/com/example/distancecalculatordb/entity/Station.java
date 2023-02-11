package com.example.distancecalculatordb.entity;

public class Station {
    private int evaNr;
    private String ds100;
    private String ifopt;
    private String name;
    private String verkehr;
    private String laenge;
    private String breite;
    private String betreiberName;
    private int betreiberNr;
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

    public String getLaenge() {
        return laenge;
    }

    public void setLaenge(String laenge) {
        this.laenge = laenge;
    }

    public String getBreite() {
        return breite;
    }

    public void setBreite(String breite) {
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