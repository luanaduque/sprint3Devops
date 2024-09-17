package br.com.fiap.sprint3.service;

import br.com.fiap.sprint3.domainmodel.Fazenda;

import java.util.List;
import java.util.Optional;

public interface FazendaService {

    Fazenda save(Fazenda fazenda);

    void delete(Fazenda f);

    void deleteById(Long id);

    Optional<Fazenda> findById(Long id);

    List<Fazenda> findAll();
}
