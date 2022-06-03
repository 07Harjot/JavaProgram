package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class P17_SwingInJava{

	public static void main(String[] args) {

		SwingInJava obj = new SwingInJava();
	}

}

class SwingInJava extends JFrame {

	JTextField t1;
	JTextField t2;

	JButton b1;
	JButton b2;
	JRadioButton r1;
	JRadioButton r2;
	JCheckBox c1;
	JCheckBox c2;
	
	JLabel l1;

	SwingInJava() {

		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("Sum");
		b2 = new JButton("Multi");

		l1 = new JLabel("Result");

		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		
		c1=new JCheckBox("Dancer");
		c2=new JCheckBox("Singer");
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(r1);
		add(r2);
		add(c1);
		add(c2);

		add(l1);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());

				if (e.getSource() == b1) {
					Integer sum = a1 + a2;
					l1.setText(sum.toString());
				}

				if (e.getSource() == b2) {
					Integer sum = a1 * a2;
					l1.setText(sum.toString());
				}
				if (r1.isSelected()) {
					l1.setText("is a Male");
				}
				if (r2.isSelected()) {
					l1.setText("is a Female");
				}
				if(c1.isSelected()) {
					l1.setText("is a Dancer");
				}
				if(c2.isSelected()) {
					l1.setText("is a Singer");
				}
				
				if(list.getSelectedIndex()!=-1) {
					
				}
			}
		};

		b1.addActionListener(al);
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}