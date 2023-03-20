package com.eoi.springboot.database;
import com.eoi.springboot.entidades.EntidadUsuario;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Repositorio usuarios.
 */
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface RepositorioUsuarios extends CrudRepository<EntidadUsuario, Integer> {

}