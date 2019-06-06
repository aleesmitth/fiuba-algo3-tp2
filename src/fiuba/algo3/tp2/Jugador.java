package fiuba.algo3.tp2;

public class Jugador {
    private Constructor mesaDeCrafteo;
    private Herramienta primerHachaDeMadera;

    // Metodos

    public Jugador(){
        this.mesaDeCrafteo = new Constructor();
        this.primerHachaDeMadera = this.mesaDeCrafteo.construir(new Madera(), new Hacha());
    }

    public Herramienta getPrimerHachaDeMadera(){
        return this.primerHachaDeMadera;
    }

}
