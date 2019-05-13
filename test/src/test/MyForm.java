package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyForm extends JFrame implements ActionListener {
	
	JPanel khung;
	JLabel nhan1, nhan2;
	JTextField nhap;
	JTextField hienthi;
	JButton them;
	JButton lonnhat;
	
	public MyForm() {
		super("GUI - Hinh vuông");
		khung 	= new JPanel();
		nhan1 	= new JLabel("Nhập cạnh: ");
		nhan2 	= new JLabel("Hiển thị: ");
		nhap 	= new JTextField();
		hienthi	= new JTextField();
		them 	= new JButton("Thêm");
		lonnhat = new JButton("Tìm diện tích lớn nhất");
		
		khung.setLayout(new GridLayout(3,2));
		khung.add(nhan1);	khung.add(nhap);
		khung.add(nhan2);	khung.add(hienthi);
		khung.add(them);	khung.add(lonnhat);
		
		this.add(khung);
		this.setVisible(true);
		
		them.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == them) {
			this.hienthi.setText(this.nhap.getText());
			this.nhap.setText("");
		}
	}
}
