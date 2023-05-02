package ro.pao.model;

// Requirement 1
public sealed class Mammal permits Bear, Wolf {

    static Double speed() {
        return 50.d;
    }

}
