import java.util.ArrayList;

public class StrategyGeneral implements Strategy{
    @Override
    public ArrayList<Peliculas> listarPeliculas(ArrayList<Peliculas> pelis) {
        System.out.println("Listando todas las peliculas");
        for (Peliculas peli : pelis) {
            System.out.println(peli.getNombre() + " "+peli.getEdadMinima());
        }
        return pelis;
    }
}
