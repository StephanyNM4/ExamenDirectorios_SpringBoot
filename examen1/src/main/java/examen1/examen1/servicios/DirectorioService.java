package examen1.examen1.servicios;

import java.util.List;

import examen1.examen1.modelos.Contacto;
import examen1.examen1.modelos.Directorio;

public interface DirectorioService {
        public Directorio guardarDirectorio(Directorio directorio);

    public Directorio buscarDirectorio(String codigoEntrada);

    public List<Contacto> mostrarContactos(String codigoEntrada);

    public String eliminarDirectorio(String codigoEntrada);
}
