package org.itmo.prog.pokebattle.pokemons;

import org.itmo.prog.pokebattle.attacks.physical.AquaTail;
import org.itmo.prog.pokebattle.attacks.physical.PoisonSting;
import org.itmo.prog.pokebattle.attacks.physical.Waterfall;
import org.itmo.prog.pokebattle.attacks.status.Haze;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Qwilfish extends Pokemon {
    public Qwilfish(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(65, 95, 85, 55, 55, 85);
        setMove(new Waterfall(), new Haze(), new PoisonSting(), new AquaTail());
    }
}
