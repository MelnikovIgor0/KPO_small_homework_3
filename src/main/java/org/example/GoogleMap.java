package org.example;

public class GoogleMap implements ISubscriber {
    private Integer total_amount_switches = 0;
    public void onColorChanged(Colors color) {
        ++total_amount_switches;
        System.out.println("Google maps found that traffic light changed color on: " + color.toString());
    }

    public void getStatistics() {
        System.out.println("Total number of traffic light switches: " + total_amount_switches.toString());
    }
}
