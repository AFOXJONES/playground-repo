package propiedades;

import java.util.*;

public class UsandoPropertiesYLocale {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("QUE IDIOMA DESEA VER");
		System.out.println("1.Español");
		System.out.println("2.INGLES");
		System.out.println("3.Español argentina");
		int opt=sc.nextInt();
		ResourceBundle msg;
		if(opt==1) {
		    msg=ResourceBundle.getBundle("msg",new Locale ("es","ES"));
		}else {
			if(opt==2) {
		   msg=ResourceBundle.getBundle("msg",new Locale ("en","US"));
			}else {
				 msg=ResourceBundle.getBundle("msg",new Locale ("es","AR"));
			}
		}
		
		String boton1=msg.getString("app.main.boton1");
		String boton2=msg.getString("app.main.boton2");
		String panel=msg.getString("app.main.panel");
		String bebida=msg.getString("app.bebida");
		
		System.out.println(boton1);
		System.out.println(boton2);
		System.out.println(panel);
		System.out.println(bebida);
		
	
		
		
		
	}

}
