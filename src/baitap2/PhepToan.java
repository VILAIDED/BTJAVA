package baitap2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PhepToan extends Frame implements ActionListener{
	/**
	 * 
	 */

	Label lb1,lb2,lb3,lb;
	Button c_btn,tr_btn,nh_btn,ch_btn,exit_btn,reset_btn;
	TextField a_txt,b_txt,kq_txt;
	Panel pn,pn1,pn2,pn3,pn4;
	public void GUI() {
		lb = new Label("minh hoa cac phep toan");
		lb1 = new Label("Nhap a");
		lb2 = new Label("Nhap b");
		lb3 = new Label("Ket qua");
		a_txt = new TextField();
		b_txt = new TextField();
		kq_txt = new TextField();
		c_btn = new Button("Cong");
		tr_btn = new Button("Tru");
		nh_btn = new Button("Nhan");
		ch_btn = new Button("Chia");
		exit_btn = new Button("Exit");
		reset_btn = new Button("Reset");
		c_btn.addActionListener(this);
		tr_btn.addActionListener(this);
		nh_btn.addActionListener(this);
		ch_btn.addActionListener(this);
		exit_btn.addActionListener(this);
		reset_btn.addActionListener(this);
		pn = new Panel(new GridLayout(4,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3,2));
		pn3 = new Panel(new FlowLayout());
		pn4 = new Panel(new FlowLayout());
		pn1.add(lb);
		pn2.add(lb1);
		pn2.add(a_txt);
		pn2.add(lb2);
		pn2.add(b_txt);
		pn2.add(lb3);
		pn2.add(kq_txt);
		pn3.add(c_btn);
		pn3.add(tr_btn);
		pn3.add(nh_btn);
		pn3.add(ch_btn);
		pn4.add(exit_btn);
		pn4.add(reset_btn);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);
		setSize(400,300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == c_btn) {
			if(a_txt.getText() != "" &&b_txt.getText() != "") {
				int a = Integer.parseInt(a_txt.getText());
				int b = Integer.parseInt(b_txt.getText());
				kq_txt.setText(Integer.toString(a+b));
			}
				
		}
		if(e.getSource() == tr_btn) {
			
			if(a_txt.getText() != "" &&b_txt.getText() != "")
			{
				int a = Integer.parseInt(a_txt.getText());
				int b = Integer.parseInt(b_txt.getText());
				kq_txt.setText(Integer.toString(a-b));}
			
		}
		if(e.getSource() == nh_btn) {
			
			if(a_txt.getText() != "" &&b_txt.getText() != "") {
				int a = Integer.parseInt(a_txt.getText());
				int b = Integer.parseInt(b_txt.getText());
				kq_txt.setText(Integer.toString(a*b));
			}
			
		}
		if(e.getSource() == ch_btn) {
			
			if(a_txt.getText() != "" &&b_txt.getText() != "") {
				int a = Integer.parseInt(a_txt.getText());
				int b = Integer.parseInt(b_txt.getText());
			if(b==0) kq_txt.setText("Khong the chia 0 dc");
			else kq_txt.setText(Float.toString((float)a/b));
			}
		}
		if(e.getSource() == exit_btn) {
			System.exit(0);
		}
		if(e.getSource() == reset_btn) {
			a_txt.setText("");
			b_txt.setText("");
			kq_txt.setText("");
		}
		
	}
	public PhepToan(String title) {
		super(title);
		GUI();
	}
	public static void main(String args[]) {
		new PhepToan("Minh hoa phep toan");
	}
	

}
