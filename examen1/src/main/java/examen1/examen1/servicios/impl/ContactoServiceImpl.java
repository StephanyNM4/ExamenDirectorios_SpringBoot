package examen1.examen1.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import examen1.examen1.modelos.Contacto;
import examen1.examen1.repositorios.ContactoRepository;
import examen1.examen1.servicios.ContactoService;

public class ContactoServiceImpl implements ContactoService{

    @Autowired
    private ContactoRepository contactoRepository;

    public Contacto agregarContacto(Contacto contacto) {
        return this.contactoRepository.save(contacto);
    }

    @Override
    public String eliminarContacto(int idContacto) {
        Contacto contacto = this.contactoRepository.findById(idContacto).get();

        if(contacto != null){
            this.contactoRepository.delete(contacto);
            return "Contacto eliminado";
        }
        return "Contacto no existe";
    }
    
}
