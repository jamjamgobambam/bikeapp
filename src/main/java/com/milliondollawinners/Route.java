package com.milliondollawinners;

public class Route {
    private Location startLoc;
    private Location endLoc;
    //private Time startTime;
    //Distance in miles
    private double distance;
    //Elevation gain in feet
    private int elevationGain;


    public Route() {
        startLoc = new Location();
        endLoc = new Location();
        //startTime = new Time();
        distance = 1.0;
        elevationGain = 0;
    }

    public Route(Location startLoc, Location endLoc, double distance, int elevationGain) {
        this.startLoc = startLoc;
        this.endLoc = endLoc;
        //this.startTime = startTime;
        this.distance = distance;
        this.elevationGain = elevationGain;
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


}
