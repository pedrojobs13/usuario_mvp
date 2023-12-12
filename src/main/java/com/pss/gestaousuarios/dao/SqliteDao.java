package com.pss.gestaousuarios.dao;

import com.pss.gestaousuarios.model.Usuario;
import com.pss.gestaousuarios.util.UsuarioAutorizado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SqliteDao implements UsuarioDao {
  private Connection connection;

  public SqliteDao() {
    try {
      connection = DriverManager.getConnection("jdbc:sqlite: banco.db");

      String sql =
          "CREATE TABLE IF NOT EXISTS usuarios ("
              + "    id     INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL,"
              + "    nome   TEXT    NOT NULL,"
              + "    senha  TEXT    NOT NULL,"
              + "    tipo   INTEGER NOT NULL DEFAULT 0,"
              + "    estado INTEGER NOT NULL DEFAULT 0,"
              + "    excluido INTEGER NOT NULL DEFAULT 0"
              + ");";

      Statement stmt = connection.createStatement();
      stmt.execute(sql);

    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
  @Override
  public List<Usuario> listarUsuarios() {
    String sql = "SELECT * FROM usuarios WHERE excluido = ?";

    List<Usuario> usuarios = new ArrayList<>();
    try {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, 0);

      try (ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
          Usuario usuario = new Usuario(
              rs.getString("nome"),
              rs.getString("senha"),
              rs.getInt("estado"),
              rs.getString("tipo")
          );
          usuarios.add(usuario);
        }
      }
    } catch (SQLException e) {
      throw new IllegalArgumentException("Erro ao listar usuários: " + e.getMessage());
    }
    return usuarios;
  }


  @Override
  public void inserir(Usuario usuario) {
    Objects.requireNonNull(usuario);

    String sql = "INSERT INTO usuarios(nome, senha, estado, tipo) VALUES (?, ?, ?, ?)";

    try {
      PreparedStatement pstmt = connection.prepareStatement(sql);
      pstmt.setString(1, usuario.getNome());
      pstmt.setString(2, usuario.getSenha());
      pstmt.setInt(3, usuario.getEstado());
      pstmt.setString(4, usuario.getTipo());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public void  getUsuarios(int id) {

    String sql = "SELECT * FROM usuarios WHERE excluido = ?";

    List<UsuarioAutorizado> usuarios = new ArrayList<>();
    try  {
      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setInt(1, 0);

      try (ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
          UsuarioAutorizado usuarioAutorizado =
              new UsuarioAutorizado(
                  rs.getLong("id"), rs.getString("nome"), rs.getInt("estado"), rs.getInt("tipo"));

          usuarios.add(usuarioAutorizado);
        }
      }
    } catch (SQLException e) {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public void atualizar(UsuarioAutorizado usuario, int id) {
    String sql = "UPDATE cliente SET nome = ? , " + "email = ? " + "WHERE id = ?";

    try {
      PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, Integer.parseInt("Autorizado"));
        ps.setLong(2, usuario.getId());
        ps.setInt(3, 0);

        ps.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException("Não foi possível atualizar objeto, pois o mesmo não existe");
    }
  }

  @Override
  public void deletar(int id) {
    String sql = "DELETE FROM cliente WHERE id = ?";

    try {
      PreparedStatement pstmt = connection.prepareStatement(sql);

      pstmt.setInt(1, id);
      pstmt.executeUpdate();

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }

  }
}
