public class Hilo implements Runnable{
    private int numHilo = 0;
    private ContadorCompartido contadorCompartido;

    public Hilo (ContadorCompartido contadorCompartido, int numHilo){
        this.contadorCompartido = contadorCompartido;
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            this.contadorCompartido.incrementoUno();
            System.out.println("Se ha incrementado en 1");
            System.out.println("Numero actual: "+ this.contadorCompartido.getNumero());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
