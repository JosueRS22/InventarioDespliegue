package mx.uv.jers.inventario.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="productos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(nullable=false, length=100)
    private String nombre;
    @Column(length=500)
    private String descripcion;
    private String categoria;
    @Column(nullable=false)
    private Integer stock;
    @Column(nullable=false)
    private Double precio;
    private LocalDateTime fechaCreacion = LocalDateTime.now();
}

