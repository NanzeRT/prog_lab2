package org.itmo.prog.pokebattle.utilities;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class EffectHelper {
    public void clearAllStatModifiers(Pokemon p) {
        var healthDelta = (int)Math.round(p.getStat(Stat.HP) - p.getHP());
        p.restore();
        p.setMod(Stat.HP, healthDelta);
    }
}
