package dev.skbconsultoria.CadastroDeFamilia.Familias;

import dev.skbconsultoria.CadastroDeFamilia.Trabalhos.TrabalhoModel;
import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;

//Entity transforma uma classe em uma entidade do Banco de Dados
//JPA Java persistence API, esse jakarta persistence, vem tudo do JPA que baixamos no Spring
@Entity
@Table(name = "tb_cadastro")
public class FamiliaModel {

    //passar o @ID para gerar o numero de identif de cada membro, e o GenerateValue para gerar os dados infinitamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne um familiar tem apenas uma unica tarefa, usamos sempre no elemento que vc for precisar.
    @ManyToOne
    @JoinColumn(name = "trabalho_id") // Foreing Key, ou chave estrangeira
    private TrabalhoModel trabalho;

    public FamiliaModel() {
    }

    public FamiliaModel(String nome, String email, int idade, TrabalhoModel trabalho) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TrabalhoModel getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(TrabalhoModel trabalho) {
        this.trabalho = trabalho;
    }
}
