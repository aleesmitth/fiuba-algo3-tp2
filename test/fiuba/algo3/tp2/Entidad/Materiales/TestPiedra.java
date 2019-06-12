package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Herramienta.Hacha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Test;
//import static junit.framework.TestCase.assertEquals;

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