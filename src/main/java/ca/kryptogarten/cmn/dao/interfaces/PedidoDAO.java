package ca.kryptogarten.cmn.dao.interfaces;


import ca.kryptogarten.cmn.model.PedidoTO;

import javax.sql.RowSet;
import java.util.Collection;

public interface PedidoDAO {

    public int insertPedido(PedidoTO pedidoTO);

    public boolean deletePedido(String clientId, String timestampPedido);

    public PedidoTO findPedido(String clientId, String timestampPedido);

    public boolean updatePedido(PedidoTO pedidoTO);

    public RowSet selectPedidosRs();

    public Collection<PedidoTO> selectPedidosTO();

}
