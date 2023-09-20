package Productor_Consumidor;

public class Song {
    private String name;
    private int len;

    public Song(String name, int len) {
        this.name = name;
        this.len = len;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }
}
