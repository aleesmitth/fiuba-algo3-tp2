package fiuba.algo3.tp2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * faltaria hacer la implementacion de las destrucciones de las herramientas, solo esta considerada la del pico de metal
 * pero no esta implementado el sistema de destruccion.
 */

public class TestsTP2 {

    @Test
    public void test01ArmarHachaDeMaderaConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(madera,modeloDeHacha);

        assertEquals(2,hachaConstruida.fuerza());
        assertEquals(100, hachaConstruida.durabilidad());
    }
    @Test
    public void test02ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Pico modeloDePico= new Pico();
        Pico picoConstruido = (Pico) constructor.construir(madera,modeloDePico);

        assertEquals(2,picoConstruido.fuerza());
        assertEquals(100, picoConstruido.durabilidad());
    }
    @Test
    public void test03ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(metal,modeloDeHacha);

        assertEquals(10,hachaConstruida.fuerza());
        assertEquals(400, hachaConstruida.durabilidad());
    }
    @Test
    public void test04ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        Pico modeloDePico= new Pico();
        Pico picoConstruido = (Pico) constructor.construir(metal,modeloDePico);

        assertEquals(12,picoConstruido.fuerza());
        assertEquals(400, picoConstruido.durabilidad());
    }
    @Test
    public void test05ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoConstruido = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        assertEquals(20,picoConstruido.fuerza());
        assertEquals(1000, picoConstruido.durabilidad());
    }
    @Test
    public void test06HachaDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(madera,modeloDeHacha);

        hachaConstruida.usarContra(madera);
        assertEquals(98,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(96,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(94,hachaConstruida.durabilidad());
    }
    @Test
    public void test07HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(piedra,modeloDeHacha);

        hachaConstruida.usarContra(madera);
        assertEquals(195,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(190,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(185,hachaConstruida.durabilidad());
    }
    @Test
    public void test08HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(metal,modeloDeHacha);

        hachaConstruida.usarContra(madera);
        assertEquals(395,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(piedra);
        assertEquals(390,hachaConstruida.durabilidad());
        hachaConstruida.usarContra(metal);
        assertEquals(385,hachaConstruida.durabilidad());
    }
    @Test
    public void test09PicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoConstruido = (Pico) constructor.construir(madera,modeloDePico);

        picoConstruido.usarContra(madera);
        assertEquals(98,picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(96,picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(94,picoConstruido.durabilidad());
    }
    @Test
    public void test10PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoConstruido = (Pico) constructor.construir(piedra,modeloDePico);

        picoConstruido.usarContra(madera);
        assertEquals(198,picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(196,picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(194,picoConstruido.durabilidad());
    }
    @Test
    public void test10PicoDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoConstruido = (Pico) constructor.construir(metal,modeloDePico);

        picoConstruido.usarContra(madera);
        assertEquals(400,picoConstruido.durabilidad());
        picoConstruido.usarContra(piedra);
        assertEquals(400,picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        assertEquals(400,picoConstruido.durabilidad());
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        picoConstruido.usarContra(metal);
        assertEquals(0,picoConstruido.durabilidad());
    }
    @Test
    public void test10PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Diamante diamante= new Diamante();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFinoConstruido = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFinoConstruido.usarContra(diamante);
        assertEquals(900,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante);
        assertEquals(810,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(diamante);
        assertEquals(729,picoFinoConstruido.durabilidad());
    }
    @Test
    public void test11PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFinoConstruido = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFinoConstruido.usarContra(madera);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(madera);
        assertEquals(1000,picoFinoConstruido.durabilidad());
    }
    @Test
    public void test11PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFinoConstruido = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFinoConstruido.usarContra(piedra);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(piedra);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(piedra);
        assertEquals(1000,picoFinoConstruido.durabilidad());
    }
    @Test
    public void test11PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFinoConstruido = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFinoConstruido.usarContra(metal);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal);
        assertEquals(1000,picoFinoConstruido.durabilidad());
        picoFinoConstruido.usarContra(metal);
        assertEquals(1000,picoFinoConstruido.durabilidad());
    }

}
