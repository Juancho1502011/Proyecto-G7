package Facturacion;

public class AutorizationResponse {
    enum AutorizationStatus {
        AUTORIZADO, RECHAZADO;
    }

    private AutorizationStatus status;

    public AutorizationResponse(AutorizationStatus status) {
        this.status = status;
    }

    public AutorizationStatus getStatus() {
        return status;
    }
}
