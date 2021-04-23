package baitap2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BacNhat extends Frame implements ActionListener{
	Label lb1,lb2,lb3,lb;
	TextField a_txt,b_txt,kq_txt;
	Button tinh_btn,reset_btn,thoat_btn;
	Panel pn,pn1,pn2,pn3;
	public void GUI() {
		lb = new Label(" Giai phuong trinh bac nhat");
		lb1 = new Label("Nhap a");
		lb2 = new Label("Nhap b");
		lb3 = new Label("Ket qua");
		a_txt = new TextField();
		b_txt = new TextField();
		kq_txt = new TextField();
		tinh_btn = new Button("Tinh");
		reset_btn = new Button("Reset");
		thoat_btn = new Button("Thoat");
		tinh_btn.addActionListener(this);
		reset_btn.addActionListener(this);
		thoat_btn.addActionListener(this);
		pn = new Panel(new GridLayout(3,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3,2));
		pn3 = new Panel(new GridLayout(1,3));
		pn1.add(lb);
		pn2.add(lb1);
		pn2.add(a_txt);
		pn2.add(lb2);
		pn2.add(b_txt);
		pn2.add(lb3);
		pn2.add(kq_txt);
		pn3.add(tinh_btn);
		pn3.add(reset_btn);
		pn3.add(thoat_btn);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String args[]) {
//		
	//	new BacNhat("Giai phuong trinh bac 1");
	//
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tinh_btn) {
			int a = Integer.parseInt(a_txt.getText());
			int b = Integer.parseInt(b_txt.getText());
			if(a!=0) kq_txt.setText(Float.toString((float)-b/a));
			else {
				if(b==0) kq_txt.setText("Phuong tinh vo so nghiem");
				else kq_txt.setText("Phuong trinh vo nghiem");
			}
		}
		if(e.getSource() == reset_btn) {
			a_txt.setText("");
			b_txt.setText("");
			kq_txt.setText("");
		}
		if(e.getSource() == thoat_btn) {
			System.exit(0);
		}
		
	}
	public BacNhat(String st) {
		super(st);
		GUI();
	}
}

