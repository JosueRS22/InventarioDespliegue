package mx.uv.jers.inventario.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import mx.uv.jers.inventario.models.Producto;
import mx.uv.jers.inventario.repository.ProductoRepository;

@Service
@RequiredArgsConstructor
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public List<Producto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Producto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Producto guardar(Producto producto) {
        return repository.save(producto);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

}
