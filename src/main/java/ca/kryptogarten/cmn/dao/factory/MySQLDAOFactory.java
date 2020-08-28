package ca.kryptogarten.cmn.dao.factory;


import ca.kryptogarten.cmn.dao.DAOFactory;
import ca.kryptogarten.cmn.dao.interfaces.CertificateDAO;
import ca.kryptogarten.cmn.dao.interfaces.KryptocodeDAO;
import ca.kryptogarten.cmn.dao.interfaces.PedidoDAO;
import ca.kryptogarten.cmn.dao.mysql.MySQLCertificateDAO;
import ca.kryptogarten.cmn.dao.mysql.MySQLKryptocodeDAO;
import ca.kryptogarten.cmn.dao.mysql.MySQLPedidoDAO;
import ca.kryptogarten.cmn.dao.pool.BasicConnectionPool;
import ca.kryptogarten.cmn.dao.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 */
public class MySQLDAOFactory extends DAOFactory {


    public static final String DBURL = "jdbc:mysql://localhost:3306/?serverTimezone=UTC#/kryptogarten";
    public static final String DBUSER = "kryptogarten";
    public static final String DBPASS = "Krypto$ucess2020";

    /**
     * Method to create database connections. Should be a connection pool implementation/usage.
     * TODO: Create a connection pool to get the connections from.
     * @return Connection to the database.
     */
    public static Connection getConnection(){
        try{
            ConnectionPool connectionPool = BasicConnectionPool.create(DBURL, DBUSER, DBPASS);
            Connection connection = connectionPool.getConnection();
            if(connection.isValid(1)){
                System.out.println("Connection established");

                return connectionPool.getConnection();
            } else {
                throw new SQLException("It was not possible to retrieve a connection to the database");
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Retrieve a certificate DAO that implements CertificateDAO
     * @return a CertificateDAO implementation for MySQL
     */
    public CertificateDAO getCertificateDAO(){
        Connection connection = MySQLDAOFactory.getConnection();
        return new MySQLCertificateDAO(connection);
    }

    public KryptocodeDAO getKryptocodeDAO(){
        Connection connection = MySQLDAOFactory.getConnection();
        return new MySQLKryptocodeDAO(connection);
    }

    public PedidoDAO getPedidoDAO(){
        Connection connection = MySQLDAOFactory.getConnection();
        return new MySQLPedidoDAO(connection);
    }

}
