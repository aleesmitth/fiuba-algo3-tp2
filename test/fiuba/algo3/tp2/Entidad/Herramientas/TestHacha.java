package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Herramienta.Hacha;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.Constructor;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.Entidad.Materiales.Piedra;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * faltaria hacer la implementacion de las destrucciones de las herramientas, tiran excepciones y printean el mensaje
 * pero no esta implementado el sistema de destruccion.
 */

public class TestHacha {

    @Test
    public void test01ArmarHachaDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Hacha hachaConstruida = constructor.construirHacha(madera);

        assertEquals(2, hachaConstruida.fuerza());
        assertEquals(100, hachaConstruida.durabilidad());
    }

    @Test
    public void test02ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Hacha hachaConstruida = constructor.construirHacha(metal);

        assertEquals(10, hachaConstruida.fuerza());
        assertEquals(400, hachaConstruida.durabilidad());
    }

    @Test
    public void test03HachaDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Material piedra = new Piedra();
        Material metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(madera);

        hachaConstruida.usarContra(madera);
        assertEquals(98, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(98, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(98, hachaConstruida.durabilidad());
    }

    @Test
    public void test04HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(piedra);

        hachaConstruida.usarContra(madera);
        assertEquals(195, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(195, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(195, hachaConstruida.durabilidad());
    }

    @Test
    public void test05HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Hacha hachaConstruida = constructor.construirHacha(metal);

        hachaConstruida.usarContra(madera);
        assertEquals(395, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(395, hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(395, hachaConstruida.durabilidad());
    }
}

