package org.itmo.prog.pokebattle;

import org.itmo.prog.pokebattle.pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.Random;

public class PokemonFactory {
    Random rnd = new Random();

    String[] names = {"CUMмунист", "артем", "Мак♂semen♂", "♂️БогDUNGEON♂️", "ДимAss", "꧁☬✞ℂℋℰℛℛᎽ✞☬꧂", "CUMбала", "FullMaster", "АлексанDoor", "яроSLAVE", "♂️ВячеSlave♂️", "Евgayний", "iVAN", "Святоslave", "Сэрgay", "WeeТалий", "Никита", "анASSтASSия", "♂️вASSилий♂️", "GAYоргий", "Cumеньщик", "Maksemen", "Стass", "CepGAY", "Cumпот", "Semён", "ТимоFisting", "Naomi", "Gachimuchi", "Дanal", "CUMар", "♂️Cumень♂️", "Павweeл", "ВячеSLAVE", "ВоVan", "Cumпенсация", "CUMарик", "Jabroni", "Van", "ВAssилий", "GlebASS", "ВЯЧЕ𝕊ᒪ𝐀𝚅𝔼", "Cumарик", "Вова", "Cumстантин", "Gayральд", "CUMпост", "ИVan", "CUMандир", "CUMила", "diMAN", "♂Leatherman♂", "V♂️vchik", "♂️ЮрAss♂️", "Cumилла", "Степан", "Danislave", "РомASS", "НикитASS", "FullArtemAss", "Харуко", "MoommeN", "Бог_просто_Бог", "Данил", "·.·icecremvashik·.·", "SweetAssLove", "T0b1", "ГлебASS", "Cumыш", "Орхanus", "Атайcheek", "Топ♂️AZZ♂️", "Оксанус", "АртеMoon♂️", "ДоброSlave", "Глеб", "СтаниSlave", "Gayоргий", "СпецнASS", "Vanерий", "Сassа"};

    public Pokemon getRandomPokemon() {
        var name = getRandomName();
        var level = rnd.nextInt(35, 50);
        var idx = rnd.nextInt(6);

        return switch (idx) {
            case 0 -> new Blissey(name, level);
            case 1 -> new Chansey(name, level);
            case 2 -> new Happiny(name, level);
            case 3 -> new Skuntank(name, level);
            case 4 -> new Stunky(name, level);
            case 5 -> new Qwilfish(name, level);
            default -> throw new IndexOutOfBoundsException();
        };
    }

    private String getRandomName() {
        return names[rnd.nextInt(names.length)];
    }
}
