package Personal.Warriors;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    Warrior w1 = new Warrior("Tom", 10, 100);
    Warrior w2 = new Warrior("Bob", 20, 100);
    Warrior w3 = new Warrior("Chad"); // Strength = 10 ... Health = 200
    Warrior w4 = new Warrior("Bill", 50, 1000);

    @Test
    public void isAlive(){
        assertTrue(w1.healthLevel > 0);
    }

    @Test
    public void smite() {
        assertTrue(w1.smite(w2) == 90);
    }

    @Test
    public void equals() {
        assertFalse(w1.equals(w2));
    }

    /*@Test
    public void String() {
        assertTrue(w1.equals(w1.name + " - Strength: " + w1.strength + ", Health: " + w1.healthLevel));
    }*/

    @Test
    public void fight() {
        assertTrue(Warrior.fight(w1, w2) == w2);
    }

    @Test
    public void tournament() {
        assertTrue(Warrior.fight(Warrior.fight(w1,w2), Warrior.fight(w3,w4)) == w4);
    }
}