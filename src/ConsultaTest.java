import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

public class ConsultaTest {

    @Test 
    public void testeConsulta(){
        Consulta consulta_B;

        consulta_B = new ConsultaAgendada("Gregório", LocalDateTime.now(), EEspecialidade.DERMATOLOGIA);
        
        assertTrue(0, ConsultaAgendada(consulta_B));
    }
}
