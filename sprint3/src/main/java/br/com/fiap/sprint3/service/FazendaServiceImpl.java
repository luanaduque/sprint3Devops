package br.com.fiap.sprint3.service;


import br.com.fiap.sprint3.datasource.FazendaRepository;
import br.com.fiap.sprint3.domainmodel.Fazenda;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class FazendaServiceImpl implements FazendaService{


    private FazendaRepository repo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Fazenda save(Fazenda fazenda) {
        return this.repo.save(fazenda);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Fazenda fazenda) {
        this.repo.delete(fazenda);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(Long id) {
        this.repo.deleteById(id);
    }

    @Transactional(propagation = Propagation.NEVER)
    public Optional<Fazenda> findById(Long id) {
        return this.repo.findById(id);
    }

    @Transactional(propagation = Propagation.NEVER)
    public List<Fazenda> findAll() {
        return this.repo.findAll();
    }
}
