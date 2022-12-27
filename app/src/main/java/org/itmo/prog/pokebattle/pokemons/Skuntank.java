package org.itmo.prog.pokebattle.pokemons;

import org.itmo.prog.pokebattle.attacks.physical.PoisonJab;

public class Skuntank extends Stunky {
    public Skuntank(String name, int level) {
        super(name, level);
        setStats(103, 93, 67, 71, 61, 84);
        addMove(new PoisonJab());
    }
}
