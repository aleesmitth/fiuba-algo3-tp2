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
        Hacha hachaDeMadera = (Hacha) constructor.construir(madera,modeloDeHacha);

        assertEquals(2,hachaDeMadera.fuerza());
        assertEquals(100, hachaDeMadera.durabilidad());
    }
    @Test
    public void test02ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Pico modeloDePico= new Pico();
        Pico picoDeMadera = (Pico) constructor.construir(madera,modeloDePico);

        assertEquals(2,picoDeMadera.fuerza());
        assertEquals(100, picoDeMadera.durabilidad());
    }
    @Test
    public void test03ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDeMetal = (Hacha) constructor.construir(metal,modeloDeHacha);

        assertEquals(10,hachaDeMetal.fuerza());
        assertEquals(400, hachaDeMetal.durabilidad());
    }
    @Test
    public void test04ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal,modeloDePico);

        assertEquals(12,picoDeMetal.fuerza());
        assertEquals(400, picoDeMetal.durabilidad());
    }
    @Test
    public void test05ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoDeMetal = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        assertEquals(20,picoDeMetal.fuerza());
        assertEquals(1000, picoDeMetal.durabilidad());
    }
    @Test
    public void test06HachaDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDeMadera = (Hacha) constructor.construir(madera,modeloDeHacha);

        hachaDeMadera.usarContra(madera);
        assertEquals(98,hachaDeMadera.durabilidad());
        hachaDeMadera.usarContra(piedra);
        assertEquals(96,hachaDeMadera.durabilidad());
        hachaDeMadera.usarContra(metal);
        assertEquals(94,hachaDeMadera.durabilidad());
    }
    @Test
    public void test07HachaDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDePiedra = (Hacha) constructor.construir(piedra,modeloDeHacha);

        hachaDePiedra.usarContra(madera);
        assertEquals(195,hachaDePiedra.durabilidad());
        hachaDePiedra.usarContra(piedra);
        assertEquals(190,hachaDePiedra.durabilidad());
        hachaDePiedra.usarContra(metal);
        assertEquals(185,hachaDePiedra.durabilidad());
    }
    @Test
    public void test08HachaDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDeMetal = (Hacha) constructor.construir(metal,modeloDeHacha);

        hachaDeMetal.usarContra(madera);
        assertEquals(395,hachaDeMetal.durabilidad());
        hachaDeMetal.usarContra(piedra);
        assertEquals(390,hachaDeMetal.durabilidad());
        hachaDeMetal.usarContra(metal);
        assertEquals(385,hachaDeMetal.durabilidad());
    }
    @Test
    public void test09PicoDeMaderaSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(madera,modeloDePico);

        picoDeMetal.usarContra(madera);
        assertEquals(98,picoDeMetal.durabilidad());
        picoDeMetal.usarContra(piedra);
        assertEquals(96,picoDeMetal.durabilidad());
        picoDeMetal.usarContra(metal);
        assertEquals(94,picoDeMetal.durabilidad());
    }
    @Test
    public void test10PicoDePiedraSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoDePiedra = (Pico) constructor.construir(piedra,modeloDePico);

        picoDePiedra.usarContra(madera);
        assertEquals(198,picoDePiedra.durabilidad());
        picoDePiedra.usarContra(piedra);
        assertEquals(196,picoDePiedra.durabilidad());
        picoDePiedra.usarContra(metal);
        assertEquals(194,picoDePiedra.durabilidad());
    }
    @Test
    public void test11PicoDeMetalSeUsaContraCadaMaterialYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal,modeloDePico);

        picoDeMetal.usarContra(madera);
        assertEquals(400,picoDeMetal.durabilidad());
        picoDeMetal.usarContra(piedra);
        assertEquals(400,picoDeMetal.durabilidad());
        picoDeMetal.usarContra(metal);
        assertEquals(400,picoDeMetal.durabilidad());
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        assertEquals(0,picoDeMetal.durabilidad());
    }
    @Test
    public void test12PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Diamante diamante= new Diamante();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFino = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFino.usarContra(diamante);
        assertEquals(900,picoFino.durabilidad());
        picoFino.usarContra(diamante);
        assertEquals(810,picoFino.durabilidad());
        picoFino.usarContra(diamante);
        assertEquals(729,picoFino.durabilidad());
    }
    @Test
    public void test13PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFino = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFino.usarContra(madera);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(madera);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(madera);
        assertEquals(1000,picoFino.durabilidad());
    }
    @Test
    public void test14PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFino = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFino.usarContra(piedra);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(piedra);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(piedra);
        assertEquals(1000,picoFino.durabilidad());
    }
    @Test
    public void test15PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Metal metal= new Metal();

        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoFino = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        picoFino.usarContra(metal);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(metal);
        assertEquals(1000,picoFino.durabilidad());
        picoFino.usarContra(metal);
        assertEquals(1000,picoFino.durabilidad());
    }

    /**
     * Aca empiezan los test de materiales
     */
    @Test
    public void test16MaderaSeGolpeaConHachaDeMaderaPierdeDurabilidadCorrectamente(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDeMadera = (Hacha) constructor.construir(madera,modeloDeHacha);

        hachaDeMadera.usarContra(madera);
        assertEquals(8,madera.durabilidad());
        hachaDeMadera.usarContra(madera);
        assertEquals(6,madera.durabilidad());
        hachaDeMadera.usarContra(madera);
        assertEquals(4,madera.durabilidad());
    }
    @Test
    public void test17PiedraSeGolpeaConHachaYNoPierdeDurabilidad(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaDeMadera = (Hacha) constructor.construir(madera,modeloDeHacha);
        Hacha hachaDePiedra = (Hacha) constructor.construir(piedra,modeloDeHacha);
        Hacha hachaDeMetal = (Hacha) constructor.construir(metal,modeloDeHacha);

        hachaDeMadera.usarContra(piedra);
        assertEquals(30,piedra.durabilidad());
        hachaDePiedra.usarContra(piedra);
        assertEquals(30,piedra.durabilidad());
        hachaDeMetal.usarContra(piedra);
        assertEquals(30,piedra.durabilidad());

    }
    @Test
    public void test18MetalSeGolpeaConPicoDeMaderaYNoPierdeDurabilidad(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Metal metal= new Metal();
        Pico modeloDePico= new Pico();
        Pico picoDeMadera= (Pico) constructor.construir(madera,modeloDePico);

        picoDeMadera.usarContra(metal);
        assertEquals(50,metal.durabilidad());
        picoDeMadera.usarContra(metal);
        assertEquals(50,metal.durabilidad());
        picoDeMadera.usarContra(metal);
        assertEquals(50,metal.durabilidad());
    }

}
