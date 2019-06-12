package fiuba.algo3.tp2.Jugador;

import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Herramienta;
import fiuba.algo3.tp2.Mapa.Constructor;
import fiuba.algo3.tp2.Materiales.Madera;
import fiuba.algo3.tp2.Materiales.Material;

public class Jugador {
    Constructor constructor;
    Herramienta herramientaDelJugador;
    Herramienta herramientaActual;

    public Jugador(){
        this.constructor = new Constructor();
        this.herramientaDelJugador = new Hacha(new Madera());
        this.herramientaActual = null;
    }

    public Herramienta obtenerHerramientaActual(){
        return this.herramientaActual;
    }

    public void equiparHerramientaInventario(){
        this.herramientaActual = this.herramientaDelJugador;
    }

    public void usarHerramientaActual(Material material){
        this.herramientaActual.usarContra(material);
    }

}
