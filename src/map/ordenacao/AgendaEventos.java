package map.ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();
        eventos.adicionarEvento(LocalDate.of(2024, 12, 15), "Circo", "Palhaço");
        eventos.adicionarEvento(LocalDate.of(2024, 9, 10), "Baixeto", "Palhaço");
        eventos.adicionarEvento(LocalDate.of(2024, 12, 19), "Ciranda", "Palhaço");
        eventos.adicionarEvento(LocalDate.of(2025, 1, 25), "João", "Palhaço");

        eventos.exibirAgenda();
        eventos.obterProximoEvento();
    }
}
