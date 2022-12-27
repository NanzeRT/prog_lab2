package org.itmo.prog.pokebattle.attacks.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.Random;

public class MudBomb extends SpecialMove {
    private static final double loweringAccuracyChance = 0.3;

    public MudBomb() {
        super(Type.GROUND, 65, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        var rnd = new Random();
        if (rnd.nextDouble() < loweringAccuracyChance)
            pokemon.setMod(Stat.ACCURACY, -1);
    }

    @Override
    protected String describe() {
        return "смешивает соперника с грязью";
    }
}
