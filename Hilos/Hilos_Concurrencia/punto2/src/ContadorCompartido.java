public class ContadorCompartido {
    private int numero = 0;

    public void incrementoUno(){
        this.numero = this.numero + 1 ;
    }

    public synchronized int getNumero() {
        return numero;
    }
}
