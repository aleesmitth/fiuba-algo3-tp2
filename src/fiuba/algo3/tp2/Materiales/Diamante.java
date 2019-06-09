package fiuba.algo3.tp2.Materiales;

import fiuba.algo3.tp2.Herramienta.AtributosHerramienta;
import fiuba.algo3.tp2.Herramienta.Hacha;
import fiuba.algo3.tp2.Herramienta.Pico;

public class Diamante extends Material{


    public Diamante(){
        this.durabilidad=100;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { pico.usarLaHerramienta(); }

}
