package fiuba.algo3.tp2.modelo.Entidad.Herramientas;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Constructor;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPico {


    @Test
    public void test01ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material madera = new Madera();
        Pico picoConstruido = constructor.construirPico(madera);

        assertEquals(2, picoConstruido.fuerza());
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test02ArmarPicoDePiedraConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material piedra = new Piedra();
        Pico picoConstruido = constructor.construirPico(piedra);

        assertEquals(4, picoConstruido.fuerza());
        assertEquals(200, picoConstruido.durabilidad());
    }

    @Test
    public void test03ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Pico picoConstruido = constructor.construirPico(metal);

        assertEquals(12, picoConstruido.fuerza());
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test04ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes() {
        Constructor constructor = new Constructor();
        Material metal = new Metal();
        Material piedra = new Piedra();
        Pico picoConstruido = constructor.construirPico(metal, piedra);

        assertEquals(20, picoConstruido.fuerza());
        assertEquals(1000, picoConstruido.durabilidad());
    }

    @Test
    public void test05PicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(madera);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(100, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(98, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(98, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(98, picoConstruido.durabilidad());

    }

    @Test
    public void test06PicoDeMaderaSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(madera);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test07PicoDeMaderaSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(madera);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(piedra);
        assertEquals(98, picoConstruido.durabilidad());

    }

    @Test
    public void test08PicoDeMaderaSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(madera);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(metal);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test09PicoDeMaderaSeUsaContraDiamanteYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(madera);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(diamante);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test10PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        int desgaste = (int) (5 / 1.5);
        int primerDesgasteReal = (200 - desgaste);
        int segundoDesgasteReal = (primerDesgasteReal - desgaste);

        Pico picoConstruido = constructor.construirPico(piedra);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(200, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(primerDesgasteReal, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(segundoDesgasteReal, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(segundoDesgasteReal, picoConstruido.durabilidad());

    }

    @Test
    public void test11PicoDePiedraSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(piedra);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(200, picoConstruido.durabilidad());
    }

    @Test
    public void test12PicoDePiedraSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(piedra);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(piedra);
        assertEquals(197, picoConstruido.durabilidad());

    }

    @Test
    public void test13PicoDePiedraSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(piedra);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(metal);
        assertEquals(197, picoConstruido.durabilidad());
    }

    @Test
    public void test14PicoDePiedraSeUsaContraDiamanteYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(piedra);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(diamante);
        assertEquals(200, picoConstruido.durabilidad());
    }

    /**
     * Bug guarda cantidad de usos del pico por cada material. ej golpeas 9 veces piedra y 9 veces madera y no se rompe
     * pero si golpeas 10 veces madera si se rompe.
     */

    @Test
    public void test15PicoDeMetalSeUsaContraCadaMaterialYNoReduceSuDurabilidadSoloSeRompeAlDecimoUsoContraPiedra() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(400, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(metal);
        assertEquals(400, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(400, picoConstruido.durabilidad());
        /*cuenta un solo uso , por la piedra*/
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        assertEquals(0, picoConstruido.durabilidad());
    }

    @Test
    public void test16PicoDeMetalSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test17PicoDeMetalSeUsaContraPiedraYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test18PicoDeMetalSeUsaContraPiedraYSeRompeAlDecimoUso(){
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        jugador.usarHerramientaContra(piedra);
        assertEquals(0, picoConstruido.durabilidad());
    }

    @Test
    public void test19PicoDeMetalSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(metal);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test20PicoDeMetalSeUsaContraDiamanteYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();
        Jugador jugador = new Jugador();

        Pico picoConstruido = constructor.construirPico(metal);
        jugador.equiparHerramienta(picoConstruido);

        jugador.usarHerramientaContra(diamante);
        assertEquals(400, picoConstruido.durabilidad());
    }


    @Test
    public void test21PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);
        jugador.equiparHerramienta(picoFinoConstruido);

        jugador.usarHerramientaContra(diamante);
        assertEquals(900, picoFinoConstruido.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(810, picoFinoConstruido.durabilidad());
        jugador.usarHerramientaContra(diamante);
        assertEquals(729, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test22PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);
        jugador.equiparHerramienta(picoFinoConstruido);

        jugador.usarHerramientaContra(madera);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test23PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Jugador jugador = new Jugador();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);
        jugador.equiparHerramienta(picoFinoConstruido);

        jugador.usarHerramientaContra(piedra);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test24PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();
        Jugador jugador = new Jugador();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);
        jugador.equiparHerramienta(picoFinoConstruido);

        jugador.usarHerramientaContra(metal);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }
}