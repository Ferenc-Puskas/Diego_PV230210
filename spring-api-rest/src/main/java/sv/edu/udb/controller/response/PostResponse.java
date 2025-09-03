package sv.edu.udb.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true) //ES PARA PODER MODIFICAR EL OBJETO LUEGO DE CREADO
@FieldNameConstants //PARA GENERAR CONSTANTES CON LOS NOMBRES DE LAS PROPIEDADES
public class PostResponse {

    private String title;

    private LocalDate postDate;

}
