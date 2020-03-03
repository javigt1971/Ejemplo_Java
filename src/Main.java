
        import java.lang.reflect.Array;
import java.util.Scanner;
/*Autor:Luis Gutierrez
 *Metodo para devolver denominaciones en cajeros automaticos
 *Denominaciones 1000,500,200,100,50
 *Con validaciones:
 *-1.-No puede ser mayor a 5000
 *-2.-No se debe de entregar más de 2 billetes de 1000
 *-3.-No se debe de entregar más de 4 billetes de 500
 *-4.-No se debe de entregar más de 5 billetes de 200
 *-5.-No se debe de entregar más de 10 billetes de 100
 *-6.-No se debe de entregar más de 10 billetes de 50
 */
public class Main {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int billetes_de_100=0;
	        int billetes_de_1000=0;
	        int billetes_de_200=0;
	        int billetes_de_50=0;
	        int billetes_de_500=0;
	        int cantidad_de_dinero=0;
	        System.out.print("Ingrese el valor de cantidad de dinero: ");
	        cantidad_de_dinero = in.nextInt();
	        int cant=0;
	        cant=cantidad_de_dinero;
		        if(cantidad_de_dinero<=5000 &&cantidad_de_dinero>0){
			        	if(cantidad_de_dinero/1000>2){
			        		billetes_de_1000=2;
			        		cantidad_de_dinero=cantidad_de_dinero-1000*2;
			        	}else{
			                billetes_de_1000=cantidad_de_dinero/1000;
			        		cantidad_de_dinero=cantidad_de_dinero-1000*billetes_de_1000;
			        	}
			        	if(cantidad_de_dinero/500>4){
			        		billetes_de_500=4;
			        		cantidad_de_dinero=cantidad_de_dinero-500*4;
			        	}else{
			                billetes_de_500=cantidad_de_dinero/500;
			            	cantidad_de_dinero=cantidad_de_dinero-500*billetes_de_500;
			        	}
			        	if(cantidad_de_dinero/200>5){
			        		billetes_de_200=5;
			        		cantidad_de_dinero=cantidad_de_dinero-200*5;
			        	}else{
			                billetes_de_200=cantidad_de_dinero/200;
			            	cantidad_de_dinero=cantidad_de_dinero-200*billetes_de_200;
			        	}
 
		            	if(cantidad_de_dinero/100>10){
			        		billetes_de_100=10;
			        		cantidad_de_dinero=cantidad_de_dinero-100*10;
			        	}else{
			                billetes_de_100=cantidad_de_dinero/100;
			            	cantidad_de_dinero=cantidad_de_dinero-100*billetes_de_100;
			        	}
 
		            	if(cantidad_de_dinero/50>10){
			        		billetes_de_50=10;
			        		cantidad_de_dinero=cantidad_de_dinero-50*10;
			        	}else{
			                billetes_de_50=cantidad_de_dinero/50;
			            	cantidad_de_dinero=cantidad_de_dinero-50*billetes_de_50;
			        	}
		        }
		        System.out.println("Valor de billetes de 1000: " + billetes_de_1000);
		        System.out.println("Valor de billetes de 500: " + billetes_de_500);
		        System.out.println("Valor de billetes de 200: " + billetes_de_200);
		        System.out.println("Valor de billetes de 100: " + billetes_de_100);
		        System.out.println("Valor de billetes de 50: " + billetes_de_50);
 
	    }
}
    
    


    }
    
}
