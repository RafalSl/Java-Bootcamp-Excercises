package firstConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wykaz_p","rafal","rafal");
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery("select droga_p.nazwa_drogi_p, case when droga_p.skala_p = 'uiaa' then wyceny.uiaa when droga_p.skala_p = 'fr' then wyceny.fr when droga_p.skala_p = 'kurtyki' then wyceny.kurtyki else wyceny.usa end as 'Wycena', droga_p.l_przejsc_p, sciana.nazwa_sciany, miasto.nazwa_miasta from droga_p left join wyceny on droga_p.wycena_p = wyceny.wycena natural left join sciana natural left join miasto");
			while (result.next()){
				System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getInt(3) + " " + result.getString(4) + " " + result.getString(5));
			}
			con.close();
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("B³¹d");
		}
	}
}
