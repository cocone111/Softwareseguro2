import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public static void main(String[] args) {
        List<Producto> productosCliente1 = new ArrayList<>();
        productosCliente1.add(new Producto("Pan", 1));
        productosCliente1.add(new Producto("Leche", 1.5));
        productosCliente1.add(new Producto("Huevos", 2.5));

        List<Producto> productosCliente2 = new ArrayList<>();
        productosCliente2.add(new Producto("Arroz", 2));
        productosCliente2.add(new Producto("Frijoles", 3));
        productosCliente2.add(new Producto("Carne", 5));

        Cliente cliente1 = new Cliente("Cliente 1", productosCliente1);
        Cliente cliente2 = new Cliente("Cliente 2", productosCliente2);

        long initialTime = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Cajera 1", cliente1, initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, initialTime);

        Thread thread1 = new Thread(cajera1);
        Thread thread2 = new Thread(cajera2);

        thread1.start();
        thread2.start();
    }
}
