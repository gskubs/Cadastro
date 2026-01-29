package dev.skbconsultoria.CadastroDeFamilia;

import jakarta.persistence.*;

//Entity transforma uma classe em uma entidade do Banco de Dados
//JPA Java persistence API, esse jakarta persistence, vem tudo do JPA que baixamos no Spring
@Entity
@Table(name = "tb_cadastro")
public class FamiliaModel {

    //passar o @ID para gerar o numero de identif de cada membro, e o GenerateValue para gerar os dados infinitamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public FamiliaModel() {
    }

    public FamiliaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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


}
