import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnaliseTest {

    @Test
    void deveContarCandidatosAtivosProcessoSeletivo() {
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(
                new Candidato("Matheus", true),
                new Candidato("Gustavo", true),
                new Candidato("Mariana", false),
                new Candidato("Carla", true)
        );
        assertEquals(3, Analise.contarCandidatosAprovadosProcessoSeletivo(processoSeletivo));
    }

    @Test
    void deveContarTotalCandidatosProcessoSeletivo() {
        ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(
                new Candidato("Matheus", true),
                new Candidato("Gustavo", true),
                new Candidato("Mariana", false),
                new Candidato("Carla", true)
        );
        assertEquals(4, Analise.contarTotalCandidatosProcessoSeletivo(processoSeletivo));
    }
}