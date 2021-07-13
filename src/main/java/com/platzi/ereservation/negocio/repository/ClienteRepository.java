/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de base de datos relacionadas con Cliente
 * @author lourdes.b.rodriguez
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	

}
