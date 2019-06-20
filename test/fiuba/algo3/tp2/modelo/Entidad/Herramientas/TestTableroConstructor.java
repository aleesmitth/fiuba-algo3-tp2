package fiuba.algo3.tp2.modelo.Entidad.Herramientas;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Metal;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Piedra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTableroConstructor {

    @Test
    public void test01TableroConstruyeHachaDeMadera(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un hacha de madera.
         */
        jugador.agregarMaterialEnCasillero(new Madera(),0,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 0,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta hachaDeMadera = jugador.construirHerramienta();

        jugador.equiparHerramienta(hachaDeMadera);

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test02TableroConstruyeHachaDePiedra(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un hacha de piedra.
         */
        jugador.agregarMaterialEnCasillero(new Piedra(),0,0);
        jugador.agregarMaterialEnCasillero(new Piedra(), 0,1);
        jugador.agregarMaterialEnCasillero(new Piedra(), 1,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta hachaDePiedra = jugador.construirHerramienta();

        jugador.equiparHerramienta(hachaDePiedra);

        assertEquals(5, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(200, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test03TableroConstruyeHachaDeMetal(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un hacha de metal.
         */
        jugador.agregarMaterialEnCasillero(new Metal(),0,0);
        jugador.agregarMaterialEnCasillero(new Metal(), 0,1);
        jugador.agregarMaterialEnCasillero(new Metal(), 1,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta hachaDeMetal = jugador.construirHerramienta();

        jugador.equiparHerramienta(hachaDeMetal);

        assertEquals(10, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(400, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test04TableroConstruyePicoDeMadera(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un pico de madera.
         */
        jugador.agregarMaterialEnCasillero(new Madera(),0,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 0,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 0,2);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta picoDeMadera = jugador.construirHerramienta();

        jugador.equiparHerramienta(picoDeMadera);

        assertEquals(2, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(100, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test05TableroConstruyePicoDePiedra(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un pico de piedra.
         */
        jugador.agregarMaterialEnCasillero(new Piedra(),0,0);
        jugador.agregarMaterialEnCasillero(new Piedra(), 0,1);
        jugador.agregarMaterialEnCasillero(new Piedra(), 0,2);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta picoDePiedra = jugador.construirHerramienta();

        jugador.equiparHerramienta(picoDePiedra);

        assertEquals(4, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(200, jugador.obtenerHerramientaEquipada().durabilidad());

    }


    @Test
    public void test06TableroConstruyePicoDeMetal(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un pico de metal.
         */
        jugador.agregarMaterialEnCasillero(new Metal(),0,0);
        jugador.agregarMaterialEnCasillero(new Metal(), 0,1);
        jugador.agregarMaterialEnCasillero(new Metal(), 0,2);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta picoDeMetal = jugador.construirHerramienta();

        jugador.equiparHerramienta(picoDeMetal);

        assertEquals(12, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(400, jugador.obtenerHerramientaEquipada().durabilidad());

    }

    @Test
    public void test07TableroConstruyePicoFino(){
        Jugador jugador = new Jugador();

        /**
         * se carga en la mesa de crafteo la receta de un pico fino.
         */
        jugador.agregarMaterialEnCasillero(new Metal(),0,0);
        jugador.agregarMaterialEnCasillero(new Metal(), 0,1);
        jugador.agregarMaterialEnCasillero(new Metal(), 0,2);
        jugador.agregarMaterialEnCasillero(new Piedra(),1,0);
        jugador.agregarMaterialEnCasillero(new Madera(), 1,1);
        jugador.agregarMaterialEnCasillero(new Madera(), 2,1);

        /**
         * se presiona el boton de construir, que construye la receta previamente cargada
         */
        Herramienta picoFino = jugador.construirHerramienta();

        jugador.equiparHerramienta(picoFino);

        assertEquals(20, jugador.obtenerHerramientaEquipada().fuerza());
        assertEquals(1000, jugador.obtenerHerramientaEquipada().durabilidad());

    }

}
