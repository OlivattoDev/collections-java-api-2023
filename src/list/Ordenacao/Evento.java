package list.Ordenacao;

public class Evento {

    private String nome;
    private String atracao;

    public Evento(String atracao, String nome) {
        this.atracao = atracao;
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "atracao='" + atracao + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
