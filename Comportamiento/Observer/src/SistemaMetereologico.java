import java.util.ArrayList;

public class SistemaMetereologico implements Observable{

    private String estadoClima;
    private ArrayList<Observer> observers = new ArrayList<>();

    public SistemaMetereologico(String estadoClima){
        this.estadoClima = estadoClima;
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public void setEstadoClima(String estadoClima){
        this.estadoClima = estadoClima;
        notificar();
    }

    @Override
    public void subscribirse(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void desuscribirse(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer observer : observers) {
            observer.actualizar();
        }
    }
}
