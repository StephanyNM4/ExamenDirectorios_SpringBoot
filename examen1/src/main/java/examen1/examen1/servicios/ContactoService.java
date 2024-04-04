package examen1.examen1.servicios;

import examen1.examen1.modelos.Contacto;

public interface ContactoService {
    
    public Contacto agregarContacto(Contacto contacto);

    public String eliminarContacto(int idContacto);

}
