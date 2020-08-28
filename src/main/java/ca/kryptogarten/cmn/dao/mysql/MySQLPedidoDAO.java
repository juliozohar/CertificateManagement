package ca.kryptogarten.cmn.dao.mysql;

import ca.kryptogarten.cmn.dao.interfaces.PedidoDAO;
import ca.kryptogarten.cmn.model.PedidoTO;
import ca.kryptogarten.utils.JDBCUtils;

import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class MySQLPedidoDAO implements PedidoDAO {

    private Connection connection;

    private static final String insertPedido =
            "INSERT INTO PEDIDO (CLIENT_ID, TIMESTAMP_PEDIDO, SCHEMA_K, SCHEMA_ID, QTD_DEMANDADA) VALUES (?,?,?,?,?)";

    private static final String deletePedido =
            "DELETE FROM PEDIDO WHERE " +
                    "CLIENT_ID = ? AND " +
                    "TIMESTAMP_PEDIDO = ?";

    public MySQLPedidoDAO(Connection _connection){
        try {
            String useDatabase = "USE KRYPTOGARTEN";
            this.connection = _connection;
            this.connection.setAutoCommit(false);
            Statement stmtDb = connection.createStatement();
            stmtDb.execute(useDatabase);
        } catch (SQLException sqle){
            JDBCUtils.printSQLException(sqle);
        }
    }

    @Override
    public int insertPedido(PedidoTO pedidoTO) {
        try {
            System.out.println("Insert pedido");
            PreparedStatement stmt = connection.prepareStatement(insertPedido);
            stmt.setString(1, pedidoTO.getClientId());
            stmt.setString(2, pedidoTO.getTimestampPedido());
            stmt.setString(3, pedidoTO.getSchema());
            stmt.setString(4, pedidoTO.getSchemaId());
            stmt.setInt   (5, pedidoTO.getQuantidadeKryptocodes());
            System.out.println(stmt);
            int retornoDb = stmt.executeUpdate();

            connection.commit();
            System.out.println("Retorno insere pedido DB:" + retornoDb);
            return retornoDb;
        } catch (SQLException sqle) {
            JDBCUtils.printSQLException(sqle);
            return -1;
        }
    }

    @Override
    public boolean deletePedido(String clientId, String timestampPedido) {
        try {
            System.out.println("Delete pedido");
            System.out.println("clientID: " + clientId);
            System.out.println("timestampPedido: " + timestampPedido);
            PreparedStatement stmt = connection.prepareStatement(deletePedido);
            stmt.setString(1, clientId);
            stmt.setString(2, timestampPedido);
            System.out.println(stmt);
            int retornoDb = stmt.executeUpdate();

            connection.commit();
            System.out.println("Return delete db: " + retornoDb);
            return true;
        } catch (SQLException sqle) {
            JDBCUtils.printSQLException(sqle);
            return false;
        }
    }

    @Override
    public PedidoTO findPedido(String clientId, String timestampPedido) {
        return null;
    }

    @Override
    public boolean updatePedido(PedidoTO pedidoTO) {
        return false;
    }

    @Override
    public RowSet selectPedidosRs() {
        return null;
    }

    @Override
    public Collection<PedidoTO> selectPedidosTO() {
        return null;
    }
}
