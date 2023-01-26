package com.fernandaAndino.ap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandaAndino.ap.entity.Producto;



public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
