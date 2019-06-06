package fiuba.algo3.tp2;

public class Pico extends Herramienta{
    private int usos=0;
    private static int usosMaximosPicoDeMetal=10;
    protected void desgastar(){
        atributos.durabilidad-=atributos.desgaste;
    }
    public Pico(int str,int dur, Madera madera){
        this.atributos = new AtributosHerramienta(str,dur,madera,this);
    }
    public Pico(int str,int dur, Piedra piedra){
        this.atributos = new AtributosHerramienta(str,dur,piedra,this);
    }
    public Pico(int str,int dur, Metal metal){
        this.atributos = new AtributosHerramienta(str,dur,metal,this);
    }
    public Pico(){}
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
