package granmultinacional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    // Caso de prueba 1: Validar que el precio base sea mayor a 0
    @Test
    void precioDebeSerMayorACero() {
        // Crear una clase hija para instanciar el Producto (ya que es abstracta)
        Producto producto = new ProductoConcreto("P001", 500, 10); // Precio mayor a 0
        assertTrue(producto.getPrecioBase() > 0, "El precio base debe ser mayor a 0");
    }
}
