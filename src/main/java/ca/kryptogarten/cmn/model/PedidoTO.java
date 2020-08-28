package ca.kryptogarten.cmn.model;

import java.util.Map;

public class PedidoTO {

    private String schema;

    private String schemaId;

    private String clientId;

    private String clientName;

    private Map<String, String> certificado;

    private String timestampPedido;

    private int quantidadeKryptocodes;

    // G E T T E R S   A N D   S E T T E R S

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Map<String, String> getCertificado() {
        return certificado;
    }

    public void setCertificado(Map<String, String> certificado) {
        this.certificado = certificado;
    }

    public String getTimestampPedido() {
        return timestampPedido;
    }

    public void setTimestampPedido(String timestampPedido) {
        this.timestampPedido = timestampPedido;
    }

    public int getQuantidadeKryptocodes() {
        return quantidadeKryptocodes;
    }

    public void setQuantidadeKryptocodes(int quantidadeKryptocodes) {
        this.quantidadeKryptocodes = quantidadeKryptocodes;
    }
}
