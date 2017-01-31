
public class Area {
	private int a, b, c;


	Area(){
		a=0;
		b=0;
		c=0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int areaQuadrado(){
		return a*a;
	}

	public int areaRetangulo(){
		return a*b;
	}

	public int areaCubo(){
		return a*b*c;
	}

	public void mostraArea() {
		System.out.println("A area é de:");

	}




}
