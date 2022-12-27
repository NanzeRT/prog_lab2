package org.itmo.prog.pokebattle.pokemons;

import org.itmo.prog.pokebattle.attacks.special.Snarl;
import org.itmo.prog.pokebattle.attacks.status.PoisonGas;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Stunky extends Pokemon {
    public Stunky(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(63, 63, 47, 41, 41, 74);
        setMove(new PoisonGas(), new Snarl());
    }
}
