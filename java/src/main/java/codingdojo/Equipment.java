package codingdojo;


class Equipment {
    // TODO add a ring item that may be equipped
    //  that may also add damage modifier
    private Item leftHand;
    private Item rightHand;
    private Item head;
    private Item feet;
    private Item chest;

    Equipment(Item leftHand, Item rightHand, Item head, Item feet, Item chest) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.head = head;
        this.feet = feet;
        this.chest = chest;
    }

    Item getLeftHand() {
        return leftHand;
    }
    Item getRightHand() {
        return rightHand;
    }
    Item getHead() {
        return head;
    }
    Item getFeet() {
        return feet;
    }
    Item getChest() {
        return chest;
    }

    int getBaseDamage() {
        Item leftHand = getLeftHand();
        Item rightHand = getRightHand();
        Item head = getHead();
        Item feet = getFeet();
        Item chest = getChest();
        return leftHand.getBaseDamage() +
        rightHand.getBaseDamage() +
        head.getBaseDamage() +
        feet.getBaseDamage() +
        chest.getBaseDamage();
    }

    float getDamageModifier(int strength) {
        Item leftHand = getLeftHand();
        Item rightHand = getRightHand();
        Item head = getHead();
        Item feet = getFeet();
        Item chest = getChest();
        float strengthModifier = strength * 0.1f;
        return strengthModifier +
            leftHand.getDamageModifier() +
            rightHand.getDamageModifier() +
            head.getDamageModifier() +
            feet.getDamageModifier() +
            chest.getDamageModifier();
    }
}
