package ca.kryptogarten.cmn.manager;

import ca.kryptogarten.cmn.dao.DAOFactory;
import ca.kryptogarten.cmn.dao.interfaces.CertificateDAO;
import ca.kryptogarten.cmn.dao.interfaces.PedidoDAO;
import ca.kryptogarten.cmn.dao.pool.BasicConnectionPool;
import ca.kryptogarten.cmn.dao.pool.ConnectionPool;
import ca.kryptogarten.cmn.model.CertificateTO;
import ca.kryptogarten.cmn.model.PedidoTO;
import ca.kryptogarten.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Julio Cesar Torres <julio.torres@kryptogarten.ca> (@juliozohar)
 */
public class CertificateInventory {

    /**
     *
     */
    public CertificateInventory(){
    }

    /**
     *
     * @param certificateTO
     */
    public void save(CertificateTO certificateTO){
        DAOFactory mySqlFactory = DAOFactory.getFactory(DAOFactory.MYSQL);
        CertificateDAO certificateDAO = mySqlFactory.getCertificateDAO();

        int newCert = certificateDAO.insertCertificate(certificateTO);
        System.out.println("Certificate inserted: " + newCert);
    }

    /**
     *
     */
    public void retrieveConnection(){
        try {
            ConnectionPool connectionPool = BasicConnectionPool.create(
                    "jdbc:mysql://localhost:3306/?serverTimezone=UTC#/kryptogarten",
                    "kryptogarten", "Krypto$ucess2020");
            if(connectionPool.getConnection().isValid(1)){
                System.out.println("Connection successful");
            } else {
                System.out.println("Connection error");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param pedidoTO
     */
    public void savePedido(PedidoTO pedidoTO){
        DAOFactory mysqlFactory = DAOFactory.getFactory(DAOFactory.MYSQL);
        PedidoDAO pedidoDAO = mysqlFactory.getPedidoDAO();

        int newPedido = pedidoDAO.insertPedido(pedidoTO);
        System.out.println("Pedido inserted: " + newPedido);
    }

    /**
     *
     * @param clientId
     * @param timestampPedido
     */
    public void deletePedido(String clientId, String timestampPedido){
        DAOFactory mysqlDAOFactory = DAOFactory.getFactory(DAOFactory.MYSQL);
        PedidoDAO pedidoDAO = mysqlDAOFactory.getPedidoDAO();

        boolean delPedido = pedidoDAO.deletePedido(clientId, timestampPedido);
        System.out.println("Pedido deleted? " + delPedido);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CertificateInventory ci = new CertificateInventory();
//        ci.retrieveConnection();
//        ci.getConnection();
        CertificateTO certificateTO = new CertificateTO();
        certificateTO.setAc("aaa333dddD");
        certificateTO.setSerialNumber("1234567891234567891234567890012");
        certificateTO.setSubjectName("EDJARA RODRIGUES MORAIS");
//        ci.save(certificateTO);

        PedidoTO pedidoTO = new PedidoTO();
        pedidoTO.setClientId("hkduwdg");
        pedidoTO.setClientName("Dentistry Inc");
        pedidoTO.setTimestampPedido("2020-08-18-19.30.00 UTC");
        pedidoTO.setSchema("Dentistry");
        pedidoTO.setSchemaId("v_1.0");
        pedidoTO.setQuantidadeKryptocodes(100);

//        ci.savePedido(pedidoTO);
        ci.deletePedido(pedidoTO.getClientId(), pedidoTO.getTimestampPedido());
    }
}
