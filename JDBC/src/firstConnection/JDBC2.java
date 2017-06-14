package firstConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC2 {
	static Scanner rl = new Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		JDBC2 z = new JDBC2();
		String dalej;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testowa","rafal","rafal");
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			do {
				stmt.executeUpdate(z.sqlInsert());
				System.out.print("Dodano rekord do tabeli uzytkownicy.");
				System.out.print("Dodaæ kolejny wpis? (t/n) ");
				dalej = rl.nextLine();
			} while (dalej.equals("t"));
			
			System.out.print("Zapisaæ wszystkie wprowadzone dane? (t/n)");
			dalej = rl.nextLine();
			if (dalej.equals("t")) {
				con.commit();
			} else {
				con.rollback();
			}
			
			ResultSet result = stmt.executeQuery("SELECT * FROM uzytkownicy");
			while (result.next()){
				System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("B³¹d");
		}
	}
	
	public String sqlInsert() {
		System.out.print("Podaj imiê: ");
		String imie = rl.nextLine();
		System.out.print("Podaj nazwisko: ");
		String nazwisko = rl.nextLine();
		System.out.print("Podaj PESEL: ");
		String pesel = rl.nextLine();
		String sql = "INSERT INTO uzytkownicy (imie, nazwisko, pesel) VALUES ('" + imie + "', '" + nazwisko + "', '" + pesel + "')";
		return sql;
	}
}
