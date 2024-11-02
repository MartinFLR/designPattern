public class HiloRestador implements Runnable{
    private int numHilo = 0;
    private ContadorCompartido contadorCompartido;

    public HiloRestador (ContadorCompartido contadorCompartido, int numHilo){
        this.contadorCompartido = contadorCompartido;
        this.numHilo = numHilo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            //System.out.println("hola desde el hilo restador: "+ numHilo);
            contadorCompartido.restarUno();
            contadorCompartido.getNumero();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
