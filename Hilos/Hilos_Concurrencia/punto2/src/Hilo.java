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
            //System.out.println("Hola desde el hilo: "+ numHilo);
            this.contadorCompartido.incrementoUno();
            this.contadorCompartido.getNumero();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
