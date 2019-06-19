package fiuba.algo3.tp2.Entidad.Herramientas;

import fiuba.algo3.tp2.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.Entidad.Materiales.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableroConstructor {

    @Test
    public void test01TableroConstruyeHachaDeMadera(){
        Jugador jugador = new Jugador();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material madera3 = new Madera();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(madera1,madera2,vacio,madera3,madera4,vacio,vacio,madera5,vacio));

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test02TableroConstruyeHachaDePiedra(){
        Jugador jugador = new Jugador();
        Material piedra1 = new Piedra();
        Material piedra2 = new Piedra();
        Material piedra3 = new Piedra();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(piedra1,piedra2,vacio,piedra3,madera1,vacio,vacio,madera2,vacio));

        assertEquals(5, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(200, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test03TableroConstruyeHachaDeMetal(){
        Jugador jugador = new Jugador();
        Material metal1 = new Metal();
        Material metal2 = new Metal();
        Material metal3 = new Metal();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(metal1,metal2,vacio,metal3,madera1,vacio,vacio,madera2,vacio));

        assertEquals(10, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(400, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test04TableroConstruyePicoDeMadera(){
        Jugador jugador = new Jugador();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material madera3 = new Madera();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(madera1,madera2,madera3,vacio,madera4,vacio,vacio,madera5,vacio));

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test05TableroConstruyePicoDePiedra(){
        Jugador jugador = new Jugador();
        Material piedra1 = new Piedra();
        Material piedra2 = new Piedra();
        Material piedra3 = new Piedra();
        Material madera1 = new Madera();
        Material madera2 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(piedra1,piedra2,piedra3,vacio,madera1,vacio,vacio,madera2,vacio));

        assertEquals(4, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(200, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test06TableroConstruyePicoDeMetal(){
        Jugador jugador = new Jugador();
        Material metal1 = new Metal();
        Material metal2 = new Metal();
        Material metal3 = new Metal();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(metal1,metal2,metal3,vacio,madera4,vacio,vacio,madera5,vacio));

        assertEquals(12, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(400, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test07TableroConstruyePicoFino(){
        Jugador jugador = new Jugador();
        Material metal1 = new Metal();
        Material metal2 = new Metal();
        Material metal3 = new Metal();
        Material piedra = new Piedra();
        Material madera4 = new Madera();
        Material madera5 = new Madera();
        Material vacio = new MaterialVacio();
        jugador.equiparHerramienta(jugador.construirHerramienta(metal1,metal2,metal3,piedra,madera4,vacio,vacio,madera5,vacio));

        assertEquals(20, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(1000, jugador.obtenerHerramientaEquipada().durabilidad());

    }
}
