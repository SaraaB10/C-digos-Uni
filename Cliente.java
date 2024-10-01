package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Cliente extends Persona {
    private LinkedList<Factura> facturas;
    

    public Cliente(String nombre, String apellido, String cedula, String email, String telefono, String direccion) {
        super(nombre, apellido, cedula, email, telefono, direccion );
        facturas = new LinkedList<>();
    }
    

    @Override
    public String toString() {
        return "- Cliente: " + nombre + ", con apellidos: " + apellido + ", con cedula: " + cedula +
                ", email: " + email + ", telefono: " + telefono + ", direccion: " + direccion + ", y sus facturas son:" + facturas +"\n";
    }
    public void agregarFactura (Factura factura){
        facturas.add(factura);
    }


    public LinkedList<Factura> getFacturas() {
        return facturas;
    }


    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }

    
    
    
    
    
}
