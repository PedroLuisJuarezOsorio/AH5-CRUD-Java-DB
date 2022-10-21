//REF#(1) complete

package AH5;

public class Productodb {
    
    private int codigo;
    private String desc_producto;
    private int cantidad;
    private String fabri_origen;
    private String fechaingreso;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDesc_producto() {
        return desc_producto;
    }

    public void setDesc_producto(String desc_producto) {
        this.desc_producto = desc_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFabri_origen() {
        return fabri_origen;
    }

    public void setFabri_origen(String fabri_origen) {
        this.fabri_origen = fabri_origen;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    
}
