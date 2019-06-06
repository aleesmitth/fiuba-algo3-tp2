package fiuba.algo3.tp2;

public class Jugador {
    private Constructor mesaDeCrafteo;
    private Herramienta itemEquipado;

    public Jugador(Herramienta primerItemDelJugador){
        this.mesaDeCrafteo = new Constructor();
        this.equiparItem(primerItemDelJugador);
    }

    public Herramienta obtenerHerramientaEquipada(){
        return this.itemEquipado;
    }

    public void equiparItem(Herramienta herramienta){
        this.itemEquipado = herramienta;
    }

    public void usarHerramientaContra(Material material){
        this.itemEquipado.usarContra(material);
    }
}
