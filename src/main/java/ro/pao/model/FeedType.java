package ro.pao.model;

// Requirement 12 + 13
public sealed interface FeedType permits Carnivore, Herbivore, Omnivore {

    String consumption();

}
