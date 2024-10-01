package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

public class Factura {
    private String id;
    private double iva;
    private LocalDate fecha;
    private LocalTime hora;
    private double totalAPagar;
    private LinkedList <DetalleFactura> detalleFacturas;

    public Factura(String id, double iva, LocalDate fecha, LocalTime hora) {
        this.id = id;
        this.iva = iva;
        this.fecha = fecha;
        this.hora = hora;
        detalleFacturas = new LinkedList<>();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public double getTotalAPagar() {
        return totalAPagar;
    }
    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
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

    public double calcularTotal() {
        double total = 0;
        double totalAPagar = 0 ;  
        for (DetalleFactura detalleFactura : detalleFacturas) {
            total += detalleFactura.getSubTotal();
            double ivaApagar= total * getIva();
            totalAPagar= total+ivaApagar;
        }
        return totalAPagar;
    }

    
    @Override
    public String toString() {
        return "La Factura con id:" + id + ", cuyo iva:" + iva + ", con la fecha:" + fecha + ", a las:" + hora + ", con los detalles de la factura:" + detalleFacturas + ", el total a pagar es: " +totalAPagar;
    }



    
}
