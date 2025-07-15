package list.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Matheus", 3322);
        agendaContatos.adicionarContato("Matheus Olivatto", 222222);
        agendaContatos.adicionarContato("Matheus Franco", 998765);
        agendaContatos.adicionarContato("Jose", 222222);
        agendaContatos.adicionarContato("Matheus", 555555);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Matheus Olivatto");
        agendaContatos.exibirContato();


        System.out.println("O numero e: " + agendaContatos.pesquisarPorNome("Matheus Franco"));

    }
}


