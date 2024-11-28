package moves;
// Готов
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }

    private boolean flag;

    protected void applyOppDamage(Pokemon p, double damage) {
        Status defStatus = p.getCondition();
        if (defStatus.equals(Status.BURN) || defStatus.equals(Status.POISON) || defStatus.equals(Status.PARALYZE)) {
            p.setMod(Stat.HP, 2 * (int) damage);
            flag = true;
        } else {
            p.setMod(Stat.HP, (int) damage);
            flag = false;
        }
    }

    protected String describe() {
        if (flag) return "Ударил с x2 силой";
        else return "Ударил с обычной силой";
    }
}
