package ua.javarush.module1.project;

import java.util.HashMap;
import java.util.Map;

public class CaesarCiphers {
    private final Map<String, CaesarCipher> typeOfCaesarCipher = new HashMap<>();
    {
        typeOfCaesarCipher.put("UA", CaesarCipher.getCeasarChipherForUA());
    }

    public CaesarCipher getCipher(String type){
        return typeOfCaesarCipher.getOrDefault(type, new CaesarCipher(new char[]{}));
    }
}
