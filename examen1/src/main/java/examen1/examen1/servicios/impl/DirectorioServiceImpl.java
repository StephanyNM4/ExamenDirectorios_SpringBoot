package examen1.examen1.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen1.examen1.modelos.Contacto;
import examen1.examen1.modelos.Directorio;
import examen1.examen1.repositorios.DirectorioRepository;
import examen1.examen1.servicios.DirectorioService;

@Service
public class DirectorioServiceImpl implements DirectorioService{

    @Autowired
    private DirectorioRepository directorioRepository;

    public Directorio guardarDirectorio(Directorio directorio) {
        if(directorio.getDireccion() != null){
            directorio.getDireccion().setDirectorio(directorio);
        }

        if(directorio.getContactos() != null){
            for (Contacto contacto : directorio.getContactos()) {
                contacto.setDirectorio(directorio);
            }
        }

        return this.directorioRepository.save(directorio);
    }

    @Override
    public Directorio buscarDirectorio(String codigoEntrada) {
        return this.directorioRepository.findById(codigoEntrada).get();
    }

    @Override
    public List<Contacto> mostrarContactos(String codigoEntrada) {
        Directorio directorio = this.directorioRepository.findById(codigoEntrada).get();

        if(directorio.getContactos() != null){
            return directorio.getContactos();
        }

        return null;
    }

    @Override
    public String eliminarDirectorio(String codigoEntrada) {
    Directorio directorio = this.directorioRepository.findById(codigoEntrada).get();

    if(directorio != null){
        this.directorioRepository.delete(directorio);
        return "Eliminado con exito";
    }

    return "Directorio no existe";
    }


    
}
