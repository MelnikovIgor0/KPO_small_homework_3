package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLights trafficLights = new TrafficLights();
        GoogleMap map = new GoogleMap();
        Navigator navigator = new Navigator();
        trafficLights.manager.subscribe("colorChanged", map);
        trafficLights.manager.subscribe("colorChanged", navigator);
        trafficLights.startWork();
        map.getStatistics();
    }
}