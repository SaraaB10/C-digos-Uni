package co.edu.uniquindio.poo;

public class DetalleFactura {
    private int cantidadProducto;
    private double subTotal;
    Producto producto;
    
    public DetalleFactura(int cantidadProducto, Producto producto) {
        this.cantidadProducto = cantidadProducto;
        this.subTotal = calcularSubTotal(producto);
        this.producto = producto;
    }
    
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "- DetalleFactura: Producto:" + producto + ", cantidad producto:" + cantidadProducto + " y su subtotal es:" +subTotal;
    }

    public double calcularSubTotal (Producto producto){
        return cantidadProducto*producto.getPrecioUnitario();
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
