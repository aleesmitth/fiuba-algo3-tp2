package fiuba.algo3.tp2;

public class Diamante extends Material{

    public Diamante(){
        this.atributos = new AtributosMaterial(100);
    }
    @Override
    public Herramienta armar(Herramienta herramienta) {
        try {
            throw new CrearHerramientaDeDiamanteException("Se intento crear una herramienta de diamante-it's not allowed"); // aca tiene que tirar excepcion, no estoy seguro de q este tirada correctamente
        }catch(CrearHerramientaDeDiamanteException excepcion){
            System.out.println(excepcion.getMessage());
        }
        return null;
    }

    @Override
    public void golpeadoPor(PicoFino picoFino) {
        this.atributos.durabilidad -= picoFino.fuerza();
    }
}
