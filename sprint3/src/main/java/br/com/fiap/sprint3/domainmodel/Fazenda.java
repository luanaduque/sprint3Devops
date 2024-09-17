package br.com.fiap.sprint3.domainmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Fazenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;

    private @Getter @Setter String nome;
    private @Getter @Setter String cidade;
    private @Getter @Setter String estado;
    private @Getter @Setter String telefone;
    private @Getter @Setter String email;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Fazenda fazenda)) return false;
        return Objects.equals(id, fazenda.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
