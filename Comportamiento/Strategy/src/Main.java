// Patrón Strategy.
//En una plataforma de streaming de películas se desea consultar el catálogo. Sin
//embargo hay diferentes situaciones que podrían llevar a qué el sea filtrado de diferentes
//formas, un ejemplo de ello es cuando la cuenta que está usando el sistema pertenece a
//un niño. En este caso el catálogo solo debe mostrar películas que no sean para
//mayores de 13 años.
//Utilizando el patrón strategy defina una estrategia general que retorne el catálogo
//completo y luego una estrategia para niños que filtra las películas por edad.
//Escriba en consola el listado implementando la estrategia para tod_o el catálogo. Luego
//imprima el listado usando la estrategia para menores de 13.
//Finalmente, implemente una tercera estrategia que retorne el catálogo de películas para
//menores de 18 años. Compruebe el resultado en consola.
public class Main {
    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();
        plataforma.setEstrategia(new StrategyGeneral());
        plataforma.listarPelis();

        plataforma.setEstrategia(new StrategyMenores());
        plataforma.listarPelis();

        plataforma.setEstrategia(new StrategyMayores());
        plataforma.listarPelis();

    }
}