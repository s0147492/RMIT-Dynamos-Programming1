import java.util.Arrays;
import java.util.Random;

public class MonsterBattleStats {

    private int speed;
    private int armour;
    private Attack[] attacks;

    public MonsterBattleStats(Random random) {
        speed = random.nextInt(100);
        armour = random.nextInt(100);
        attacks = new Attack[]{
                new Attack(random),
                new Attack(random),
                new Attack(random),
                new Attack(random)
        };
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmour() {
        return armour;
    }

    public Attack[] getAttacks() {
        return attacks;
    }

    @Override
    public String toString() {
        return "MonsterBattleStats{" +
                "speed=" + speed +
                ", armour=" + armour +
                ", attacks=" + Arrays.toString(attacks) +
                '}';
    }
}
