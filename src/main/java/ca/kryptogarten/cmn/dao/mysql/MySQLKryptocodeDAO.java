package ca.kryptogarten.cmn.dao.mysql;


import ca.kryptogarten.cmn.dao.interfaces.KryptocodeDAO;
import ca.kryptogarten.cmn.model.CertificateTO;
import ca.kryptogarten.cmn.model.KryptocodeTO;
import ca.kryptogarten.utils.JDBCUtils;


import javax.sql.RowSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class MySQLKryptocodeDAO implements KryptocodeDAO {

    private Connection connection;

    public MySQLKryptocodeDAO(Connection _connection){
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


    public int insertKryptocode(KryptocodeTO kryptocodeTO) {
        return 0;
    }

    @Override
    public boolean deleteKryptocode() {
        return false;
    }

    @Override
    public CertificateTO findKryptocode() {
        return null;
    }

    @Override
    public boolean updateKryptocode() {
        return false;
    }

    @Override
    public RowSet selectKryptocodesRs() {
        return null;
    }

    @Override
    public Collection<KryptocodeTO> selectKryptocodesTO() {
        return null;
    }
}

