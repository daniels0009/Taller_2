package geometria;
 

public class Cuadrado implements Figura
{
    private double lado;
    private double areaCuadrado;
    private double PerimetroCuadrado;
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }
 
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
 
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    public double PerimetroCuadrado() 
    {
        return PerimetroCuadrado;
    }  
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }

	@Override
	public void perimetro() {
		
		PerimetroCuadrado = lado * 4;
	}    
}