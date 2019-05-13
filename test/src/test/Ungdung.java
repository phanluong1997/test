package test;

import javax.swing.JFrame;

public class Ungdung {
	/*
	 * Ứng dụng dòng lệnh
	 */
	public static void undungTUI() {
		Hinhvuong h = new Hinhvuong(6);
		System.out.print("\n >> Canh hv  : " + h.layCanh());
		System.out.print("\n >> Dien tich: " + h.layDientich());
		System.out.print("\n >> Chu vi   : " + h.layChuvi());
	}
	
	/*
	 * Ứng dụng giao tiếp người dùng đồ họa - GUI
	 */
	public static void ungdungGUI() {
		MyForm form = new MyForm();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(300,120);
	}
	
	public static void main(String[] args) {
		ungdungGUI();
	}

}
