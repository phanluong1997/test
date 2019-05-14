package test;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MyForm extends JFrame implements ActionListener {
	
	/**
	 * Không cần để ý đến dòng sau
	 */
	private static final long serialVersionUID = 1L;

	
	ArrayList<Hinhvuong> dayhv = new ArrayList<Hinhvuong>();
	
	JPanel		khung;
	JLabel		nhan1, nhan2;
	JTextField 	nhap;
	JTextField 	hienthi;
	JButton 	them;
	JButton 	lonnhat;
	
	public MyForm() {
		super("GUI - Hinh vuông");
		khung 	= new JPanel();
		nhan1 	= new JLabel("Nhập cạnh: ");
		nhan2 	= new JLabel("Hiển thị: ");
		nhap 	= new JTextField();
		hienthi	= new JTextField();
		//hienthi.setEnabled(false);
		them 	= new JButton("Thêm hình vuông");
		lonnhat = new JButton("Tìm diện tích lớn nhất");
		
		khung.setLayout(new GridLayout(3,2));
		khung.add(nhan1);	khung.add(nhap);
		khung.add(nhan2);	khung.add(hienthi);
		khung.add(them);	khung.add(lonnhat);
		
		this.add(khung);
		this.setVisible(true);
		
		them.addActionListener(this);
		lonnhat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == them)		action_Them_button();
		if (e.getSource() == lonnhat)	action_Hienthi_button();
	}
	
	public void action_Them_button() {
		try {
			double canh = Double.parseDouble(this.nhap.getText());
			dayhv.add(new Hinhvuong(canh));
			if (this.hienthi.getText().length() == 0)
				 this.hienthi.setText(Double.toString(canh));
			else this.hienthi.setText(this.hienthi.getText()+ "," + canh);
		}
		catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Nhập lại cạnh (số)!");
        }

		this.nhap.setText("");
	}
	
	public void action_Hienthi_button() {
		double max = 0.0;
		for (Hinhvuong hv : dayhv) 
			max = (hv.layDientich() > max) ? hv.layDientich() : max;
		this.hienthi.setText(Double.toString(max));
	}
}
