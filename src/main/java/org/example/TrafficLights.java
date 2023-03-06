package org.example;

import java.util.Random;

public final class TrafficLights {
    public EventManager manager;
    private boolean isBroken;

    public TrafficLights() {
        manager = new EventManager(new String[]{"colorChanged", "broken"});
        isBroken = false;
    }

    void startWork() throws InterruptedException {
        if (isBroken) {
            return;
        }
        Colors currentColor = Colors.Red;
        manager.notify("colorChanged", currentColor);
        while (true) {
            Thread.sleep(500);
            currentColor = Colors.Yellow;
            manager.notify("colorChanged", currentColor);
            if (new Random().nextDouble() > 0.9) {
                isBroken = true;
                manager.notify("broken", currentColor);
                break;
            }

            Thread.sleep(50);
            currentColor = Colors.Green;
            manager.notify("colorChanged", currentColor);
            if (new Random().nextDouble() > 0.9) {
                isBroken = true;
                manager.notify("broken", currentColor);
                break;
            }

            Thread.sleep(300);
            currentColor = Colors.Red;
            manager.notify("colorChanged", currentColor);
            if (new Random().nextDouble() > 0.9) {
                isBroken = true;
                manager.notify("broken", currentColor);
                break;
            }
        }
        System.out.println("Traffic lights is broken!!!");
    }
}
