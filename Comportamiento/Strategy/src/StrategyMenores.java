import java.util.ArrayList;

public class StrategyMenores implements Strategy{
    @Override
    public ArrayList<Peliculas> listarPeliculas(ArrayList<Peliculas> pelis) {
        ArrayList<Peliculas> paraMenores = new ArrayList<>();
        System.out.println("Listando peliculas para menores");
        for (Peliculas peli : pelis) {
            if (peli.getEdadMinima() < 13){
                System.out.println(peli.getNombre() + " "+peli.getEdadMinima());
                paraMenores.add(peli);
            }
        }
        return paraMenores;
    }
}
