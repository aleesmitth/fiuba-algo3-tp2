package fiuba.algo3.tp2.modelo.Entidad.Herramienta;


import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.Materiales.Material;

public abstract class AtributosHerramienta {

    protected int durabilidad;
    protected int fuerza;
    protected double desgaste;
    protected Material materialPrimario;
    protected Material materialSecundario;



    public int fuerza(){ return this.fuerza;}

    public abstract void usar(Inventario inventario);

    public int durabilidad(){ return this.durabilidad; }

    public Material hechoDe(){ return this.materialPrimario; }

    public abstract boolean esUsoFino();

    public boolean estaRota(){ return this.durabilidad == 0; }
}
