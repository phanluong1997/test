package test;

public class Hinhvuong {
	private double canh = 0.0;
	
	public Hinhvuong(double canh) {
		this.canh = canh;
	}
	
	public double layCanh() {
		return this.canh;
	}
	
	public double layDientich() {
		return this.canh * this.canh;
	}
	
	public double layChuvi() {
		return this.canh + this.canh + this.canh + this.canh;
	}
}
