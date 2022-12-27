package org.itmo.prog.pokebattle.pokemons;

import org.itmo.prog.pokebattle.attacks.special.DreamEater;
import org.itmo.prog.pokebattle.attacks.status.Refresh;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(100, 5, 5, 15, 65, 30);
        setMove(new DreamEater(), new Refresh());
    }
}
