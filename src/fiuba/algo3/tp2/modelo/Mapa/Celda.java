package fiuba.algo3.tp2.modelo.Mapa;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Jugador;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Celda {

    private Jugador jugador;
    private Material material;
    private boolean estaOcupado;
    private int filaDeCelda;
    private int columnaDeCelda;

    public Celda(int numeroDeFila,int numeroDeColumna){
        this.estaOcupado = false;
        this.filaDeCelda = numeroDeFila;
        this.columnaDeCelda = numeroDeColumna;
    };

    public boolean celdaEstaOcupada(){
        return this.estaOcupado;
    }

    public void moverJugadorA(Movimiento direccion){
        direccion.movible(this);
    }

    public int obtenerSiguienteFila(int direccionNueva){
        return (this.filaDeCelda + 1 + direccionNueva);
    }

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


}
