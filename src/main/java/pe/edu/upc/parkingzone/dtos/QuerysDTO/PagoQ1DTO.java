package pe.edu.upc.parkingzone.dtos.QuerysDTO;

public class PagoQ1DTO {
    private int pagoid;
    private String descripcion_tpago;
    private int cantidad;

    public int getPagoid() {
        return pagoid;
    }

    public void setPagoid(int pagoid) {
        this.pagoid = pagoid;
    }

    public String getDescripcion_tpago() {
        return descripcion_tpago;
    }

    public void setDescripcion_tpago(String descripcion_tpago) {
        this.descripcion_tpago = descripcion_tpago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
