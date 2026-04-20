package mx.uv.jers.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import mx.uv.jers.inventario.models.Producto;
import mx.uv.jers.inventario.repository.ProductoRepository;

@SpringBootApplication
public class InventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioApplication.class, args);
	}

	@Bean
	CommandLineRunner initData(ProductoRepository repository) {
		return args -> {
			repository.save(new Producto(null, "Laptop Dell", "i7 16RAM", "Electrónica", 5, 15500.50, null));
			repository.save(new Producto(null, "Laptop Dell", "i7 16RAM", "Electrónica", 5, 15500.50, null));
			repository.save(new Producto(null, "Laptop Dell", "i7 16RAM", "Electrónica", 5, 15500.50, null));
		};
	}

}
