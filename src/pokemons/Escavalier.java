package pokemons;

import ru.ifmo.se.pokemon.*;

public class Escavalier extends Karrablast{
    public Escavalier(String name, int level) {
        super(name, level);
        setStats(70,135,105,60,105,20);
        setType(Type.BUG,Type.STEEL);
        setMove();
    }
}
