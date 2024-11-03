public interface Observable {
    void subscribirse(Observer observer);
    void desuscribirse(Observer observer);
    void notificar();
}
