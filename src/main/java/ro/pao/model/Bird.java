package ro.pao.model;

// Requirement 1
public sealed class Bird permits Emu {

    static Double speed() {
        return 30.d;
    }

}
