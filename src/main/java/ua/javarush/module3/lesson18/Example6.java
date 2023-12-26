package ua.javarush.module3.lesson18;

public class Example6 {
}

class Client {
    private int id;
    private String name;
    private String surname;
    //.. other field
}

class UpdatePair<V> {
    private V value;
    private boolean isChanged;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public boolean isChanged() {
        return isChanged;
    }

    public void setChanged(boolean changed) {
        isChanged = changed;
    }
}

class ClientUpdate {
    private int id;
    private UpdatePair<String> name;
    private UpdatePair<String> surname;
}

interface ClientRepository{
    // method

    void update(ClientUpdate clientUpdate);
}
