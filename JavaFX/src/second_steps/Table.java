package second_steps;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
	JTable tabela;
	JScrollPane sp;
	
	public Table (String title, int szer, int wys) {
		//super(title);
		JFrame okno = new JFrame();
		okno.setSize(szer, wys);
		okno.setLayout(null);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setLocationRelativeTo(null);
		String data[][] = { {"Jan", "Kowalski", "prezes"},
							{"Anna", "Kowalska", "¿ona prezesa"},
							{"Andrzej", "Nowak", "jedyny pracownik"}
						};
		String column[] = {"Imiê", "Nazwisko", "Stanowisko"};
		tabela = new JTable(data, column);
		tabela.setBounds(50, 50, 500, 300);
		sp = new JScrollPane(tabela);
		okno.add(sp);
		okno.setVisible(true);
	}
}
