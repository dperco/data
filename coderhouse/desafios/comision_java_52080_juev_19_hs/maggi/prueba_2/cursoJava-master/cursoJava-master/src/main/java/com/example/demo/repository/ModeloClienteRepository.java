package com.example.demo.repository;

import com.example.demo.models.ModeloCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloClienteRepository extends JpaRepository<ModeloCliente, Long> {
    // Aquí puedes agregar métodos personalizados si lo necesitas
}
