package moves;

import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE,90,100);
    }

    private boolean track;

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {

    }

    @Override
    protected String describe() {
        if (track) return "Ударил с x2 силой";
        else return "Ударил с обычной силой";
    }
}
