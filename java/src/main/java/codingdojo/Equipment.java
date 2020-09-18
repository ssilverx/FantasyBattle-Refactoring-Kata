package codingdojo;


class Equipment {
    private Item leftHand;
    private Item rightHand;
    private Item head;
    private Item feet;
    private Item chest;
    private Item ring;

    Equipment(Item leftHand, Item rightHand, Item head, Item feet, Item chest) {
        this(leftHand, rightHand, head, feet, chest, new BasicItem("", 0, 0.0f));
    }

    public Equipment(Item leftHand, Item rightHand, Item head, Item feet, Item chest, Item ring) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.head = head;
        this.feet = feet;
        this.chest = chest;
        this.ring = ring;
    }

    int getBaseDamage() {
        return this.leftHand.getBaseDamage() +
        this.rightHand.getBaseDamage() +
        this.head.getBaseDamage() +
        this.feet.getBaseDamage() +
        this.chest.getBaseDamage() +
        this.ring.getBaseDamage();
    }

    float getDamageModifier(Stats stats) {
        float strengthModifier = stats.modifier();
        return strengthModifier +
            this.leftHand.getDamageModifier() +
            this.rightHand.getDamageModifier() +
            this.head.getDamageModifier() +
            this.feet.getDamageModifier() +
            this.chest.getDamageModifier() +
            this.ring.getDamageModifier();
    }
}
