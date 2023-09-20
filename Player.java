package Productor_Consumidor;

import java.util.concurrent.ArrayBlockingQueue;

public class Player implements Runnable {
    private final ArrayBlockingQueue<Song> buffer;
    private int amount;

    public Player(ArrayBlockingQueue<Song> buffer, int amount) {
        this.buffer = buffer;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < amount; i++) {
                // Producir un elemento
                Song elemento = new Song("Canción: " + i, 100 + i);
                System.out.println("Productor produce: " + elemento.getName());

                // Colocar el elemento en el buffer
                buffer.put(elemento);

                Thread.sleep(100); // Simular producción
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
