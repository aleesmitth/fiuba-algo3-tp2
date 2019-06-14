package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Herramienta.Pico;
import fiuba.algo3.tp2.Entidad.MesaDeCrafteo.Constructor;
import fiuba.algo3.tp2.Entidad.Materiales.*;

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

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(madera);
        assertEquals(100, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(98, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(98, picoConstruido.durabilidad());
        picoConstruido.usarContra(diamante);
        assertEquals(98, picoConstruido.durabilidad());

    }

    @Test
    public void test06PicoDeMaderaSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(madera);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test07PicoDeMaderaSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(piedra);
        assertEquals(98, picoConstruido.durabilidad());

    }

    @Test
    public void test08PicoDeMaderaSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(metal);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test09PicoDeMaderaSeUsaContraDiamanteYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Diamante diamante = new Diamante();

        Pico picoConstruido = constructor.construirPico(madera);

        picoConstruido.usarContra(diamante);
        assertEquals(100, picoConstruido.durabilidad());
    }

    @Test
    public void test10PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        int desgaste = (int) (5 / 1.5);
        int primerDesgasteReal = (200 - desgaste);
        int segundoDesgasteReal = (primerDesgasteReal - desgaste);

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(madera);
        assertEquals(200, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(primerDesgasteReal, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(segundoDesgasteReal, picoConstruido.durabilidad());
        picoConstruido.usarContra(diamante);
        assertEquals(segundoDesgasteReal, picoConstruido.durabilidad());

    }

    @Test
    public void test11PicoDePiedraSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(madera);
        assertEquals(200, picoConstruido.durabilidad());
    }

    @Test
    public void test12PicoDePiedraSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(piedra);
        assertEquals(197, picoConstruido.durabilidad());

    }

    @Test
    public void test13PicoDePiedraSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(metal);
        assertEquals(197, picoConstruido.durabilidad());
    }

    @Test
    public void test14PicoDePiedraSeUsaContraDiamanteYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Diamante diamante = new Diamante();

        Pico picoConstruido = constructor.construirPico(piedra);

        picoConstruido.usarContra(diamante);
        assertEquals(200, picoConstruido.durabilidad());
    }

    @Test
    public void test15PicoDeMetalSeUsaContraCadaMaterialYNoReduceSuDurabilidadSoloSeRompeAlDecimoUsoContraPiedra() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(madera);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(diamante);
        assertEquals(400, picoConstruido.durabilidad());
        /*cuenta un solo uso , por la piedra*/
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        assertEquals(0, picoConstruido.durabilidad());
    }

    @Test
    public void test16PicoDeMetalSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(madera);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test17PicoDeMetalSeUsaContraPiedraYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test18PicoDeMetalSeUsaContraPiedraYSeRompeAlDecimoUso(){
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(piedra);
        assertEquals(400, picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        picoConstruido.usarContra(piedra);
        assertEquals(0, picoConstruido.durabilidad());
    }

    @Test
    public void test19PicoDeMetalSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(metal);
        assertEquals(400, picoConstruido.durabilidad());
    }

    @Test
    public void test20PicoDeMetalSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Diamante diamante = new Diamante();

        Pico picoConstruido = constructor.construirPico(metal);

        picoConstruido.usarContra(diamante);
        assertEquals(400, picoConstruido.durabilidad());
    }


    @Test
    public void test21PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Diamante diamante = new Diamante();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(900, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(810, picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante, true);
        assertEquals(729, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test22PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(madera,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test23PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(piedra, true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }

    @Test
    public void test24PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Piedra piedra = new Piedra();

        Pico picoFinoConstruido = constructor.construirPico(metal, piedra);

        picoFinoConstruido.usarContra(metal,true);
        assertEquals(1000, picoFinoConstruido.durabilidad());
    }
}