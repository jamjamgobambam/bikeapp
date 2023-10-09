package com.milliondollawinners;

public class Route {
    private Location startLoc;
    private Location endLoc;
    //Distance in miles
    private double distance;
    //Elevation gain/loss in feet
    private int elevationGain;
    private int elevationLoss;


    public Route() {
        startLoc = new Location();
        endLoc = new Location();
        distance = 1.0;
        elevationGain = 0;
        elevationLoss = 0;
    }

    public Route(Location startLoc, Location endLoc, double distance, int elevationGain, int elevationLoss) {
        this.startLoc = startLoc;
        this.endLoc = endLoc;
        this.distance = distance;
        this.elevationGain = elevationGain;
        this.elevationLoss = elevationLoss;
    }

    public void setStartLoc(Location startLoc) {
        this.startLoc = startLoc;
    }

    public void setStartLoc(double lat, double lon) {
        startLoc.setLat(lat);
        startLoc.setLon(lon);
    }

    public void setEndLoc(Location endLoc) {
        this.endLoc = endLoc;
    }

    public void setEndLoc(double lat, double lon) {
        endLoc.setLat(lat);
        endLoc.setLon(lon);
    }
    
    public double getDistance() {
        return distance;
    }

    public int getElevationGain() {
        return elevationGain;
    }

    public int getElevationLoss() {
        return elevationLoss;
    }




}
