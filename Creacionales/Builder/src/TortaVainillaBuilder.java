public class TortaVainillaBuilder implements  Builder{

    private TortaVainilla tortaVainilla;

    public TortaVainillaBuilder(){
        this.reset();
    }

    public TortaVainilla build() {
        TortaVainilla result = tortaVainilla;
        this.reset(); // Resetea para la próxima construcción
        return result;

    }

    @Override
    public void reset() {
        this.tortaVainilla = new TortaVainilla();
    }

    @Override
    public void ponerLeche(int cantLeche) {
        this.tortaVainilla.setCantLeche(cantLeche);
    }

    @Override
    public void ponerHarina(int cantHarina) {
        this.tortaVainilla.setCantHarina(cantHarina);
    }

    @Override
    public void ponerHuevo(int cantHuevo) {
        this.tortaVainilla.setCantHuevo(cantHuevo);
    }

    @Override
    public void ponerRelleno(String relleno) {
        this.tortaVainilla.setRelleno("Vainilla");
    }

    public void setCantExtractoVainilla(int cantExtractoVainilla) {
        this.tortaVainilla.setCantExtractoVainilla(cantExtractoVainilla);
    }

}
