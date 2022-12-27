package org.itmo.prog.pokebattle.attacks.physical;

import java.util.Random;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    private static final double flinchChance = 0.2;

    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opponent) {
        Random rnd = new Random();
        if (rnd.nextDouble() < flinchChance)
            Effect.flinch(opponent);
    }

    @Override
    protected String describe() {
        return "путает соперника с водопадом и всплывает по нему";
    }
}
