package com.github.elwyncrestha.googlemapdemo.model;

/**
 * @author Elvin Shrestha on 1/8/20
 */
public class Location {
    private double latitude;
    private double longitude;
    private String marker;

    public Location() {
    }

    public Location(double latitude, double longitude, String marker) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.marker = marker;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
