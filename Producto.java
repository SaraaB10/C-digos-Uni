package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private int cantidadStock;
    private double precioUnitario;
    private LocalDate fechaVencimiento;
    private LinkedList <DetalleFactura> detalleFacturas;

    public Producto(String id, String nombre, String descripcion, int cantidadStock, double precioUnitario,
            LocalDate fechaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
        this.precioUnitario = precioUnitario;
        this.fechaVencimiento = fechaVencimiento;
        detalleFacturas = new LinkedList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getCantidadStock() {
        return cantidadStock;
    }
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    @Override
    public String toString() {
        return "-Producto con id: " + id + ", con nombre: " + nombre + ", descripcion:" + descripcion + ", con un Stock de:"
                + cantidadStock + ", cuyo precio es:" + precioUnitario + ", con fecha de vencimiento de: " + fechaVencimiento+ "\n";
    }
    public LinkedList<DetalleFactura> getDetalleFacturas() {
        return detalleFacturas;
    }
    public void setDetalleFacturas(LinkedList<DetalleFactura> detalleFacturas) {
        this.detalleFacturas = detalleFacturas;
    }
    public void agregarDetalleFactura(DetalleFactura detalleFactura) {
        detalleFacturas.add(detalleFactura);
    }

    

    
}
