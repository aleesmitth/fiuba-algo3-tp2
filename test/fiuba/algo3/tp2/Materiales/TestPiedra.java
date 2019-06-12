package fiuba.algo3.tp2;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Materiales.Madera;
import fiuba.algo3.tp2.Materiales.Material;
import fiuba.algo3.tp2.Materiales.Metal;
import fiuba.algo3.tp2.Materiales.Piedra;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPiedra {

    @Test
    public void test01PiedraGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test02PiedraGolpeablePorHachaDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test03PiedraGolpeablePorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }
}