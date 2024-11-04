public class Peliculas {
    private int edadMinima;
    private String nombre;

    public Peliculas(int edadMinima,String nombre){
        this.edadMinima = edadMinima;
        this.nombre = nombre;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getNombre() {
        return nombre;
    }
}
