package Excepciones;

import java.util.*;

public class PracticandoExcepciones {

	public static void main(String[] args) {
		//Solo se deben tratar las excepciones que no sean en tiempo de ejecucion (RUNTIMEEXCEPTION, estas se deben tratar con logica de programacion)
		
		//EN su lugar se deberan tratar las demas (IOException...)
		
		
		
		try {
			System.out.println("Intento ejecutarme");
		}catch(Exception e){
			System.out.println("Doy un error y lo muestro: "+e);
		}finally {
			System.out.println("Me ejecuto siempre");
		}
		
		//EL finally se ejecuta si o si, entre en el catch o no
		// Esencialmente se utilza para aquellos metodos que implementan la interfaz CLOSEABLE, 
		//para cerrar los procesos ya que sino puede causar problemas
		//pero tambien para hacer cualquier cosa
		
		
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Ingresamos un numero para dar error, un string para continuar:");
		String a=sc.nextLine();
		
		}catch(Exception e){
			System.out.println("Doy un error y lo muestro: "+e);
		}finally {
			sc.close();
		}
		
		
		//si un metodo hace throws de una excepcion, se debe tratar aqui o volver a hacer throws en el mismo metodo
		//te obliga a tratar la excepcion o hacer throws
		int resultado = 0;
		try {
			resultado=sumar(3,30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//aqui se tratan las excepciones propias
		try {
			comprobarResult(resultado);
		} catch (ExcepcionPropia e) {
			System.out.println("Tenemos un error: "+e);
		}

		String a="pepe";
		String b="pepe";
		a.equals(b);
		
		
	}
	
	//para no tratar una excepcion se añade throws NombreExcepcion
	
	public static int sumar(int a,int b) throws Exception{
		return a+b;
	}
	
	
//	para tirar una excepcion propia se añade throw new excepcion
//	se puede hacer de dos formas, pasando el mensaje directamente al constructor y tratandolo en el metodo, o pasandolo al siguiente metodo y tratarlo ahi
	public static void comprobarResult(int r) throws ExcepcionPropia {
		if(r<10) {
			throw new ExcepcionPropia();
		}
		if(r>30) {
			
			  try {
		          // Lanzar la excepción personalizada
		          throw new ExcepcionPropia("Este es un mensaje de error personalizado");
		      } catch (ExcepcionPropia e) {
		          // Capturar y manejar la excepción personalizada
		          System.out.println("Se ha producido una excepción: " + e.getMessage());
		      }
		}
	}
}
