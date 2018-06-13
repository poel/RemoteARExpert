package org.appspot.apprtc;

import java.io.Serializable;

public class TouchPoint implements Serializable {

    private float X;

    private float Y;

    private boolean first;

    private boolean last;

    public TouchPoint(float x, float y, boolean first, boolean last) {
        X = x;
        Y = y;
        this.first = first;
        this.last = last;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
}
