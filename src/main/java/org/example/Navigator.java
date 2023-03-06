package org.example;

public final class Navigator implements ISubscriber {
    public void onColorChanged(Colors color) {
        System.out.print("Navigator: ");
        switch (color) {
            case Red:
                System.out.println("Red color, you should stop");
                break;
            case Yellow:
                System.out.println("Yellow color, you should be prepared");
                break;
            case Green:
                System.out.println("Green color, you can drive");
                break;
        }
    }
}
