package examen1.examen1.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import examen1.examen1.modelos.Contacto;
import examen1.examen1.modelos.Directorio;
import examen1.examen1.servicios.impl.DirectorioServiceImpl;

@RestController
@RequestMapping("/api/directorio")
public class DirectorioController {
    
    @Autowired
    private DirectorioServiceImpl directorioServiceImpl;

    @GetMapping("/prueba")
    public String prueba(){
        return "Funciona";
    }

    @PostMapping("/guardar")
    public Directorio guardarDirectorio(@RequestBody Directorio directorio) {
        return this.directorioServiceImpl.guardarDirectorio(directorio);
    }

    @GetMapping("/buscar")
    public Directorio buscarDirectorio(@RequestParam(name = "codigoEntrada") String codigoEntrada) {
        return this.directorioServiceImpl.buscarDirectorio(codigoEntrada);
    }

    @GetMapping("/obtenerTodos")
    public List<Contacto> mostrarContactos(@RequestParam(name = "codigoEntrada") String codigoEntrada) {
        return this.directorioServiceImpl.mostrarContactos(codigoEntrada);
    }

    @DeleteMapping("/eliminar")
    public String eliminarDirectorio(@RequestParam(name = "codigoEntrada") String codigoEntrada) {
        return this.directorioServiceImpl.eliminarDirectorio(codigoEntrada);
    }
}
