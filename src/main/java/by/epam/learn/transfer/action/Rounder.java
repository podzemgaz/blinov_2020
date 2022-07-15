package by.epam.learn.transfer.action;

public class Rounder {
    public static float round(float d, int context) {
        float scale = (float) Math.pow(10, context);

        return Math.round(d * scale) / scale;
    }
}
