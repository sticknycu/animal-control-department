package ro.pao.model;

// Requirement 1
public sealed class Reptile permits Snake {

    static Double speed() {
        return 10.d;
    }

}
