package test;

public class Hinhvung {
	private int canh = 0;
	
	public Hinhvung(int canh) {
		this.canh = canh;
	}
	
	public long layDientich() {
		return (long)this.canh * (long)this.canh;
	}
	
	public long layChuvi() {
		return (long)this.canh + (long)this.canh;
	}
}
