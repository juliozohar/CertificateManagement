package ca.kryptogarten.cmn.dao.interfaces;

import ca.kryptogarten.cmn.model.CertificateTO;
import ca.kryptogarten.cmn.model.KryptocodeTO;

import javax.sql.RowSet;
import java.util.Collection;

public interface KryptocodeDAO {

    public int insertKryptocode(KryptocodeTO kryptocodeTO);

    public boolean deleteKryptocode();

    public CertificateTO findKryptocode();

    public boolean updateKryptocode();

    public RowSet selectKryptocodesRs();

    public Collection<KryptocodeTO> selectKryptocodesTO();
}
