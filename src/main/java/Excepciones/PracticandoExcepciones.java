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
		
		
		
		
		
		
		
		
	}
}
