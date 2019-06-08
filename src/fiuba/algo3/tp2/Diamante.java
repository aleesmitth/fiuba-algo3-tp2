package fiuba.algo3.tp2;

public class Diamante extends Material{


    public Diamante(){
        this.durabilidad=100;
    }

    @Override
    public void golpeadoPor(Pico pico, Material material, Material materialSecundario) { pico.usarLaHerramienta(); }

}
