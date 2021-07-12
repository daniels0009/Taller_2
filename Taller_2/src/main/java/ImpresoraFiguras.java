package geometria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpresoraFiguras 
{
   
    public static void main(String[] args) 
    {
    	
    	 Scanner sn = new Scanner(System.in);
         boolean salir=false;
         int opcion;
        {
        	 
     

        	   System.out.println("1. Cuadrado");
               System.out.println("2. Circulo");
               System.out.println("3. Triangulo ");
               System.out.println("4. Salir");
               
               try {
            	   
           
               
               System.out.println("introduce un numero ");
               opcion=sn.nextInt();
               
               switch(opcion) {
               
                case 1:
                	System.out.println("Figura Cuadrado");
                	System.out.println("Introduce el lado:");
                    double lado = sn.nextDouble();
            	  Cuadrado cuadrado = new Cuadrado(lado);
                  cuadrado.area();
                  cuadrado.perimetro();
                 	System.out.println("Figura Cuadrado");
                  System.out.println("Área del cuadrado  " + 
                          cuadrado.getareaCuadrado());
                  System.out.println("perimetro del cuadrado  " + 
                          cuadrado.PerimetroCuadrado());

                      
                      break;
              case 2:
            	  System.out.println("Figura Circulo");
            	  System.out.println("Introduce el radio:");
                  double radio = sn.nextDouble();
        Circulo circulo = new Circulo(radio);
        circulo.area();
        circulo.perimetro();
        System.out.println("Figura Triangulo");
        System.out.println("Área del círculo  " + 
                circulo.getAreaRadio());
        System.out.println("perimetro del circulo  " + 
                circulo.getPerimetroRadio());
        break;
        
              case 3:
            	  System.out.println("Figura Triangulo");
            	  
            	  System.out.println("Introduce la base:");
                  double base = sn.nextDouble();
                  System.out.println("Introduce la altura:");
                  double altura = sn.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.area();
        triangulo.perimetro();
        System.out.println("Figura Triangulo");
        System.out.println("Área del triángulo  " + 
                triangulo.getareaTriangulo()); 
        System.out.println("perimetro del triángulo  " + 
                triangulo.getperimetroTriangulo());
        
        break;
                  
   
         case 4:
        	 salir=true;
        	 
        	 break;
        	 default:
        	 System.out.println("opcion entre 1 y 4"); 
               }
               }catch(InputMismatchException e) {
            	   System.out.println("Debes un numero");
            	   sn.next();
               }
         }
         System.out.println("fin del  menu");
    }
    
}

       


               

  
         
    
    
        




