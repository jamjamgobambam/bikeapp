package com.milliondollawinners;

public class Location {
    
    private double lat;
    private double lon;
    private String name;

    public Location() {
        //No argument constructor sets the lat and lon to values for Austin, Texas
        lat = 30.2671;
        lon = -97.7431;
        name = "Austin";

    }

    public Location(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
        name = "Your Place";
    }

    public Location(double lat, double lon, String name) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public String getName() {
        return name;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Latitude: " + lat + ", Longitude: " + lon + "\nLocation Name: " + name; 
    }


}
