package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcCriticalHit(pokemon, pokemon1);
    }

    public static boolean isCriticalHit() {
        Random random = new Random();
        return random.nextInt(8) == 0; // 1 из 8 шансов
    }
}
