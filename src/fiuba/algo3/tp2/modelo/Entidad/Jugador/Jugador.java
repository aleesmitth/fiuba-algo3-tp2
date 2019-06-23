package fiuba.algo3.tp2.modelo.Entidad.Jugador;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.Herramienta;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Madera;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.TableroConstructor;

public class Jugador {
    private TableroConstructor mesaDeCrafteo;
    private Inventario inventario;

    public Jugador(){
        this.mesaDeCrafteo = new TableroConstructor();
        this.inventario = new Inventario();

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

    public Herramienta construirHerramienta(){ return this.mesaDeCrafteo.construirHerramienta(); }

    public void equiparHerramienta(Herramienta herramienta){ this.inventario.equiparHerramienta(herramienta); }

    public Herramienta obtenerHerramientaEquipada(){ return this.inventario.getHerramienta(); }

    public void usarHerramientaContra(Material material){ this.inventario.getHerramienta().usarContra(material, this.inventario); }

    public void agregarMaterialEnCasilleroMesaDeCrafteo(Material material, int fila, int columna){ this.mesaDeCrafteo.agregarMaterialEnCasillero(material,fila,columna); }

}