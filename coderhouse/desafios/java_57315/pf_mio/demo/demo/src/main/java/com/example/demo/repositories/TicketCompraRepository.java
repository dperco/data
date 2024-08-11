package com.example.demo.repositories;

import com.example.demo.entities.TicketCompra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketCompraRepository extends JpaRepository<TicketCompra, Long> {
}