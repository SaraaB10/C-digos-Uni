package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Empleado extends Persona{
    private String horario;
    private LinkedList<Factura> facturas;
    private LinkedList<Cliente> clientes;


    public Empleado(String nombre, String apellido, String cedula, String email, String telefono, String direccion,
            String horario) {
        super(nombre, apellido, cedula, email, telefono, direccion);
        this.horario = horario;
        clientes = new LinkedList<>();
        facturas = new LinkedList<>();
    }
    

    public LinkedList<Factura> getFacturas() {
        return facturas;
    }


    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }


    public LinkedList<Cliente> getClientes() {
        return clientes;
    }


    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "- El empleado tiene un horario de: " + horario + ", sus facturas realizadas son: " + facturas + ", sus clientes atendidos son: " + clientes;
    }
    public void agregarCliente (Cliente cliente){
        clientes.add(cliente);
    }
    public void agregarFactura (Factura factura){
        facturas.add(factura);
    }

    
    
}
