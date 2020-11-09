package objeto;

public class Cubo extends Cuadrado {
	
	
	public Cubo(float lado) {
		super(lado);
	}
	
	public float getPerimetroCubo() {
		float perimetro = 4*lado;
		
		return perimetro;
	}
	
	public float getAreaCubo() {
		float area = (lado*lado);
		
		return area;
	}

}
