package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Herramienta.Hacha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Test;
//import static junit.framework.TestCase.assertEquals;

public class TestMadera {

    @Test
    public void test01MaderaGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(madera);

        assertEquals(8,madera.durabilidad());

    }

    @Test
    public void test02MaderaGolpeablePorHachaDeMetal(){
        Material metal = new Metal();
        Material madera = new Madera();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(madera);

        assertEquals(0,madera.durabilidad());

    }

    @Test
    public void test03MaderaGolpeablePorHachaDePiedra(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(madera);

        assertEquals(5,madera.durabilidad());

    }
}