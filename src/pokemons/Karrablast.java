package pokemons;

import ru.ifmo.se.pokemon.*;

public class Karrablast extends Pokemon {
    public Karrablast(String name, int level){
        super(name,level);
        setStats(50,75,45,40,45,60);
        setType(Type.BUG);
        setMove();
    }
}
