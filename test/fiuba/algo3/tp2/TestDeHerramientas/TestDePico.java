package fiuba.algo3.tp2.TestDeHerramientas;

import fiuba.algo3.tp2.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDePico {

    @Test
    public void test01ArmarPicoDeMaderaConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Pico modeloDePico= new Pico();
        Pico picoDeMadera = (Pico) constructor.construir(madera,modeloDePico);

        assertEquals(2,picoDeMadera.fuerza());
        assertEquals(100, picoDeMadera.durabilidad());
    }


    @Test
    public void test02ArmarPicoDeMetalConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal,modeloDePico);

        assertEquals(12,picoDeMetal.fuerza());
        assertEquals(400, picoDeMetal.durabilidad());
    }



    @Test
    public void test03ArmarPicoFinoConFuerzaYDurabilidadCorrespondientes(){
        Constructor constructor = new Constructor();
        Metal metal= new Metal();
        PicoFino modeloDePicoFino= new PicoFino();
        PicoFino picoDeMetal = (PicoFino) constructor.construir(metal,modeloDePicoFino);

        assertEquals(20,picoDeMetal.fuerza());
        assertEquals(1000, picoDeMetal.durabilidad());
    }

    @Test
    public void test04PicoDeMaderaSeUsaContraMaderaYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();

        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(madera,modeloDePico);

        picoDeMetal.usarContra(madera);
        assertEquals(98,picoDeMetal.durabilidad());
        }


    @Test
    public void test05PicoDeMaderaSeUsaContraPiedraYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();

        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(madera,modeloDePico);

        picoDeMetal.usarContra(piedra);
        assertEquals(98,picoDeMetal.durabilidad());
    }



    @Test
    public void test06PicoDeMaderaSeUsaContraMetalYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(madera,modeloDePico);

        picoDeMetal.usarContra(metal);
        assertEquals(98,picoDeMetal.durabilidad());
    }




    @Test
    public void test07PicoDeMaderaSeUsaContraCadaMaterialConsecutivoYReduceSuDurabilidad(){
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
    public void test08PicoDePiedraSeUsaContraMaderaYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Madera madera= new Madera();
        Piedra piedra= new Piedra();

        Pico modeloDePico= new Pico();
        Pico picoDePiedra = (Pico) constructor.construir(piedra,modeloDePico);

        picoDePiedra.usarContra(madera);
        assertEquals(198,picoDePiedra.durabilidad());
    }


    @Test
    public void test09PicoDePiedraSeUsaContraPiedraYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Piedra piedra= new Piedra();

        Pico modeloDePico= new Pico();
        Pico picoDePiedra = (Pico) constructor.construir(piedra,modeloDePico);

        picoDePiedra.usarContra(piedra);
        assertEquals(198,picoDePiedra.durabilidad());
        }


    @Test
    public void test10PicoDePiedraSeUsaContraMetalYReduceSuDurabilidad(){
        Constructor constructor= new Constructor();
        Piedra piedra= new Piedra();
        Metal metal= new Metal();

        Pico modeloDePico= new Pico();
        Pico picoDePiedra = (Pico) constructor.construir(piedra,modeloDePico);

        picoDePiedra.usarContra(metal);
        assertEquals(198,picoDePiedra.durabilidad());
    }


    @Test
    public void test11PicoDePiedraSeUsaContraCadaMaterialConsecutivoYReduceSuDurabilidad(){
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
    public void test12PicoDeMetalSeUsaContraCadaMaterialConsecutivoYReduceSuDurabilidad(){
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
    public void test13PicoDeMetalSeUsaContraMaderaYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Madera madera = new Madera();
        Metal metal = new Metal();

        Pico modeloDePico = new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal, modeloDePico);

        picoDeMetal.usarContra(madera);
        assertEquals(400, picoDeMetal.durabilidad());
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        picoDeMetal.usarContra(madera);
        assertEquals(0, picoDeMetal.durabilidad());

    }



    @Test
    public void test14PicoDeMetalSeUsaContraPiedraYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Piedra piedra = new Piedra();
        Metal metal = new Metal();

        Pico modeloDePico = new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal, modeloDePico);

        picoDeMetal.usarContra(piedra);
        assertEquals(400, picoDeMetal.durabilidad());
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        picoDeMetal.usarContra(piedra);
        assertEquals(0, picoDeMetal.durabilidad());
    }



    @Test
    public void test15PicoDeMetalSeUsaContraMetalYReduceSuDurabilidad() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();

        Pico modeloDePico = new Pico();
        Pico picoDeMetal = (Pico) constructor.construir(metal, modeloDePico);

        picoDeMetal.usarContra(metal);
        assertEquals(400, picoDeMetal.durabilidad());
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        picoDeMetal.usarContra(metal);
        assertEquals(0, picoDeMetal.durabilidad());
    }

    @Test
    public void test16PicoFinoSeUsaContraDiamanteYReduceSuDurabilidad(){
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
    public void test17PicoFinoSeUsaContraMaderaYNoReduceSuDurabilidad(){
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
    public void test18PicoFinoSeUsaContraPiedraYNoReduceSuDurabilidad(){
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
    public void test19PicoFinoSeUsaContraMetalYNoReduceSuDurabilidad(){
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

}
