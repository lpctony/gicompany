package Model;

public class porder {
	private Integer id, A, B, C;
	private String desk;

	public porder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public porder(Integer a, Integer b, Integer c, String desk) {
		super();
		A = a;
		B = b;
		C = c;
		this.desk = desk;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getA() {
		return A;
	}

	public void setA(Integer a) {
		A = a;
	}

	public Integer getB() {
		return B;
	}

	public void setB(Integer b) {
		B = b;
	}

	public Integer getC() {
		return C;
	}

	public void setC(Integer c) {
		C = c;
	}

	public String getDesk() {
		return desk;
	}

	public void setDesk(String desk) {
		this.desk = desk;
	}

}
