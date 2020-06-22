import java.util.Scanner;
public class Resistencia {

	public static void main(String[] args) {
		//variables
		float Resistencia1;
		float Resistencia2;
		float Resistencia3;
		float ResistenciaTotal;
		
		Scanner sc = new Scanner(System.in);
		
		//Recibe el valor de las resistencias
		Resistencia1=Float.parseFloat(sc.nextLine());
		Resistencia2=Float.parseFloat(sc.nextLine());
		Resistencia3=Float.parseFloat(sc.nextLine());
		
		//Valida que las resistencias sean mayor que cero
		if(Resistencia1<=0 || Resistencia2<=0 || Resistencia3<=0) {
			System.out.println("Las resistencias no son distintas a cero");
		}
		else {//si las resistencias son mayor que cero, calcula la resistencia total
			Resistencia1=1/Resistencia1;			
			Resistencia2=1/Resistencia2;			
			Resistencia3=1/Resistencia3;
			ResistenciaTotal= 1/(Resistencia1+Resistencia2+Resistencia3);
			System.out.printf("La Resistencia total es: " + ResistenciaTotal);
		}
	}

}
