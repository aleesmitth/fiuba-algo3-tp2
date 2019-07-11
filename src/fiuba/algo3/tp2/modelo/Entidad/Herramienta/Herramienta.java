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

    public abstract Material hechoDe();

    protected void usarLaHerramienta(Inventario inventario){}

    public boolean esPico(){ return false; }

    public boolean esHacha(){ return false; }

    public boolean esPicoFino(){ return false; }

    public boolean estaRota(){ return this.atributos.estaRota(); }

}
