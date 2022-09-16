package ejercicio01;

public class Main
{
    static void main(String args[])
    {
        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        ecuacion.setA(2);
        ecuacion.setB(3);
        ecuacion.setC(4);

        System.out.println(ecuacion.getA());
        System.out.println(ecuacion.getB());
        System.out.println(ecuacion.getC());
    }
}
