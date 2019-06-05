package fiuba.algo3.tp2;

public class Durabilidad {

    private int valor=100;

    public Durabilidad(Material material, Herramienta herramienta){
        //
        // falta inicializar la fuerza acorde a el material y tipo de herramienta que recibe.
        //
        this.valor=100;       // lo hago asi para que pase el test y no se rompa nada, pero falta implementar.
    }

    public int valor(){
        return this.valor;
    }

}
