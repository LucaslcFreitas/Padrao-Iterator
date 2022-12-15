import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProcessoSeletivo implements Iterable<Candidato> {

    private List<Candidato> candidatos = new ArrayList<>();

    public ProcessoSeletivo(Candidato... candidatos) {
        this.candidatos = Arrays.asList(candidatos);
    }

    @Override
    public Iterator<Candidato> iterator() {
        return candidatos.iterator();
    }
}
