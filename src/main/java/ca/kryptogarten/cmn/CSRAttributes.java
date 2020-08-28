package ca.kryptogarten.cmn;

/**
 *
 * @author Julio Cesar Torres <julio.torres@kryptogarten.ca> (@juliozohar)
 */
public class CSRAttributes {

    // Certificate attributes

    /**
     *
     */
    private String  countryName;

    /**
     *
     */
    private String state;

    /**
     *
     */
    private String Locality;

    /**
     *
     */
    private String orgName;

    /**
     *
     */
    private String orgUnitName;

    /**
     *
     */
    private String commonName;

    // G E T T E R S   A N D   S E T T E R S
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String locality) {
        Locality = locality;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgUnitName() {
        return orgUnitName;
    }

    public void setOrgUnitName(String orgUnitName) {
        this.orgUnitName = orgUnitName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
}
