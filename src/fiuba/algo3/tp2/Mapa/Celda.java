package fiuba.algo3.tp2.Mapa;

import fiuba.algo3.tp2.Entidad.Materiales.Material;
import fiuba.algo3.tp2.Mapa.MovilidadJugador.Movimiento;

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

    public Celda(int numeroDeFila,int numeroDeColumna,Jugador jugador){
        this.jugador = jugador;
        this.estaOcupado = true;
        this.filaDeCelda = numeroDeFila;
        this.columnaDeCelda = numeroDeColumna;
        this.material = null;
    };

    public Celda(int numeroDeFila,int numeroDeColumna,Material material){
        this.material = material;
        this.estaOcupado = true;
        this.filaDeCelda = numeroDeFila;
        this.columnaDeCelda = numeroDeColumna;
        this.jugador = null;
    };

    public boolean celdaEstaOcupada(){
        return this.estaOcupado;
    }

    public void moverJugadorA(Movimiento direccion){
        direccion.movible(this);
    }

    public int obtenerSiguienteFila(int direccionNueva){
        return (this.filaDeCelda + direccionNueva);
    }

    public int obtenerSiguienteColumna(int direccionNueva){
        return (this.columnaDeCelda + direccionNueva);
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


}
