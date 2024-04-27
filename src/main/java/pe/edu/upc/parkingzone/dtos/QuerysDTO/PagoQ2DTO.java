package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class PagoQ2DTO {

    private long PagoPedido;

    public PagoQ2DTO(long pagoPedido) {
        PagoPedido = pagoPedido;
    }

    public long getPagoPedido() {
        return PagoPedido;
    }

    public void setPagoPedido(long pagoPedido) {
        PagoPedido = pagoPedido;
    }
}
