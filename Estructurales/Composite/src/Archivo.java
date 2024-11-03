public class Archivo extends Elemento{

    public Archivo(String nombre){
        this.nombre = nombre;
    }
    @Override
    public Boolean esCarpeta() {
        return false;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println(nombre);
        System.out.println(esCarpeta());

    }
}
