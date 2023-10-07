package Personal.Warriors;

public class Warrior {

    public String name;
    public int strength;
    public int healthLevel;

    public Warrior(String name, int strength, int healthLevel){
        this.name = name;
        this.strength = strength;
        this.healthLevel = healthLevel;
    }
    public Warrior(String name) {
        this.name = name;
        strength = 10;
        healthLevel = 200;
    }
    public Warrior(Warrior other){
        name = other.name;
        strength = other.strength;
        healthLevel = other.healthLevel;
    }
    public boolean isAlive() {
        if (healthLevel > 0) {
            return true;
        } else {
            return false;
        }
    }
    public int smite(Warrior other) {
        return other.healthLevel -= this.strength;
    }
    public boolean equals(Warrior other) {
        return (this.name.equals(other.name) && this.strength == other.strength);
    }
    public String toString(){
        return name + " - Strength: " + strength + ", Health: " + healthLevel;
    }
    public static Warrior fight(Warrior w1, Warrior w2) {
        int counter = 0;
        while (w1.isAlive() && w2.isAlive()) {
            if (counter % 2 == 0) {
                w1.smite(w2);
            } else {
                w2.smite(w1);
            }
            counter++;
        }
        if (w1.isAlive()) {
            return w1;
        } else {
            return w2;
        }
    }
    public static Warrior tournament(Warrior w1, Warrior w2, Warrior w3, Warrior w4) {
        return fight(fight(w1,w2), fight(w3,w4));
    }
}
