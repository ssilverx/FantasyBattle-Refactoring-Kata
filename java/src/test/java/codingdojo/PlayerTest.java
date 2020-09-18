package codingdojo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class PlayerTest {

    @Test
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

    // choose this one if you are not familiar with mocks
    @Disabled("Test is not finished yet")
    @Test
    void damageCalculations() {
        Inventory inventory = new Inventory(null);
        Stats stats = new Stats(0);
        SimpleEnemy target = new SimpleEnemy(null, null);
        Damage damage = new Player(inventory, stats).calculateDamage(target);
        assertEquals(10, damage.getAmount());
    }
}
