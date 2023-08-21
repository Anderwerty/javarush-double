package ua.javarush.module1.project;

import java.util.Map;

public class CaesarAlphabetaSwitcher {
    //keyToValue, keyByValue, keyWithValue
    private final Map<String, CaesarCipher> languageToCipher;

    public CaesarAlphabetaSwitcher(Map<String, CaesarCipher> languageToCipher) {
        this.languageToCipher = languageToCipher;
    }

    public CaesarCipher getCipher(String language){
        return languageToCipher.getOrDefault(language, null);
    }
}
