package ejercicio01;
import java.lang.Math;

public class EcuacionCuadratica
{
    public double a;
    public double b;
    public double c;

    public void setA(double numA)
    {
        a = numA;
    }
    public double getA()
    {
        return a;
    }
    public void setB(double numB)
    {
        b = numB;
    }
    public double getB()
    {
        return b;
    }
    public void setC( double numC)
    {
        c = numC;
    }
    public double getC()
    {
        return c;
    }
    public double discriminante()
    {
        double expresion;

        expresion = Math.pow(getB(),2)-4*getA()*getC();

        return expresion;
    }
    public double raices()
    {
        double raiz01;

        if (discriminante()>0)
        {
            System.out.println("Dos soluciones distintas");

            double raiz02;

            raiz01=(-getB()+Math.sqrt(discriminante()))/2*getA();
            raiz02=(-getB()+Math.sqrt(discriminante()))/2*getA();

            System.out.println(raiz01);
            System.out.println(raiz02);
        }
        else if (discriminante()==0)
        {
            System.out.println("Una solucion doble");

            raiz01=(-getB()/2*getA());
            System.out.println(raiz01);
        }
        else
        {
            System.out.println("Ninguna solucion");
        }
        return  0;
    }
}
