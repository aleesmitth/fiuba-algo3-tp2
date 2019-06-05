import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestsTP2 {

    @Test
    public void test01armarHachaMadera(){
        Constructor constructor = new Constructor();
        Madera madera= new Madera();
        Hacha modeloDeHacha= new Hacha();
        Hacha hachaConstruida = (Hacha) constructor.construir(madera,modeloDeHacha);

        assertEquals(2,hachaConstruida.fuerza());
        assertEquals(100, hachaConstruida.durabilidad());


    }


}
