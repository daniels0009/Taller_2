package geometria;

public class Triangulo implements Figura
{
    private double base;
    private double altura;
    private double areaTriangulo;
    private double perimetroTriangulo;
 
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }
 
    public double getBase() 
    {
        return base;
    }
 
    public void setBase(double base)
    {
        this.base = base;
    }
 
    public double getAltura() 
    {
        return altura;
    }
 
    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
 
    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }
    public double getperimetroTriangulo() 
    {
        return perimetroTriangulo;
    }
    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }

	@Override
	public void perimetro() {
		perimetroTriangulo = base + (altura*2);
		
	}    
    
}