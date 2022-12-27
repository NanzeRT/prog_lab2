package org.itmo.prog.pokebattle.attacks.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonGas extends StatusMove {
    public PoisonGas() {
        super(Type.POISON, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
    }

    @Override
    protected String describe() {
        return "пукнул";
    }
}
