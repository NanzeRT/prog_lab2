package org.itmo.prog.pokebattle.attacks.status;

import org.itmo.prog.pokebattle.utilities.EffectHelper;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Haze extends StatusMove {
    public Haze() {
        super(Type.ICE, 0, 0);
    }

    private final static EffectHelper effectHelper = new EffectHelper();

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        effectHelper.clearAllStatModifiers(pokemon);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        effectHelper.clearAllStatModifiers(pokemon);
    }

    @Override
    protected String describe() {
        return "классно дунул, в тумане затерялись все эффекты";
    }
}
