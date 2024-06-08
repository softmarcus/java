
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteMemory {

	public static void main(String[] args) { 
		System.out.println("OK");
		// string conexao com o banco de dados
		String stringConexao = "jdbc:sqlite::memory:";

		// cria conexao com o banco na memoria
		try {
			Connection conexao = DriverManager.getConnection(stringConexao);
			System.out.println("conectou");

			criarTabela(conexao);
			inserir(conexao, 1, "kiara stolf");
			inserir(conexao, 2, "mike stolf");
			inserir(conexao, 3, "vinicius stolf");
			consultarTodos(conexao);
			conexao.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void criarTabela(Connection conexao) throws SQLException {
		String sql = "CREATE TABLE Aluno (" + "id INTEGER PRIMARY KEY," + "nome VARCHAR)";

		// envia comando sql para o banco de dados em memoria
		Statement comando = conexao.createStatement();
		comando.execute(sql);
		comando.close();
		System.out.println("tabela criada");

	}

	public static void inserir(Connection conexao, int id, String nome) throws SQLException {
		String sql = "INSERT INTO ALUNO (id,nome) VALUES (?,?)";

		PreparedStatement comando = conexao.prepareStatement(sql);
		comando.setInt(1, id);
		comando.setString(2, nome);
		comando.executeUpdate();
		comando.close();
		System.out.println("Dados inseridos!");
	}

	public static void consultarTodos(Connection conexao) throws SQLException {
		String sql = "SELECT * from Aluno";

		Statement comando = conexao.createStatement();
		ResultSet rs = comando.executeQuery(sql);
		System.out.println("\n-----Consultando o banco de dados------");
		while (rs.next()) {
			int id =rs.getInt("id");
			String nome = rs.getString("nome");
			
			System.out.println("id:"+ id + "\tNome:"+ nome);
		}
		comando.close();

	}
}
