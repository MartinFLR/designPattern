public class Reportero implements Observer{
    private SistemaMetereologico observable; // Cambia Observable a SistemaMetereologico

    public Reportero(SistemaMetereologico observable) {
        this.observable = observable;
        this.observable.subscribirse(this); // Suscribirse al observable
    }

    @Override
    public void actualizar() {
        // Acceder al método que devuelve el estado del clima
        System.out.println("Ha cambiado el clima a : " + this.observable.getEstadoClima());
    }
}
