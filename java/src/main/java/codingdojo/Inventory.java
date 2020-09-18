package codingdojo;

public class Inventory {
    private Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    int calculateDamage() {
        return equipment.getBaseDamage();
    }

    float calculateDamageModifier(Stats stats) {
        return equipment.getDamageModifier(stats);
    }
}
