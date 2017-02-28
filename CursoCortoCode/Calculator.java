import java.lang.Math; 

public class Calculator
{
  public static void main(String[] args)
  {
	int suma = sumar(30, 10);
    showResult(suma);
    
    int resta = restar(40, 20);
    showResult(resta);
    
  }
  public static int sumar(int x, int y){
    int total = x + y;
    return total;
  }
  public static int restar(int x, int y){
    int total = x - y;
    return total;
  }
  public static void showResult(int result){
   System.out.println("El resultado de la operacion es: "+ result); 
  }
}
