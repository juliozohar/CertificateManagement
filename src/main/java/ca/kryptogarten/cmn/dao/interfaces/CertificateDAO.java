package ca.kryptogarten.cmn.dao.interfaces;

import ca.kryptogarten.cmn.model.CertificateTO;

import javax.sql.RowSet;

import java.util.Collection;

public interface CertificateDAO {

    public int insertCertificate(CertificateTO certificateTO);

    public boolean deleteCertificate();

    public CertificateTO findCertificate();

    public boolean updateCertificate();

    public RowSet selectCertificatesRs();

    public Collection<CertificateTO> selectCertificatesTO();


}
