package fiuba.algo3.tp2;

public class Pico extends Herramienta{

    private int usos=0;

    private static int usosMaximosPicoDeMetal=10;

    public Pico(){}

    protected void desgastar() {
        atributos.durabilidad-=atributos.desgaste;
    }

    public Pico(int fuerzaRecibida, int durabilidadInicial, Madera madera){

        this.atributos = new AtributosHerramienta(fuerzaRecibida, durabilidadInicial,madera,this);

    }


    public Pico(int fuerzaRecibida, int durabilidadInicial, Piedra piedra){

        this.atributos = new AtributosHerramienta( fuerzaRecibida,  durabilidadInicial,piedra,this);

    }

    public Pico(int fuerzaRecibida, int durabilidadInicial, Metal metal){

        this.atributos = new AtributosHerramienta( fuerzaRecibida,  durabilidadInicial,metal,this);

    }

    public Pico armar(Madera madera){

        return new Pico(2,100,madera);
    }


    public Pico armar(Piedra piedra){

        return new Pico(4,200,piedra);
    }


    public Pico armar(Metal metal){

        return new Pico(12,400,metal);
    }


    public void usarContra(Material material){
        try {
            if(this.atributos.durabilidad()<= 0 && this.usos<=0){
                throw new HerramientaRotaException("Se intento usar una herramienta rota-it's not allowed");
            }
        }catch(HerramientaRotaException excepcion){
            System.out.println(excepcion.getMessage());
        }
        this.usos++;
        this.desgastar();
        material.golpeadoPor(this);
        if(this.hechoDe() instanceof Metal && this.usos==usosMaximosPicoDeMetal){
            this.atributos.durabilidad=0;
        }
    }
}
