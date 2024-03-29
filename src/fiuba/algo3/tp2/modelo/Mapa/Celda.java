package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Celda {

    public Jugador jugador;
    public Material material;
    private boolean estaOcupado;
    private int filaDeCelda;
    private int columnaDeCelda;

    public Celda(int numeroDeFila,int numeroDeColumna){
        this.estaOcupado = false;
        this.filaDeCelda = numeroDeFila;
        this.columnaDeCelda = numeroDeColumna;
    }

    public boolean celdaEstaOcupada(){
        return this.estaOcupado;
    }

    public int obtenerSiguienteFila(int direccionNueva){ return (this.filaDeCelda + 1 + direccionNueva); }

    public int obtenerSiguienteColumna(int direccionNueva){
        return (this.columnaDeCelda +1+ direccionNueva);
    }

    public void ocuparCelda(Material material){
        this.material=material;
        this.estaOcupado = true;
    }

    public void ocuparCelda(Jugador jugador){
        this.jugador=jugador;
        this.estaOcupado = true;
    }

    public void enviarJugador(Celda celdaSiguiente){
        celdaSiguiente.ocuparCelda(this.jugador);
        this.jugador = null;
        this.estaOcupado = false;
    }
    public boolean tengoAlJugador(){
        if (jugador!=null) return true;
        return false;
    }

    public String obtenerCodigo(){
        if(tengoAlJugador()) {
            return "J";
        }
        else if (this.estaOcupado) {
            return this.material.obtenerCodigoMaterial();
        }
        else return "-";
    }

    public int obtenerFila(){return this.filaDeCelda;}
    public int obtenerColumna(){return this.columnaDeCelda;}

    public void vaciarCelda(){
        this.material = null;
        this.estaOcupado = false;
    }
}
