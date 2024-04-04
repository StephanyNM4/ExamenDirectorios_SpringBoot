package examen1.examen1.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import examen1.examen1.modelos.Direccion;
import examen1.examen1.servicios.impl.DireccionServiceImpl;

@RestController
@RequestMapping("/api/direccion")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PutMapping("/actualizar")
    public String actualizarDireccion(@RequestParam(name = "codigoDireccion") int codigoDireccion, @RequestBody Direccion direccion) {
        return this.direccionServiceImpl.actualizarDireccion(codigoDireccion, direccion);
    }
}
