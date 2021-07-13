/**
 * 
 */
package com.platzi.ereservation.negocio.services;

import org.springframework.stereotype.Service;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;

/**
 * Clase para definir los servicios de Cliente
 * @author lourdes.b.rodriguez
 *
 */
@Service
public class ClienteService {
	
	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		// TODO Auto-generated constructor stub
		this.clienteRepository = clienteRepository;
	}
	
	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 * */
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de actualizar un cliente
	 * @param cliente
	 * @return
	 * */
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de eliminar un cliente
	 * @param cliente
	 * */
	public void delete(Cliente cliente) {
		return this.clienteRepository.delete(cliente);
	}
	
	/**
	 * Método para consultar un cliente por su identificacion
	 * @param identificacionCli
	 * @return
	 * */
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}

}