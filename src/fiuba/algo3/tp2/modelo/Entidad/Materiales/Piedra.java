package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;

public class Piedra extends Material {

    private String codigo;

    public Piedra() {
        this.durabilidad =30;
        this.codigo = "P";
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(5,200,this,1);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(4,200,this,1.5);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        AtributosHerramienta atributosHerramienta=new UsoMinimo(20,1000,this,10,material);
        return atributosHerramienta;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Inventario inventario) {
        if(!pico.esPicoFino()) {
            this.durabilidad -= pico.fuerza();
            pico.usarLaHerramienta(inventario);
            if (laHerramientaMeRompio()) {
                inventario.agregarMaterial(this);
                this.codigo = "-";
            }
        }
    }

    @Override
    public boolean hechoDePiedra(){ return true; }

    @Override
    public String obtenerCodigoMaterial(){
        return this.codigo;
    }
}
