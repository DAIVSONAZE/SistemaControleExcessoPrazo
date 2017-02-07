package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.ConnectionFactory;

public class PresidioDao {
	
	private Connection connection;

	public PresidioDao() {
		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
//==============================================================================================//
	
	public void inserir(Presidio presidio) {
		try {
			String sql = "INSERT INTO presidio (nome, estado, cidade, tipo) VALUES (?,?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, presidio.getNome());
			stmt.setString(2, presidio.getEstado());
			stmt.setString(3, presidio.getCidade());
			stmt.setString(4, presidio.getTipo());
			

			stmt.execute();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
//==============================================================================================//

	
	public List<Presidio> listar() {

		try {
			List<Presidio> listaPresidio = new ArrayList<Presidio>();

			String sql = "SELECT * FROM presidio ORDER BY idPresidio";
			PreparedStatement stmt = this.connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Presidio presidios = new Presidio();
				
				presidios.setIdPresidio(rs.getInt("idPresidio"));
				presidios.setNome(rs.getString("nome"));
				presidios.setEstado(rs.getString("estado"));
				presidios.setCidade(rs.getString("cidade"));
				presidios.setTipo(rs.getString("tipo"));
				

				listaPresidio.add(presidios);
			}

			rs.close();
			stmt.close();
			connection.close();

			return listaPresidio;

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
