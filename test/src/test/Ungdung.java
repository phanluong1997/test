package test;

import java.awt.FlowLayout;

import javax.swing.*;

public class Ungdung {
	
	public static void undungTUI() {
		Hinhvuong h = new Hinhvuong(6);
		System.out.print("\n >> Canh hv  : " + h.layCanh());
		System.out.print("\n >> Dien tich: " + h.layDientich());
		System.out.print("\n >> Chu vi   : " + h.layChuvi());
	}
	
	public static void setLayout(FlowLayout layout) {
		layout.setAlignment(FlowLayout.LEFT);
	}
	
	public static void ungdungGUI() {
		MyForm form = new MyForm();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//form.setVisible(true);
		form.setSize(300,100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ungdungGUI();
	}

}
