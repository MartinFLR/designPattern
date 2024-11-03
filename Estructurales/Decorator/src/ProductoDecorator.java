public class ProductoDecorator extends Producto{
    protected Producto decoradoProducto;

    public ProductoDecorator(Producto producto){
        this.decoradoProducto = producto;
    }

    @Override
    public String getPrecio() {
        return decoradoProducto.getPrecio();
    }
}
