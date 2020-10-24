package br.com.viniciusmargotti.javaspringapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name="PESSOAS")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull(message = "O campo nome é obrigatório")
    @Column(name = "NOME")
    private String nome;

    @NotNull(message = "O campo nome é obrigatório")
    @Column(name = "SOBRENOME")
    private String sobrenome;

    @NotNull(message = "O campo numero é obrigatório")
    @Column(name = "ENDERECO")
    private String endereco;

    @NotNull(message = "O campo numero é obrigatório")
    @Column(name = "NUMERO")
    private String numero;

    @NotNull(message = "O campo complemento é obrigatório")
    @Column(name = "COMPLEMENTO")
    private String complemento;

    @NotNull(message = "O campo referencia é obrigatório")
    @Column(name = "REFERENCIA")
    private String referencia;

    @NotNull(message = "O campo de identificação do cliente é obrigatório")
    @Column(name = "I_DATABASES")
    private Integer databases;

    public Pessoa() {
    }
}
