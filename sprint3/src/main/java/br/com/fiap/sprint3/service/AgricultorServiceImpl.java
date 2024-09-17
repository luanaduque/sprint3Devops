package br.com.fiap.sprint3.service;

import br.com.fiap.sprint3.datasource.AgricultorRepository;
import br.com.fiap.sprint3.domainmodel.Agricultor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AgricultorServiceImpl implements AgricultorService{

    private AgricultorRepository repo;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Agricultor save(Agricultor agricultor) {
        return this.repo.save(agricultor);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(Agricultor agricultor) {
        this.repo.delete(agricultor);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(Long id) {
        this.repo.deleteById(id);
    }

    @Transactional(propagation = Propagation.NEVER)
    public Optional<Agricultor> findById(Long id) {
        return this.repo.findById(id);
    }

    @Transactional(propagation = Propagation.NEVER)
    public List<Agricultor> findAll() {
        return this.repo.findAll();
    }
}
