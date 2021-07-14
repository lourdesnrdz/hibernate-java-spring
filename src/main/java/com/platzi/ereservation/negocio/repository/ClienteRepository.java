/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de base de datos relacionadas con Cliente
 * @author lourdes.b.rodriguez
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	/**
	 * Definición de método para buscar los clientes por su apellido
	 * @author lourdes.b.rodriguez
	 * @return
	 * */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacionCli(String identificacionCli);
	
	

}
