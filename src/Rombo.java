
public class Rombo implements FiguraGeometrica {
	private String name;
	private double lado;
	private double diagMenor;
	private double diagMayor;
	
	public Rombo(String name, double lado, double diagMenor, double diagMayor) {
		super();
		this.name = name;
		this.lado = lado;
		this.diagMenor= diagMenor;
		this.diagMayor= diagMayor;
	}//constructor

	@Override
	public double calcularArea() {
		return (getDiagMayor()*getDiagMenor()/2);
	}

	@Override
	public double calcularPerimetro() {
		return (getLado()*4) ;
	}

	@Override
	public String getName() {
		return name;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getDiagMenor() {
		return diagMenor;
	}

	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}

	public double getDiagMayor() {
		return diagMayor;
	}

	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rombo [name=" + name + ", lado=" + lado + ", diagMenor=" + diagMenor + ", diagMayor=" + diagMayor + "]";
	}
	
	
	

}
