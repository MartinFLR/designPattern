public class EstadosUnidos extends ProductoDecorator{

    public EstadosUnidos(Producto producto) {
        super(producto);
    }

    @Override
    public String getPrecio() {
        return  "$USD "+decoradoProducto.getPrecio() ;
    }
}
