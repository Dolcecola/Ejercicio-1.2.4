import java.util.Scanner;

public class Main{

    public static abstract class SerVivo{
        public abstract void alimentarse();
    }

    public static class Planta extends SerVivo{

        private int edad=0;
        private String tipoPlanta;
        private int cantidadPlantas=0;
        public void alimentarse()
        {
            System.out.println("La planta se alimenta a traves de la fotosíntesis");
        }
    }

    public static void main(String[] args)
    {
        Planta p = new Planta();

        p.alimentarse();

    }
}