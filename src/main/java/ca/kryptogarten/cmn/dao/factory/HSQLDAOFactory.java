package ca.kryptogarten.cmn.dao.factory;

import ca.kryptogarten.cmn.dao.DAOFactory;
import ca.kryptogarten.cmn.dao.interfaces.CertificateDAO;
import ca.kryptogarten.cmn.dao.interfaces.KryptocodeDAO;
import ca.kryptogarten.cmn.dao.interfaces.PedidoDAO;

import java.sql.Connection;

public class HSQLDAOFactory extends DAOFactory {

    /**
     * Method to create database connections. Should be a connection pool.
     * TODO: Create a connection pool to get the connections from.
     * @return Connection to the database.
     */
    public static Connection getConnection(){
        return null;
    }

    /**
     * Retrieve a certificate DAO
     * @return
     */
    public CertificateDAO getCertificateDAO(){
        return null;
    }

    public PedidoDAO getPedidoDAO() { return null; }

    public KryptocodeDAO getKryptocodeDAO() { return null; }
}
