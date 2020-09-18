package codingdojo;

public class Stats {
    private int strength;
    private int dexterity;

    public Stats(int strength) {
        this.strength = strength;
    }

    public Stats(int strength, int dexterity) {
        this.strength = strength;
        this.dexterity = dexterity;
    }

    float modifier() {
        return strength * 0.1f + 0.05f * dexterity;
    }
}
