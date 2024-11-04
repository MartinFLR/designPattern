import java.util.ArrayList;

public class StrategyMayores implements Strategy{

    public ArrayList<Peliculas> listarPeliculas(ArrayList<Peliculas> pelis) {
        ArrayList<Peliculas> paraMayores = new ArrayList<>();
        System.out.println("Listando peliculas para mayores");
        for (Peliculas peli : pelis) {
            if (peli.getEdadMinima() > 18){
                System.out.println(peli.getNombre() + " "+peli.getEdadMinima());
                paraMayores.add(peli);
            }
        }
        return paraMayores;
    }
}
