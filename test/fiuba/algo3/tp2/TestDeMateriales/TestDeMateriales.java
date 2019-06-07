package fiuba.algo3.tp2.TestDeMateriales;

import fiuba.algo3.tp2.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeMateriales {
    @Test
    public void test01MaderaSeGolpeaConHachaDeMaderaPierdeDurabilidadCorrectamente(){
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
    public void test02PiedraSeGolpeaConHachaYNoPierdeDurabilidad(){
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
    public void test02MetalSeGolpeaConPicoDeMaderaYNoPierdeDurabilidad(){
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

