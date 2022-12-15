import java.util.Iterator;

public class Analise {

    public static Integer contarCandidatosAprovadosProcessoSeletivo(ProcessoSeletivo processoSeletivo) {
        int quantidade = 0;
        for (Candidato candidato : processoSeletivo) {
            if (candidato.isAprovado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalCandidatosProcessoSeletivo(ProcessoSeletivo processoSeletivo) {
        int quantidade = 0;
        for (Iterator a = processoSeletivo.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
