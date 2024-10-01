package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
       // Crear el supermercado
        Supermercado supermercado = new Supermercado("0001", "EXITO", "3128484839", "Armenia norte 27", "7:00 am", "7:00 pm");

       // Crear cliente y empleado
        Cliente cliente = new Cliente("Saris", "Betancur", "473738288", "saris@gmail.com", "315263727", "Misteriosaa");
        Empleado empleado = new Empleado("Lauris", "Cardona", "7374743838", "lauris@gmail.com", "31267754", "Misteriosa x2", "");
       
       // Crear productos
        Producto producto = new Producto("001", "Caja de Fresitas", "Fruta saludable rica", 10, 5000, LocalDate.of(2024,10,07));
        Producto producto2 = new Producto("002", "Caja de galletas", "Galletas saludables ricas", 15, 10000, LocalDate.of(2024,10,07));
       
       // Agregar cliente, empleado y productos al supermercado
        supermercado.agregarCliente(cliente);
        supermercado.agregarEmpleado(empleado);
        supermercado.agregarProducto(producto);
        supermercado.agregarProducto(producto2);
       
       // Crear la factura (sin total aún)
        Factura factura = new Factura("938",0.19, LocalDate.of(2024,10,07), LocalTime.of(1, 25, 10));
       
       // Crear un detalle de factura y agregarlo a la factura
        DetalleFactura detalleFactura = new DetalleFactura(2, producto); // 2 cajas de fresitas por 5000 cada una
        factura.agregarDetalleFactura(detalleFactura);
       
        DetalleFactura detalleFactura2 = new DetalleFactura(3, producto2); // 3 cajas de galletas por 10000 cada una
        factura.agregarDetalleFactura(detalleFactura2);
       
       //mostrar el mensaje del supermercado
       Supermercado.mostrarMensaje(supermercado.toString());

       //Calcular y mostrar el subtotal de los detalles
       double totalDetalle = detalleFactura.calcularSubTotal(producto);
       double totalDetalle2 = detalleFactura.calcularSubTotal(producto2);

       Supermercado.mostrarMensaje("El subtotal del primer detalle es: " +totalDetalle);
       Supermercado.mostrarMensaje("El subtotal del segundo detalle es: " +totalDetalle2);

       //Calcular el total de la factura sumando todos los detalles

       double totalFactura = factura.calcularTotal();
       Supermercado.mostrarMensaje("El total a pagar de la factura con el iva del 19% es: " +totalFactura);
       Supermercado.mostrarMensaje(factura.toString());


       
}
}
