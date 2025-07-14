package list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Matheus", 9);
        agendaContatos.adicionarContato("Matheus Olivatto", 111111);
        agendaContatos.adicionarContato("Matheus Dev", 987654);
        agendaContatos.adicionarContato("Joao", 111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));


        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Matheus Olivatto", 999999));

        agendaContatos.exibirContato();
    }
}
