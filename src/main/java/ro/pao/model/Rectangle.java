package ro.pao.model;

// Exercise 4

public final class Rectangle extends Shape {

    private Double length;

    private Double width;

    @Override
    public Double area() {

        return length * width;

    }

}
