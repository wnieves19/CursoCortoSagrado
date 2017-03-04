import java.util.Scanner;
/**
 * Recibe el input del usuario y los suma y resta luego presenta el resultado
 */
public class InputReceiverCalculator{

     public static void main(String []args){
         
          System.out.println("Bienvenidos al programa de suma y resta simple");
	
	        System.out.println("Si entras dos numeros los sumare y los restare por ti");
	
	        Scanner reader = new Scanner(System.in);
	        System.out.println("Entra un numero: ");
	        int n = reader.nextInt();
	
	        System.out.println("Entra otro numero");
	        int y = reader.nextInt();

        int resultadoSuma = sumar(n, y);
        String suma = "suma";
        showResult(suma, resultadoSuma);
        
        int resultadoResta = restar(n, y);
        showResult("resta", resultadoResta);
     }
     
   /**
   * Suma dos numeros enteros recibidos y retorna el total
   */
 public static int sumar(int primerNumero, int y){
    int total = primerNumero + y;
    return total;
  } 
  
  /**
   * Resta dos numeros enteros recibidos y retorna el total
   */
  public static int restar(int x, int y){
    int total = x - y;
    return total;
  } 
  
  /**
   * Este metodo acepta dos parametros, el primero es un string que 
   * debe de ser el nombre del tipo de operacion que estoy haciendo y
   * el segundo es el resultado de la operacion que debe de ser un entero.
   */
  public static void showResult(String operacion, int total){
  System.out.println("El resultado de la "+operacion+" es: "+ total); 
  } 
  
}
