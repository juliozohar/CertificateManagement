package ca.kryptogarten.cmn.dao;

import ca.kryptogarten.cmn.dao.factory.HSQLDAOFactory;
import ca.kryptogarten.cmn.dao.factory.MySQLDAOFactory;
import ca.kryptogarten.cmn.dao.interfaces.CertificateDAO;
import ca.kryptogarten.cmn.dao.interfaces.KryptocodeDAO;
import ca.kryptogarten.cmn.dao.interfaces.PedidoDAO;

public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int MYSQL = 1;
    public static final int HSQL = 2;

    // There will be a method for each DAO that can be created.
    // The concrete factories will have to implement these methods.
    public abstract CertificateDAO getCertificateDAO();

    public abstract PedidoDAO getPedidoDAO();

    public abstract KryptocodeDAO getKryptocodeDAO();

    public static DAOFactory getFactory(int whichFactory) {
        switch (whichFactory) {
            case MYSQL:
                return new MySQLDAOFactory();
            case HSQL:
                return new HSQLDAOFactory();
            default:
                return null;
        }
    }
}