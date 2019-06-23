package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;
import fiuba.algo3.tp2.modelo.Entidad.MesaDeCrafteo.Casillero;

import static fiuba.algo3.tp2.modelo.Juego.Juego.CASILLERO_INVENTARIO_PARA_PIEDRA;

public class Piedra extends Material {

    public Piedra() {
        this.durabilidad =30;
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
        this.durabilidad -= pico.fuerza();
        pico.usarLaHerramienta(inventario);
        if(laHerramientaMeRompio()) inventario.agregarMaterial(this);
    }

    @Override
    public boolean hechoDePiedra(){ return true; }

    @Override
    public String obtenerCodigoMaterial(){
        return "P";
    }

    @Override
    public void agregarAlInventario(Casillero[] casilleroConMateriales) {
        casilleroConMateriales[CASILLERO_INVENTARIO_PARA_PIEDRA].agregarMaterial(this);
    }

    @Override
    public void sacarDelInventario(Casillero[] casilleroConMateriales) {
        casilleroConMateriales[CASILLERO_INVENTARIO_PARA_PIEDRA].sacarMaterial();
    }
}
