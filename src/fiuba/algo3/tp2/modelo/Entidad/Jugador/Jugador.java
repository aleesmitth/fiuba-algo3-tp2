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

        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(),0,0);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 0,1);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 1,0);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 1,1);
        this.agregarMaterialEnCasilleroMesaDeCrafteo(new Madera(), 2,1);
        this.mesaDeCrafteo.construirHerramienta();
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
            if(!this.inventario.herramientaRota()) {
                this.usarHerramientaContra(celdaConMaterialGolpeable.material);
            }
        }
    }

    public void nuevaPosicionFrontal(Movimiento nuevaPosicionFrontal){
        this.posicionFrontal = nuevaPosicionFrontal;
    }

    public String getCantidadDeMaterial(Material material){
        return this.inventario.getCantidadDeMaterial(material);
    }

    public boolean cambiarHerramientaEquipada(int posicion) {
        return this.inventario.cambiarHerramientaEquipada(posicion);
    }

    public void sacarMaterialDeInventario(Material material) {
        this.inventario.sacarMaterial(material);
    }

    public void agregarHerramientaAlInventario(Herramienta herramienta) {
        this.inventario.agregarHerramientaAlInventario(herramienta);
    }

    public Herramienta construirHerramienta(String string) {
        return this.mesaDeCrafteo.construirHerramienta(string);
    }

    public void agregarMaterialAlInventario(Material material) {
        this.inventario.agregarMaterial(material);
    }

    public boolean herramientaRota() {
        return this.inventario.herramientaRota();
    }
}