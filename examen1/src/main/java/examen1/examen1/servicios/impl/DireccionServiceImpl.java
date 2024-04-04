package examen1.examen1.servicios.impl;

import org.springframework.stereotype.Service;

import examen1.examen1.modelos.Direccion;
import examen1.examen1.repositorios.DireccionRepository;
import examen1.examen1.servicios.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{

    private DireccionRepository direccionRepository;

    @Override
    public String actualizarDireccion(int codigoDireccion, Direccion direccion) {
        Direccion direccion1 = this.direccionRepository.findById(codigoDireccion).get();

        if(direccion1 != null){
            direccion1.setDepartamento(direccion.getDepartamento());
            direccion1.setPais(direccion.getPais());
            direccion1.setColonia(direccion.getColonia());
            return "Direccion actualizada";
        }

        return "Direccion no encontrada";
    }
    
}
