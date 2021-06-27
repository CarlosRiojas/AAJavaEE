/**
 * 
 */
package com.platzi.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.platzi.ereservation.modelo.Cliente;

/**
 * @author carlo
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,String >{
	
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacion(String identificacionCli);
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param email
	 * @return
	 */
	@Query("Select c from Cliente c where c.emailCli like %:email")
	public Cliente findByEmailAccount(@Param("email") String email);
	
}
