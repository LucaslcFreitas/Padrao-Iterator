public class Candidato {

    private String nome;
    private boolean aprovado;

    public Candidato(String nome, boolean aprovado) {
        this.nome = nome;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
