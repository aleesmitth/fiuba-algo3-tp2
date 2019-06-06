package fiuba.algo3.tp2;

public class Jugador {
    private Constructor mesaDeCrafteo;
    private Herramienta primerHachaDeMadera;
    private Herramienta itemEquipado;

    // Metodos

    public Jugador(){
        this.mesaDeCrafteo = new Constructor();
        this.primerHachaDeMadera = this.mesaDeCrafteo.construir(new Madera(), new Hacha());
    }

    public Herramienta getPrimerHachaDeMadera(){
        return this.primerHachaDeMadera;
    }

    public void equiparItem(Herramienta herramienta){
        this.itemEquipado = herramienta;
    }

    public Material usarHerramientaContra(Material material){
        this.itemEquipado.usarContra(material);
        return material;
    }
}
