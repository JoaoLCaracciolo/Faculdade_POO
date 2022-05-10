
public class Quadrado extends FiguraGeometrica {

	public Quadrado(int Base,int Altura) {
		
		//Chama o constructor de SuperClasse
		super(Base, Altura);
		
	}
	
	//metodo de mesmo nome existente na superclasse
	public int Area() {
		
		int entArea;
		entArea = super.Area();
		return entArea;
		
	}
	
}
