package mx.uv.jers.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.uv.jers.inventario.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
        
}
