import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

	public static void main(String[] args) {
		
		Connection c;
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost/jardineria", "root", "");
			System.out.println("Conexion realizada correctamente");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		System.out.println("holatt");
	}

	}

}
