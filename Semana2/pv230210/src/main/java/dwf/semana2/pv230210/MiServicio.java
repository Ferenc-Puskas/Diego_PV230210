package dwf.semana2.pv230210;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MiServicio {

    private final List<String> datos = new ArrayList<>();

    public MiServicio() {
        datos.add("Elemento 1");
        datos.add("Elemento 2");
    }

    public List<String> obtenerDatos() {
        return datos;
    }

    public void agregarDato(String nuevoDato) {
        datos.add(nuevoDato);
    }

    // EJERCICIO COMPLEMENTARIO //

    public boolean actualizarDato(int index, String nuevoDato) {
        if (index >= 0 && index < datos.size()) {
            datos.set(index, nuevoDato);
            return true;
        }
        return false;
    }

    public boolean eliminarDato(int index) {
        if (index >= 0 && index < datos.size()) {
            datos.remove(index);
            return true;
        }
        return false;
    }
}
