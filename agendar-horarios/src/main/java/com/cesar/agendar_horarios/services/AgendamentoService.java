package com.cesar.agendar_horarios.services;

import com.cesar.agendar_horarios.infraStructure.entity.Agendamento;
import com.cesar.agendar_horarios.infraStructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.internal.DelayedStructJdbcType;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    // SALVAR AGENDAMENTO
    public Agendamento salvarAgendamento(Agendamento agendamento) {

        // agendar horario
        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();

        // verificar se dentro do periodo de 1 hora nao tem outro client agendado.
        LocalDateTime horaFim = agendamento.getDataHoraAgendamento().plusHours(1);


        Agendamento agendados = agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(
                agendamento.getServico(),
                horaAgendamento,
                horaFim);

        // se o agendados ja estiver preenchido retorna uma Exception
        if (Objects.nonNull(agendados)){
            throw new RuntimeException("Esse horário ja está reservado!");
        }

        // salvar o agendamento
        return  agendamentoRepository.save(agendamento);

    }

    // DELETAR POR DATA E HORA OU NOME DO CLIENTE
    public void deletarAgendamento(LocalDateTime dataHoraAgendamento, String cliente) {
        agendamentoRepository.deleteByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);
    }

    // BUSCAR AGENDAMENTOS DO DIA
    public List<Agendamento> buscarAgendamentosDia(LocalDate data) {
        LocalDateTime primeiraHoraDia = data.atStartOfDay();
        LocalDateTime horaFinalDia = data.atTime(23, 59, 59);

       return agendamentoRepository.findByDataHoraAgendamentoBetween(primeiraHoraDia, horaFinalDia);
    }

    // ALTERAR AGENDAMENTOS
    public Agendamento alterarAgendamento(Agendamento agendamento, String cliente, LocalDateTime dataHoraAgendamento) {
       Agendamento agenda = agendamentoRepository.findByDataHoraAgendamentoAndCliente(dataHoraAgendamento, cliente);

       if (Objects.isNull(agenda)) {
           throw new RuntimeException("Horário não está preenchido!");
       }

       agendamento.setId(agenda.getId());
       return agendamentoRepository.save(agendamento);
    }
}
