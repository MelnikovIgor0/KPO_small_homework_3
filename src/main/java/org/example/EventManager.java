package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class EventManager {
    Map <String, List<ISubscriber>> subscribers = new HashMap<>();

    public EventManager(String[] events) {
        for (String event : events) {
            subscribers.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String event, ISubscriber sub) {
        subscribers.get(event).add(sub);
    }

    public void unsubscribe(String event, ISubscriber sub) {
        subscribers.get(event).remove(sub);
    }

    public void notify(String event, Colors color) {
        for (ISubscriber sub : subscribers.get(event)) {
            sub.onColorChanged(color);
        }
    }
}
