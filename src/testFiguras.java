public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Rectangulo t3 = new Rectangulo("rectangulo1", 40, 10);
		Rombo t4 = new Rombo("rombo1", 4, 5, 10);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		Romboide t5 = new Romboide("Romboide 1", 5, 2);
		
		Trapecio t6 = new Trapecio("trapecio1", 5, 10, 8, 6, 7);
		
		imprimirCalculo(t1); imprimirCalculo(t2); imprimirCalculo(t4); imprimirCalculo(t6);
		imprimirCalculo(c1); imprimirCalculo(t3); imprimirCalculo(t5);
	}//main
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras