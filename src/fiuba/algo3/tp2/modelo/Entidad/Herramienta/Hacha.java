package fiuba.algo3.tp2.modelo.Entidad.Herramienta;

import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public class Hacha extends Herramienta{

    AtributosHerramienta atributos;

    public Hacha(Material material) {
        this.atributos = material.crear(this);
    }

    @Override
    public int fuerza(){
        return this.atributos.fuerza();
    }
    @Override
    public int durabilidad(){
        return this.atributos.durabilidad();
    }

    @Override
    public void usarLaHerramienta(Inventario inventario){this.atributos.usar(inventario);}

    @Override
    public void usarContra(Material material, Inventario inventario) { material.golpeadoPor(this,this.atributos.hechoDe(), inventario); }


}
