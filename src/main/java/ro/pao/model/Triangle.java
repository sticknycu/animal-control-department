package ro.pao.model;

// Exercise 4

public final class Triangle extends Shape {

    private Double l1;

    private Double l2;

    private Double l3;

    @Override
    public Double area() {

        Double semiPerimeter = (l1 + l2 + l3) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - l1) * (semiPerimeter - l2) * (semiPerimeter - l3));

    }
}
