package com.fernandaAndino.ap.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fernandaAndino.ap.entity.Producto;
import com.fernandaAndino.ap.repository.ProductoRepository;

@Service
public class ProductoImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;


	@Override
	public Iterable<Producto> findAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return productoRepository.findAll(pageable);
	}

	@Override
	public Optional<Producto> findById(Long codigo) {
		// TODO Auto-generated method stub
		return productoRepository.findById(codigo);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.save(producto);
	}

	@Override
	public void deleteById(Long codigo) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(codigo);
	}

}
