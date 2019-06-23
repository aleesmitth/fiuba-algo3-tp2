package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public abstract class Herramienta {

    protected AtributosHerramienta atributos;

    public int fuerza(){ return this.atributos.fuerza();}

    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    public abstract void usarContra(Material material, Inventario inventario);

    public Material hechoDe(){ return this.atributos.hechoDe(); }

    protected void usarLaHerramienta(Inventario inventario){}

}
