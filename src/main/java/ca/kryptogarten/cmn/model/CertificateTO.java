package ca.kryptogarten.cmn.model;

import java.io.Serializable;

/**
 * A Transfer Object class to hold the details for a certificate.
 * @author Julio Cesar Torres <julio.torres@kryptogarten.ca> (@juliozohar)
 */
public class CertificateTO implements Serializable {

    /**
     * Version : indique à quelle version de X509 correspond ce certificat
     * Version : shows which X.509 version the certificate implements.
     */
    private String version;

    /**
     * CA code : certification authority code.
     */
    private String ac;

    /**
     * Numéro de série : Numéro de série du certificat
     * Serial number: certificate serial number.
     */
    private String serialNumber;

    /**
     * Algorithme de signature: identifiant du type de signature utilisée
     * Signature algorithm : signature type identification.
     */
    private String algSignature;

    /**
     * Émetteur : Distinguished Name (DN) de l'autorité de certification qui a émis ce certificat.
     * IssuerName : Issuing Authority Certification's Distinguished Name (DN)
     */
    private String issuerName;

    /**
     * Valide à partir de: la date de début de validité de certificat
     * Valid from: the date the certificate becomes valid
     */
    private String validFrom;

    /**
     * Valide jusqu'à : la date de fin de validité de certificat
     * Valid thru: the certificate expiration date
     */
    private String validThru;

    /**
     * Objet: Distinguished Name (DN) de détenteur de la clef publique
     * subjectName: Distinguished Name (DN) of the key's owner.
     */
    private String subjectName;

    /**
     * Clé publique : infos sur la clef publique de ce certificat
     * publicKey: the public key text, base64 encoded.
     */
    private String publicKey;

    /**
     * Contraintes de base : extensions génériques optionnelles
     * basicConstraints:  optional general extensions
     */
    private String basicConstraints;

    /**
     * Utilisation de la clé : l'objet d'utilisation de la clé
     * keyUsage:
     */
    private String keyUsage;

    /**
     * Algorithme thumbprint : algorithme de signature
     * algThumbprint: algorithm used to sign the thumbprint.
     */
    private String algThumbprint;

    /**
     * Thumbprint : signature numérique de l'autorité de certification sur l'ensemble des champs précédents.
     * Thumbprint: CA's digital signature on the certificate's signed content (TBS)
     */
    private String thumbprint;

    // G E T T E R S   A N D   S E T T E R S

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAlgSignature() {
        return algSignature;
    }

    public void setAlgSignature(String algSignature) {
        this.algSignature = algSignature;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidThru() {
        return validThru;
    }

    public void setValidThru(String validThru) {
        this.validThru = validThru;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getBasicConstraints() {
        return basicConstraints;
    }

    public void setBasicConstraints(String basicConstraints) {
        this.basicConstraints = basicConstraints;
    }

    public String getKeyUsage() {
        return keyUsage;
    }

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    public String getAlgThumbprint() {
        return algThumbprint;
    }

    public void setAlgThumbprint(String algThumbprint) {
        this.algThumbprint = algThumbprint;
    }

    public String getThumbprint() {
        return thumbprint;
    }

    public void setThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
    }
}

