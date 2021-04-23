package baitap2;
import java.awt.*;
import java.awt.event.*;
public class ItemEve extends Frame implements ItemListener,ActionListener{
	CheckboxGroup cg;
	Checkbox male;
	Checkbox female;
	List list;
	Choice choice;
	Label show_txt;
	Button exit_btn;
	Panel pn,pn1,pn2,pn3,pn4;
	
	public void GUI() {
		cg = new CheckboxGroup();
		 male = new Checkbox("Male",cg,false);
		 female = new Checkbox("Female",cg,false);
		show_txt = new Label("the item is display here");
		list = new List(3,false);
		list.add("MS DOS");
		list.add("Window");
		list.add("Linux");
		choice = new Choice();
		choice.add("tiger");
		choice.add("lion");
		exit_btn = new Button("Exit");
		male.addItemListener(this);
		female.addItemListener(this);
		
		list.addItemListener(this);
		choice.addItemListener(this);
		exit_btn.addActionListener(this);
		pn = new Panel(new GridLayout(4,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new FlowLayout());
		pn3 = new Panel(new FlowLayout());
		pn4 = new Panel(new FlowLayout());
		pn1.add(male);
		pn1.add(female);
		pn2.add(list);
		pn3.add(choice);
		pn4.add(show_txt);
		pn4.add(exit_btn);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);
		setSize(300,300);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exit_btn) {
			System.exit(0);
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == male) {
			show_txt.setText("clicked on radio btn");
		}
		if(e.getSource() == female) {
			show_txt.setText("clicked on radio btn");
		}
		
		if(e.getSource() == list) {
			show_txt.setText("clicked on list");
		}
		if(e.getSource() == choice) {
			show_txt.setText("clicked on choice");
		}
		
		
		
		
	}
	public ItemEve(String title) {
		super(title);
		GUI();
	}
	public static void main(String args[]) {
		new ItemEve("ItemEvent test");
	}

}
