package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.TableroConstructor;
import fiuba.algo3.tp2.modelo.Mapa.Celda;
import fiuba.algo3.tp2.modelo.Mapa.Mapa;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Abajo;
import fiuba.algo3.tp2.modelo.Mapa.MovilidadJugador.Movimiento;

public class Jugador {

    private Movimiento posicionFrontal;
    private TableroConstructor mesaDeCrafteo;
    private Inventario inventario;

    public Jugador(){
        this.mesaDeCrafteo = new TableroConstructor();
        this.inventario = new Inventario();
        this.posicionFrontal = new Abajo();
        this.posicionFrontal.obtenerEntorno(Mapa.getMapa());

        /*
         * aca no estoy seguro si convendria hacer solamente new Hacha(new Madera());
         * son menos lineas pero no se si es muy orientado a objetos.
         *
         * BORRAR ESTE COMENTARIO!!.
         */
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(),0,0);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 0,1);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 1,0);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 1,1);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 2,1);
        this.equiparHerramienta(mesaDeCrafteo.construirHerramienta());
    }

    public Herramienta construirHerramienta(){
        return this.mesaDeCrafteo.construirHerramienta();
    }

    public void equiparHerramienta(Herramienta herramienta){
        this.inventario.equiparHerramienta(herramienta);
    }

    public Herramienta obtenerHerramientaEquipada(){
        return this.inventario.getHerramienta();
    }

    public void usarHerramientaContra(Material material){
        this.inventario.getHerramienta().usarContra(material, this.inventario);
    }

    public void agregarMaterialEnCasilleroMesaDeCrafteo(Material material, int fila, int columna){
        this.mesaDeCrafteo.agregarMaterialEnCasillero(material,fila,columna);
    }

    public void golpearFrente(Celda celdaJugador){
        Celda celdaConMaterialGolpeable = celdaJugador.jugador.posicionFrontal.obtenerCeldaSiguiente(celdaJugador);
        if(celdaConMaterialGolpeable.celdaEstaOcupada()){
            this.usarHerramientaContra(celdaConMaterialGolpeable.material);
        }
    }

    public void nuevaPosicionFrontal(Movimiento nuevaPosicionFrontal){
        this.posicionFrontal = nuevaPosicionFrontal;
    }

    public String getCantidadDeMaterial(Material material){
        return this.inventario.getCantidadDeMaterial(material);
    }

    public void cambiarHerramientaEquipada(int posicion) {
        this.inventario.cambiarHerramientaEquipada(posicion);
    }

}