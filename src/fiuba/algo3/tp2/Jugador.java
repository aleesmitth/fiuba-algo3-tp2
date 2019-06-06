package fiuba.algo3.tp2;

public class Jugador {
    private Constructor mesaDeCrafteo;
    private Herramienta primerHachaDeMadera;
    private Herramienta itemEquipado;

    // Metodos

    public Jugador(){
        this.mesaDeCrafteo = new Constructor();
        this.primerHachaDeMadera = this.mesaDeCrafteo.construir(new Madera(), new Hacha());
        this.itemEquipado = this.primerHachaDeMadera;
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
