package ca.kryptogarten.cmn.dao.pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 */
public interface ConnectionPool {

    /**
     * Retrieve a connection to be used in DB.
     * @return a Connection object configured to the target db.
     * @throws SQLException the connection cannot be acquired.
     */
    Connection getConnection() throws SQLException;

    /**
     * Releases the connection back to the pool.
     * @param connection the connection to be returned.
     * @return boolean, operation is successful
     */
    boolean releaseConnection(Connection connection);

    /**
     * Shuts down the connection pool gracefully.
     * @throws SQLException
     */
    void shutdown() throws SQLException;;

    // G E T T E R S   A N D   S E T T E R S

    String getUrl();

    String getUser();

    String getPassword();


}
