package examen1.examen1.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examen1.examen1.modelos.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer>{
    
}
