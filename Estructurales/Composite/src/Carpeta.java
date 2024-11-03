import java.util.ArrayList;

public class Carpeta extends  Elemento{

    ArrayList<Elemento> listaElementos = new ArrayList<>();

    public Carpeta(String nombre){
        this.nombre = nombre;
    }

    public void agregarElemento(Elemento elemento){
        listaElementos.add(elemento);
    }
    public void removerElemento(Elemento elemento){
        listaElementos.remove(elemento);
    }

    @Override
    public Boolean esCarpeta() {
        return true;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(nombre);
        System.out.println(esCarpeta());
        for (Elemento listaElemento : listaElementos) {
            listaElemento.mostrarDetalle();
        }
    }
}
