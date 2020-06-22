import java.util.Scanner;
public class rectangulo {

	public static void main(String[] args) {
	
		int alto, largo, area, perimetro;
		float x, areax, perimetrox;
		Scanner sc = new Scanner(System.in);
		
		// adquiere los valores para alto y largo
		alto=sc.nextInt();
		largo=sc.nextInt();

		//adquiere x
		x=sc.nextFloat();
		if (x>=alto || x>= largo) {
			System.out.printf("No se puede realizar la operación (x sale del area)");			
		}
		else {
			//calcula area y perímetro
			area=alto*largo;
			perimetro= 2*(alto+largo);
			
			//salida
			System.out.print( area );
			System.out.println(" " + perimetro);
			
			areax=(alto-(x*2))*(largo-(x*2));
			perimetrox= 2*((alto-(x*2))+(largo-(x*2)));
			
			System.out.print(areax);
			System.out.print(" " + perimetrox);
		}
	}

}
