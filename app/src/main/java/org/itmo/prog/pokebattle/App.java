package org.itmo.prog.pokebattle;

import ru.ifmo.se.pokemon.Battle;

public class App {

    private static PokemonFactory factory = new PokemonFactory();
    private static Battle battle = new Battle();

    public static void main(String[] args) {
        battle.addAlly(factory.getRandomPokemon());
        battle.addAlly(factory.getRandomPokemon());
        battle.addAlly(factory.getRandomPokemon());
        battle.addAlly(factory.getRandomPokemon());
        battle.addFoe(factory.getRandomPokemon());
        battle.addFoe(factory.getRandomPokemon());
        battle.addFoe(factory.getRandomPokemon());
        battle.addFoe(factory.getRandomPokemon());
        battle.go();
    }
}
