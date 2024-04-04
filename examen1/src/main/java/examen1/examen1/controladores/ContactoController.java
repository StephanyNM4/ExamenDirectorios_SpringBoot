package examen1.examen1.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import examen1.examen1.modelos.Contacto;
import examen1.examen1.servicios.impl.ContactoServiceImpl;


@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    private ContactoServiceImpl contactoServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PostMapping("/guardar")
    public Contacto agregarContacto(@RequestBody Contacto contacto) {
        return this.contactoServiceImpl.agregarContacto(contacto);
    }

    @DeleteMapping("/eliminar")
    public String eliminarContacto(@RequestParam int idContacto) {
    return this.contactoServiceImpl.eliminarContacto(idContacto);
    }
}
