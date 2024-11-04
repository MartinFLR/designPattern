import java.util.ArrayList;

public class Plataforma {
    private Strategy estrategia;
    private ArrayList<Peliculas> listaPeliculas;
    private ArrayList<Peliculas> listaResultante;

    public void setEstrategia(Strategy estrategia) {
        this.estrategia = estrategia;
        this.listaPeliculas = new ArrayList<>();
        llenarPelis();
    }

    public void listarPelis(){
        this.listaResultante = this.estrategia.listarPeliculas(listaPeliculas);
    }

    public void llenarPelis(){
        for (int i = 0; i < 20; i++) {
            Peliculas pelicula = new Peliculas(8+i,"aldo"+i);
            listaPeliculas.add(pelicula);
        }
    }
}
