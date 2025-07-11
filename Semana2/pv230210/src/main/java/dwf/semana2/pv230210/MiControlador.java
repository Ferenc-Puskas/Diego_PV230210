package dwf.semana2.pv230210;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datos")
public class MiControlador {

    @Autowired
    private MiServicio miServicio;

    @GetMapping
    public List<String> obtenerDatos() {
        return miServicio.obtenerDatos();
    }

    @PostMapping
    public String agregarDato(@RequestBody String nuevoDato) {
        miServicio.agregarDato(nuevoDato);
        return "Dato agregado correctamente: " + nuevoDato;
    }

    // EJERCICIO COMPLEMENTARIO //
    @PutMapping("/{index}")
    public String actualizarDato(@PathVariable int index, @RequestBody String nuevoDato) {
        boolean actualizado = miServicio.actualizarDato(index, nuevoDato);
        if (actualizado) {
            return "Dato actualizado correctamente en el índice " + index + ": " + nuevoDato;
        } else {
            return "No se pudo actualizar el dato. índice no válido.";
        }
    }

    @DeleteMapping("/{index}")
    public String eliminarDato(@PathVariable int index) {
        boolean eliminado = miServicio.eliminarDato(index);
        if (eliminado) {
            return "Dato eliminado correctamente en el indice " + index;
        } else {
            return "No se pudo eliminar el dato. Indice no valido.";
        }
    }

}
