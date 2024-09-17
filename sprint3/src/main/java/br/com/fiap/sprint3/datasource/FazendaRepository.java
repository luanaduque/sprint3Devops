package br.com.fiap.sprint3.datasource;


import br.com.fiap.sprint3.domainmodel.Fazenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FazendaRepository extends JpaRepository<Fazenda, Long> {
}
