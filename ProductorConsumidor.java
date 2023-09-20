package Productor_Consumidor;

import java.util.concurrent.ArrayBlockingQueue;

public class ProductorConsumidor {
    public static void main(String[] args) {
        // Crear un almacén compartido con capacidad para 10 elementos
        ArrayBlockingQueue<Song> buffer = new ArrayBlockingQueue<>(5);

        // Crear hilos productores y consumidores
        Thread productor1 = new Thread(new Player(buffer, 10));
        Thread consumidor1 = new Thread(new Consumidor(buffer, 30));
        Thread consumidor2 = new Thread(new Consumidor(buffer, 11));
        Thread productor2 = new Thread(new Player(buffer, 10));

        // Iniciar los hilos
        productor1.start();
        productor2.start();
        consumidor1.start();
        consumidor2.start();
    }
}
