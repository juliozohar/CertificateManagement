package ca.kryptogarten.cmn.dao.mysql;


import ca.kryptogarten.cmn.dao.interfaces.CertificateDAO;
import ca.kryptogarten.cmn.model.CertificateTO;
import ca.kryptogarten.utils.JDBCUtils;

import javax.sql.RowSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;

public class MySQLCertificateDAO implements CertificateDAO {

    private Connection connection;

    private CertificateTO certTO;

    private static final String insertCertificate =
            "INSERT INTO CERTIFICATE (AC, SERIAL_NUMBER, USER_COMMON_NAME) VALUES (?,?,?)";

    public MySQLCertificateDAO(Connection _connection){
        try {
            String useDatabase = "use kryptogarten";
            this.connection = _connection;
            this.connection.setAutoCommit(false);
            Statement stmtDb = connection.createStatement();
            stmtDb.execute(useDatabase);

        } catch(SQLException sqle){
            JDBCUtils.printSQLException(sqle);
        }
    }

    @Override
    public int insertCertificate(CertificateTO certificateTO) {
        System.out.println("Insert certificate");
        try {
            PreparedStatement stmt = connection.prepareStatement(insertCertificate);
            stmt.setString(1, certificateTO.getAc());
            stmt.setString(2, certificateTO.getSerialNumber());
            stmt.setString(3, certificateTO.getSubjectName());

            System.out.println(stmt);
            int retornoDb = stmt.executeUpdate();
            connection.commit();
            connection.close();
            System.out.println("Retorno insere kryptogarten DB:" + retornoDb);
            return retornoDb;
        } catch (SQLException sqle) {
            JDBCUtils.printSQLException(sqle);
            return -1;
        }
    }

    @Override
    public boolean deleteCertificate() {
        return false;
    }

    @Override
    public CertificateTO findCertificate() {

        return null;
    }

    @Override
    public boolean updateCertificate() {
        return false;
    }

    @Override
    public RowSet selectCertificatesRs() {
        return null;
    }

    @Override
    public Collection<CertificateTO> selectCertificatesTO() {
        return null;
    }

    // G E T T E R S   A N D   S E T T E R S

    public CertificateTO getCertTO() {
        return certTO;
    }

    public void setCertTO(CertificateTO certTO) {
        this.certTO = certTO;
    }
}
