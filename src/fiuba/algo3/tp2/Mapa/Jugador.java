package fiuba.algo3.tp2.Mapa;

import fiuba.algo3.tp2.Herramienta.Herramienta;
import fiuba.algo3.tp2.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.Entidad.Materiales.Material;

public class Jugador {
    private Constructor mesaDeCrafteo;
    private Herramienta itemEquipado;

    public Jugador(){
        this.mesaDeCrafteo = new Constructor();
        Material madera = new Madera();
        this.itemEquipado = this.mesaDeCrafteo.construirHacha(madera);
    }

    public Herramienta obtenerHerramientaEquipada(){
        return this.itemEquipado;
    }

    public void usarHerramientaContra(Material material){
        this.itemEquipado.usarContra(material);
    }

}