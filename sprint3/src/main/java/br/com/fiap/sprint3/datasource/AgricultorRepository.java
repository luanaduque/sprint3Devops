package br.com.fiap.sprint3.datasource;

import br.com.fiap.sprint3.domainmodel.Agricultor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgricultorRepository extends JpaRepository<Agricultor, Long> {
}
