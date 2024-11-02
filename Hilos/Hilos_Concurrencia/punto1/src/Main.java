
public class Main {
    public static void main(String[] args) {

        Thread[] hilos = new Thread[6];

        for (int i = 0; i < 6; i++) {
            final int id = i + 1; // Capturamos el identificador del hilo
            hilos[i] = new Thread(() -> {
                try {
                    // Esperar un tiempo proporcional al identificador del hilo
                    Thread.sleep(id * 1000); // Esperar id segundos
                    System.out.println("Hola Mundo desde el hilo " + id);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
                    System.out.println("El hilo " + id + " fue interrumpido.");
                }
            });
            hilos[i].start(); // Iniciar el hilo
        }

        for (Thread hilo : hilos) {
            try {
                hilo.join(); // Esperar a que el hilo termine
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
                System.out.println("El hilo principal fue interrumpido.");
            }
        }

        System.out.println("Fin del programa principal.");
    }
}


