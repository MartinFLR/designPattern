public class ContadorCompartido {
    private int numero = 0;

    public synchronized void incrementoUno(){
        this.numero = this.numero + 1 ;
        System.out.println("Se ha incrementado en 1");
    }

    public synchronized void restarUno(){
        this.numero = this.numero - 1 ;
        System.out.println("Se ha restado en 1");
    }

    public synchronized void getNumero() {
        System.out.println("Numero actual: "+ numero);
    }
}
