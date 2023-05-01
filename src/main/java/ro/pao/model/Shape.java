package ro.pao.model;

import ro.pao.model.Circle;
import ro.pao.model.Rectangle;
import ro.pao.model.Triangle;

// Exercise 4

public abstract sealed class Shape permits Circle, Rectangle, Triangle {

    public abstract Double area();

}
