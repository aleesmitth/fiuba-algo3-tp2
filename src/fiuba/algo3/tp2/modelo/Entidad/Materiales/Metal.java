package fiuba.algo3.tp2.modelo.Entidad.Materiales;

import fiuba.algo3.tp2.modelo.Entidad.Herramienta.*;
import fiuba.algo3.tp2.modelo.Entidad.Jugador.Inventario;

public class Metal extends Material {

    public String codigo;

    public Metal(){
        this.durabilidad = 50;
        this.codigo = "A";
    }


    @Override
    public AtributosHerramienta crear(Pico pico) {
        AtributosHerramienta atributosHerramienta=new UsoRestringido(12,400,this);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Pico pico, Material material) {
        AtributosHerramienta atributosHerramienta=new UsoMinimo(20,1000,this,10,material);
        return atributosHerramienta;
    }

    @Override
    public AtributosHerramienta crear(Hacha hacha) {
        AtributosHerramienta atributosHerramienta=new UsoLineal(10,400,this,2);
        return atributosHerramienta;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Inventario inventario) {
        if(( material.hechoDePiedra() || material.hechoDeMetal() ) && !pico.esPicoFino()){
            this.durabilidad -= pico.fuerza();
            pico.usarLaHerramienta(inventario);
            if(laHerramientaMeRompio()) {
                inventario.agregarMaterial(this);
                this.codigo = "-";
            };
        }
    }

    @Override
    public boolean hechoDeMetal(){ return true; }

    @Override
    public String obtenerCodigoMaterial(){
        return this.codigo;
    }
}


