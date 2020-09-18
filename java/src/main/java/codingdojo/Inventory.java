package codingdojo;

public class Inventory {
    private Equipment equipment;

    public Inventory(Equipment equipment) {
        this.equipment = equipment;
    }

    int calculateDamage() {
        return equipment.getBaseDamage();
    }

    float calculateDamageModifier(int strength) {
        return equipment.getDamageModifier(strength);
    }
}
