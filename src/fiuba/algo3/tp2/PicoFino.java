package fiuba.algo3.tp2;

public class PicoFino extends Herramienta{

    public PicoFino(){}

    protected void desgastar(){

        atributos.durabilidad-=atributos.desgaste;
    }

    public PicoFino(int fuerzaRecibida, int durabilidadInicial, Piedra piedra){
        this.atributos = new AtributosHerramienta(fuerzaRecibida, durabilidadInicial,piedra,this);
    }


    public PicoFino(int fuerzaRecibida, int durabilidadInicial, Metal metal){
        this.atributos = new AtributosHerramienta(fuerzaRecibida, durabilidadInicial,metal,this);
    }

    public PicoFino armar(Piedra piedra){

        return new PicoFino(20,1000,piedra);
    }

    public PicoFino armar(Metal metal){

        return new PicoFino(20,1000,metal);
    }


    public PicoFino armar(Madera madera){
        try {
            throw new CrearPicoFinoDeMaderaException("Se intento crear un pico fino de madera-it's not allowed"); // aca tiene que tirar excepcion, no estoy seguro de q este tirada correctamente
        }catch(CrearPicoFinoDeMaderaException excepcion){
            System.out.println(excepcion.getMessage());
        }
        return null;
    }


    public void usarContra(Material material){
        try {
            if(this.atributos.durabilidad()<= 0){
                throw new HerramientaRotaException("Se intento usar una herramienta rota-it's not allowed");
            }
        }catch(HerramientaRotaException excepcion){
            System.out.println(excepcion.getMessage());
        }

        if(material instanceof Diamante){
            this.desgastar();
            this.atributos.actualizarDesgaste();
        }
        material.golpeadoPor(this);
    }


}
