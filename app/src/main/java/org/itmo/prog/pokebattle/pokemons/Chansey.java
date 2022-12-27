package org.itmo.prog.pokebattle.pokemons;

import org.itmo.prog.pokebattle.attacks.special.MudBomb;

public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        setStats(250, 5, 5, 35, 105, 50);
        addMove(new MudBomb());
    }
}
