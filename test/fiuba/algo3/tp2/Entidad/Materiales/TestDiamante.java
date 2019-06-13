package fiuba.algo3.tp2.Entidad.Materiales;
import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.Herramienta.Pico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDiamante {
    @Test
    public void test01DiamanteEsGolpeadoPorHachaDeMadera(){
        Material diamante = new Diamante();
        Material madera = new Madera();
        Hacha hacha = new Hacha(madera);
        hacha.usarContra(diamante);

        assertEquals(100,diamante.durabilidad());

    }
    @Test
    public void test02DiamanteEsGolpeadoPorPicoDePiedra(){
        Material diamante = new Diamante();
        Material piedra = new Piedra();
        Pico pico = new Pico(piedra);
        pico.usarContra(diamante);

        assertEquals(100,diamante.durabilidad());

    }
    @Test
    public void test03DiamanteEsGolpeadoPorPicoFino(){
        Material diamante = new Diamante();
        Material piedra = new Piedra();
        Material metal = new Metal();
        Pico pico = new Pico(piedra,metal);
        pico.usarContra(diamante, true);

        assertEquals(80,diamante.durabilidad());

    }
}
