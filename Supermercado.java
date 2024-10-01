package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Supermercado {
    private String codigo;
    private String nombre;
    private String telefono;
    private String direccion;
    private String horarioApertura;
    private String horarioCierre;
    private LinkedList<Cliente> clientes;
    private LinkedList<Empleado> empleados;
    private LinkedList<Factura> facturas;
    private LinkedList<Producto> productos;


    public Supermercado(String codigo, String nombre, String telefono, String direccion, String horarioApertura,
            String horarioCierre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        clientes = new LinkedList<>();
        empleados = new LinkedList<>();
        facturas = new LinkedList<>();
        productos = new LinkedList<>();

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public String getHorarioCierre() {
        return horarioCierre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(String horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public LinkedList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(LinkedList<Factura> facturas) {
        this.facturas = facturas;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "El Supermercado  " + nombre + "su código es " + codigo +  ", telefono : " + telefono + ", direccion: "
                + direccion + ", horarioApertura: " + horarioApertura + ", horarioCierre: " + horarioCierre
                + ", sus Clientes son : " + clientes + "\nEmpleados son:" + empleados + "\nFacturas son: " + facturas + "\nProductos son: " +productos;
    }

    public void agregarCliente (Cliente cliente){
        clientes.add(cliente);
    }

    public void agregarEmpleado (Empleado empleado){
        empleados.add(empleado);
    }

    public void agregarProducto (Producto producto){
        productos.add(producto);
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    
    
}
