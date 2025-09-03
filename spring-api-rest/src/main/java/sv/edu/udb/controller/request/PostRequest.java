package sv.edu.udb.controller.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true) //IGNORA LAS PROPIEDADES DESCONOCIDAS
@JsonInclude(JsonInclude.Include.NON_NULL) //NO INCLUYE LOS VALORES DEVUELTOS NULOS
public class PostRequest {

    @NotBlank //NO ACEPTA VALORES NULOS NI VACIOS
    private String title;

    @NotNull //NO ACEPTA VALORES NULOS
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @FutureOrPresent //VALIDA LA FECHA DEL PRESENTE A FUTURO
    private LocalDate postDate;

}
