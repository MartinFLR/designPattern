import java.util.Random;

public class Jugador extends Thread {
    private int numero;
    private ContadorCompartido contadorCompartido;
    private int tiempo;


    public Jugador(int numero, ContadorCompartido contadorCompartido){
        this.numero = numero;
        this.contadorCompartido = contadorCompartido;
    }


    public void setTiempo(Integer tiempo){
        this.tiempo=tiempo;
    }

    public Integer getTiempo(){
        return this.tiempo;
    }

    @Override
    public void run(){
        Integer sec = 1000;
        System.out.println("Inicia el corredor numero" + this.numero);
        setTiempo(new Random().nextInt(5, 11));
        while(contadorCompartido.getContador()<=this.tiempo){
            try {
                Thread.sleep(sec);
                contadorCompartido.incrementar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Tiempo " + this.tiempo);

    }
}
