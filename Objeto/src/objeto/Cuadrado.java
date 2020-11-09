package objeto;

public class Cuadrado {
	protected float lado;
	
	public Cuadrado (float lado) {
		this.lado = lado;
	}
	
	public float getPerimetro() {
		float perimetro = 12*lado;
		
		return perimetro;
	}
	
	public float getArea() {
		float area = (lado*lado*lado);
		
		return area;
	}

}
