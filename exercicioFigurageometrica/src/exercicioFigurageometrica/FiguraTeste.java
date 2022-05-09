package exercicioFigurageometrica;

public class FiguraTeste {
	
	public static void main(String[] args) {
		
		Quadrado ObjQuadrado1 = new Quadrado(4f, 4f);
		
		Triangulo ObjTriangulo1 = new Triangulo(3f,5f);
		
		Trapezio ObjTrapezio1 = new Trapezio(9.6f,5.4f);
		
		System.out.println("AREA DO QUADRADO 1 = "+ ObjQuadrado1.Area());
		
		System.out.println("AREA DO TRIANGULO 1 = "+ ObjTriangulo1.Area());
		
		System.out.println("AREA DO TRAPEZIO 1 = "+ ObjTrapezio1.Area());

	}

	
}
