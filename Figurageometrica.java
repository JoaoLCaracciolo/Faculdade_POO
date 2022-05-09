package exercicioFigurageometrica;

public class Figurageometrica {
		   private float ftlBase, ftlAltura;
		   public Figurageometrica(float Base, float Altura)
		   {
		            this.ftlBase = Base;
		            this.ftlAltura = Altura;
		     }
		     public float Area()
		     {
		           float area;
		           area = ftlBase * ftlAltura;
		           return area;
		      }

}
