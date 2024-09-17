package br.com.fiap.sprint3.service;

import br.com.fiap.sprint3.domainmodel.Agricultor;

import java.util.List;
import java.util.Optional;

public interface AgricultorService {

    Agricultor save(Agricultor agricultor);

    void delete(Agricultor a);

    void deleteById(Long id);

    Optional<Agricultor> findById(Long id);

    List<Agricultor> findAll();
}
