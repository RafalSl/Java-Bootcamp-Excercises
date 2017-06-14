package second_steps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class List extends JFrame implements ActionListener, ListSelectionListener {
	JList<String> imiona, nazwiska;
	String wynik;
	
	public List(String title, int szer, int wys) {
		super(title);
		setSize(szer, wys);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		DefaultListModel<String> l1 = new DefaultListModel<>();
		l1.addElement("Imiê1");
		l1.addElement("Imiê2");
		imiona = new JList<>(l1);
		imiona.setBounds(50, 50, 150, 100);
		imiona.addListSelectionListener(this);
		DefaultListModel<String> l2 = new DefaultListModel<>();
		l2.addElement("Nazwisko1");
		l2.addElement("Nazwisko2");
		nazwiska = new JList<>(l2);
		
		nazwiska.setBounds(250, 50, 150, 100);
		nazwiska.addListSelectionListener(this);
		add(imiona);
		add(nazwiska);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void valueChanged(ListSelectionEvent l) {
		try {
			wynik = imiona.getSelectedValue() + " " + nazwiska.getSelectedValue();
			int dlugosc = imiona.getSelectedValue().length() + nazwiska.getSelectedValue().length();
			System.out.println(wynik + " " + dlugosc);
		} catch (Exception e) {
			System.out.println("Zaznacz jedno imiê i jedno nazwisko");
		}
		
	}

}
