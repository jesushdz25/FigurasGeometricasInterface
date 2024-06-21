
public class Trapecio implements FiguraGeometrica{
	private String name;
	private double altura;
	private double bmayor;
	private double bmenor;
	private double ladoIzquierdo;
	private double ladoDerecho;
	
	public Trapecio(String name, double altura, double bmayor, double bmenor, double ladoIzquierdo, double ladoDerecho ) {
		super();
		this.name = name;
		this.altura = altura;
		this.bmayor = bmayor;
		this.bmenor = bmenor;
		this.ladoIzquierdo= ladoIzquierdo;
		this.ladoDerecho=ladoDerecho;
	}//constructor

	@Override
	public double calcularArea() {
		return (getAltura()*(getBmayor()+getBmenor()))/2;
	}

	@Override
	public double calcularPerimetro() {
		return (getBmayor()+ getBmenor()+ getLadoIzquierdo()+getLadoDerecho());
	}

	@Override
	public String getName() {
		
		return name;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBmayor() {
		return bmayor;
	}

	public void setBmayor(double bmayor) {
		this.bmayor = bmayor;
	}

	public double getBmenor() {
		return bmenor;
	}

	public void setBmenor(double bmenor) {
		this.bmenor = bmenor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLadoIzquierdo() {
		return ladoIzquierdo;
	}

	public void setLadoIzquierdo(double ladoIzquierdo) {
		this.ladoIzquierdo = ladoIzquierdo;
	}

	public double getLadoDerecho() {
		return ladoDerecho;
	}

	public void setLadoDerecho(double ladoDerecho) {
		this.ladoDerecho = ladoDerecho;
	}

	@Override
	public String toString() {
		return "Trapecio [name=" + name + ", altura=" + altura + ", bmayor=" + bmayor + ", bmenor=" + bmenor
				+ ", ladoIzquierdo=" + ladoIzquierdo + ", ladoDerecho=" + ladoDerecho + "]";
	}

	
	

}
