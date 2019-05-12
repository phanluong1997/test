package test;

public class Hinhvuong {
	private int canh = 0;
	
	public Hinhvuong(int canh) {
		this.canh = canh;
	}
	
	public int layCanh() {
		return this.canh;
	}
	
	public long layDientich() {
		return (long)this.canh * (long)this.canh;
	}
	
	public long layChuvi() {
		return (long)this.canh + (long)this.canh;
	}
}
