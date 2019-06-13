package fiuba.algo3.tp2.Entidad.Materiales;

import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPiedra {

    @Test
    public void test01PiedraEsGolpeadaPorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test02PiedraEsGolpeadaPorHachaDeMetal(){
        Material metal = new Metal();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(metal);
        hacha.usarContra(metal);

        assertEquals(30,piedra.durabilidad());

    }

    @Test
    public void test03PiedraEsGolpeadaPorHachaDeMadera(){
        Material madera = new Madera();
        Material piedra = new Piedra();
        Hacha hacha = new Hacha(piedra);
        hacha.usarContra(piedra);

        assertEquals(30,piedra.durabilidad());

    }
}