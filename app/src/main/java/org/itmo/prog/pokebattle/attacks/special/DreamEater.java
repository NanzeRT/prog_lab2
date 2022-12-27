package org.itmo.prog.pokebattle.attacks.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
    public DreamEater() {
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        if (pokemon.getCondition() != Status.SLEEP)
            return false;
        return super.checkAccuracy(pokemon, pokemon1);
    }

    @Override
    protected String describe() {
        return "разводит тараканов в голове соперника";
    }
}
