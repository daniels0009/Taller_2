package geometria;

 
public class Circulo implements Figura 
{
    private double radio;
    private double areaRadio;
    private double PerimetroRadio;
    static final double pi = 3.1415;
 
    public Circulo(double radio) 
    {
        this.radio = radio;
    }
 
    public double getRadio() 
    {
        return radio;
    }
 
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }
 
    public double getAreaRadio() 
    {
        return areaRadio;
    }
    
    public double getPerimetroRadio() 
    {
        return PerimetroRadio;
    }
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
    public void perimetro() 
    {
        PerimetroRadio = 2*pi * radio ;
    }    
}