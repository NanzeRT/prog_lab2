package org.itmo.prog.pokebattle.attacks.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import java.util.EnumSet;

public class Refresh extends StatusMove {
    public Refresh() {
        super(Type.ICE, 0, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (EnumSet.of(Status.PARALYZE, Status.POISON, Status.BURN).contains(pokemon.getCondition())) {
            pokemon.setCondition(new Effect());
        }
    }

    @Override
    protected String describe() {
        return "присаживается, чтобы задуматься о своей жизни";
    }
}
