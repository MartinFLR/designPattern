public class JuegoFisico extends Juegos{
    int precioTraslado;

    public JuegoFisico(int id,int importe,int precioTraslado){
        super(id,importe);
        this.precioTraslado=precioTraslado;
    }

    @Override
    public void getPrecio() {
    double precioFinal = importe * precioTraslado;
        System.out.println("El precio final es: "+ precioFinal);
    }
}
