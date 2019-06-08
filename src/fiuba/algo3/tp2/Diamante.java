package fiuba.algo3.tp2;

public class Diamante extends Material{

    public Diamante()
    {
        this.durabilidadMaterial = 100;
    }

    @Override
    public Herramienta armar(Herramienta herramienta) {
        try {
            throw new CrearHerramientaDeDiamanteException("EXCEPCION LANZADA:Se intento crear una herramienta de diamante-it's not allowed");
        }catch(CrearHerramientaDeDiamanteException excepcion){
            System.out.println(excepcion.getMessage());
        }
        return null;
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {

        this.durabilidadMaterial = this.durabilidadMaterial - picoFino.fuerza();
    }
}
