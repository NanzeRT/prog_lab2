package org.itmo.prog.pokebattle.attacks.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class PoisonSting extends PhysicalMove {
    private static final double poisonChance = 0.3;

    public PoisonSting() {
        super(Type.POISON, 15, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Random rnd = new Random();
        if (rnd.nextDouble() < poisonChance)
            Effect.poison(pokemon);
    }

    @Override
    protected String describe() {
        return "тыкает соперника колючками";
    }
}
