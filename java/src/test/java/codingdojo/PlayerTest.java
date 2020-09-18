package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    @Disabled
    void damageCalculationsWithMocks() {
        Inventory inventory = mock(Inventory.class);
        final Equipment equipment = mock(Equipment.class);
        final Item item = mock(Item.class);
        given(item.getBaseDamage()).willReturn(10);
        given(item.getDamageModifier()).willReturn(1.0f);
        given(equipment.getLeftHand()).willReturn(item);
        given(equipment.getRightHand()).willReturn(item);
        given(equipment.getChest()).willReturn(item);
        given(equipment.getFeet()).willReturn(item);
        given(equipment.getHead()).willReturn(item);

        given(inventory.getEquipment()).willReturn(equipment);

        Stats stats = mock(Stats.class);
        SimpleEnemy target = mock(SimpleEnemy.class);
        given(target.getArmor()).willReturn(mock(Armor.class));

        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(250, damage.getAmount());
    }

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
}
