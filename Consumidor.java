package Productor_Consumidor;

import java.util.concurrent.ArrayBlockingQueue;

class Consumidor implements Runnable {
    private final ArrayBlockingQueue<Song> buffer;
    private int amount;

    public Consumidor(ArrayBlockingQueue<Song> buffer, int amount) {
        this.buffer = buffer;
        this.amount = amount;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < amount; i++) {
                // Tomar un elemento del almacén
                Song elemento = buffer.take();
                System.out.println("Consumidor consume: " + elemento.getName() +
                        " con duración de: " + elemento.getLen() + " segundos.");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}