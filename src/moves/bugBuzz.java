package moves;
// Готов
import ru.ifmo.se.pokemon.*;

public class bugBuzz extends SpecialMove {
    public bugBuzz() {
        super(Type.BUG, 90, 100);
    }

    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    protected String describe(){
        return "Bug Buzz наносит урон и с 10 процентным шансом снижает Special Defense противнику";
    }
}