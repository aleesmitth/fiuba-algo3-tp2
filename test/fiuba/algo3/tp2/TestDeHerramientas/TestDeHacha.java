package fiuba.algo3.tp2.TestDeHerramientas;

import fiuba.algo3.tp2.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestDeHacha {

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
    public void test03ArmarHachaDeMetalConSuDurabilidadYFuerzaCorrespondiente() {
        Constructor constructor = new Constructor();
        Metal metal = new Metal();
        Hacha modeloDeHacha = new Hacha();
        Hacha hachaDeMetal = (Hacha) constructor.construir(metal, modeloDeHacha);

        assertEquals(10, hachaDeMetal.fuerza());
        assertEquals(400, hachaDeMetal.durabilidad());
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
}
