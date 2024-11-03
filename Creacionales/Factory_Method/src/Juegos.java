public abstract class Juegos {
    int id;
    int importe;

    public Juegos(int id, int importe){
        this.importe = importe;
        this.id = id;
    }

    //Se encarga de calcular el precio
    public abstract void getPrecio();
}
