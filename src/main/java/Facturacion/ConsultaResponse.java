package Facturacion;

public class ConsultaResponse {
    enum ConsultaStatus {
        OK, ERROR;
    }

    private ConsultaStatus status;

    public ConsultaResponse(ConsultaStatus status) {
        this.status = status;
    }

    public ConsultaStatus getStatus() {
        return status;
    }
}
