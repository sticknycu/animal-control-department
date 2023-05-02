package ro.pao.model;

// Exercise 4

public final class Circle extends Shape {

    public static final double PI = 3.14159265358979323846;

    private Integer radius;

    @Override
    public Double area() {

        return PI * radius * radius;

    }

}
