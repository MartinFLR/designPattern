public class JuegoDigital extends Juegos  {
    Plataforma plataforma;

    public JuegoDigital(int id,int importe,String plataforma){
        super(id,importe);
        this.plataforma = Plataforma.valueOf(plataforma);
    }

    @Override
    public void getPrecio() {
        double precioFinal;
        switch (plataforma){
            case EpicGames -> {
                precioFinal = importe * 1000;
            }
            case Sony -> {
                precioFinal = importe * 2000;
            }
            case Xbox -> {
                precioFinal = importe * 3000;
            }

            default -> throw new IllegalStateException("Unexpected value: " + plataforma);
        }
        System.out.println("El precio final es: "+ precioFinal);
    }
}

