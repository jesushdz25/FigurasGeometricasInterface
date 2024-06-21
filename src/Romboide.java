
public class Romboide implements FiguraGeometrica {
	private String name;
	private double base;
	private double altura;
	public Romboide(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura=altura;
	}//constructor
	@Override
	public double calcularArea() {
		return (getBase()*getAltura());
	}

	@Override
	public double calcularPerimetro() {
		return (2*getBase()+2*getAltura());
	}

	@Override
	public String getName() {
		return name;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Romboide [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	

}
