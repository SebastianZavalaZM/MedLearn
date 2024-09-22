package pe.edu.upc.medlearn;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(
        name = "javainuseapi",
        scheme = "Bearer",
        bearerFormat = "JWT",            // Indicar que estás usando JWT
        type = SecuritySchemeType.HTTP,  // Usar tipo HTTP para Bearer Tokens
        in = SecuritySchemeIn.HEADER     // El token se enviará en el encabezado
)
public class MedLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedLearnApplication.class, args);
    }

}
