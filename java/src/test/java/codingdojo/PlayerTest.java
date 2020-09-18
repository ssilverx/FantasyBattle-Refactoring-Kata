package codingdojo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void damageCalculations() {
        final BasicItem item = new BasicItem("any-name", 5, 3.0f);
        final Equipment equipment = new Equipment(item, item, item, item, item);
        Inventory inventory = new Inventory(equipment);
        Stats stats = new Stats(0);
        SimpleEnemy target = new SimpleEnemy(new SimpleArmor(4), List.of());
        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(371, damage.getAmount());
    }

    @Test
    void damageCalculationsWithRing() {
        final BasicItem item = new BasicItem("any-name", 5, 3.0f);
        final Equipment equipment = new Equipment(item, item, item, item, item, item);
        Inventory inventory = new Inventory(equipment);
        Stats stats = new Stats(0);
        SimpleEnemy target = new SimpleEnemy(new SimpleArmor(4), List.of());
        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(536, damage.getAmount());
    }
}
