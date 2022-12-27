package org.itmo.prog.pokebattle.attacks.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double damage) {
        if (pokemon.getCondition() == Status.POISON) {
            damage *= 2;
        }

        super.applyOppDamage(pokemon, damage);
    }

    @Override
    protected String describe() {
        return "опрокидывает резервуар с ядом на соперника";
    }
}
