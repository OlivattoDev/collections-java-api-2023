package list.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O proximo evento: " + entry.getValue() + " acontecera na data: " + entry.getKey());
            break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JANUARY, 21), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2021, Month.MARCH, 01), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 16), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 17), "Evento 5", "Atracao 5");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
