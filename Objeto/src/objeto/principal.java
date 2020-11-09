package objeto;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		Cuadrado cl;
		Cubo Cu;
		float lado;
		
		int a;
		Scanner S = new Scanner(System.in);
		
		do {
			System.out.println("1 obten el Perimetro y Area de un Cuadrado");
			System.out.println("2 Obten el Perimetro y Volumen de un Cubo ");
			System.out.println("3 para salir");
			a = S.nextInt();
			
		}while(a>3);
		
		switch (a) {
		case 1:
			lado = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado"));
			
			cl = new Cuadrado(lado);
			System.out.println("El perimetro es "+ cl.getPerimetro() );
			System.out.println("El Area es "+ cl.getArea());
			break;
		case 2:
			lado = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado"));
			
			Cu = new Cubo(lado);
			System.out.println("El perimetro es "+ Cu.getPerimetroCubo() );
			System.out.println("El Area es "+ Cu.getAreaCubo() );
			break;
		case 3:
			System.out.print("saliendo");
			break;
		
		}
		
		
		

	}

}
