package EstruturaSequencial_Exercicio_6;
import java.util.Scanner;
//import java.lang.Math;

public class CircleArea {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Me diga o raio do circulo que deseja descobrir a área:");
		System.out.print(Area(userInput.nextDouble()));
		userInput.close();
	}
	public static double Area(double r) {
		return Math.PI*(r*r);
	}
}
