package ua.javarush.module1.project;

public class CaesarCipher {
    private static final char[] UA_ALPHABET =  {'a','б'};

    private final char[] symbols; // List<Character>, String

    public CaesarCipher(char[] symbols) {
        this.symbols = symbols;
    }

    public static CaesarCipher getCeasarChipherForUA(){
        return new CaesarCipher(UA_ALPHABET);
    }

    public String encode(String text, int key) {
        throw new UnsupportedOperationException();
    }

    public String decode(String text, int key) {
        throw new UnsupportedOperationException();
    }

    // hint encoder and decoder
}
