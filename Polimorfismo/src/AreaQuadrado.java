
public class AreaQuadrado {

	public static void main(String[] args) {

		int area;
		
		Quadrado objQuadrado = new Quadrado(4,4);
		area = objQuadrado.Area();
		
		Trapezio objTrapezio = new Trapezio(5,5);

		System.out.printf("A area do quadrado:%d\nA area do trapezio:%d",area,objTrapezio.Area());
		
	}

}
