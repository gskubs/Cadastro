package dev.skbconsultoria.CadastroDeFamilia.Trabalhos;

import dev.skbconsultoria.CadastroDeFamilia.Familias.FamiliaModel;
import jakarta.persistence.*;
import java.util.List;

//Entity transforma uma classe em uma entidade do Banco de Dados
//JPA Java persistence API, esse jakarta persistence, vem tudo do JPA que baixamos no Spring
@Entity
@Table(name = "tb_tarefas")
public class TrabalhoModel {

    //passar o @ID para gerar o numero de identif de cada membro, e o GenerateValue para gerar os dados infinitamente.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tarefas;
    private String descricao;
    private String dificuldade;

    //@OneToMany significa muitos familiares em uma mesma tarefa, usamos sempre no elemento que vc for precisar.
    @OneToMany(mappedBy = "trabalho")
    private List<FamiliaModel> familia;

    public TrabalhoModel() {
    }

    public TrabalhoModel(String tarefas, String descricao, String dificuldade, List<FamiliaModel> familia) {
        this.tarefas = tarefas;
        this.descricao = descricao;
        this.dificuldade = dificuldade;
        this.familia = familia;
    }

    public String getTarefas() {
        return tarefas;
    }

    public void setTarefas(String tarefas) {
        this.tarefas = tarefas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<FamiliaModel> getFamilia() {
        return familia;
    }

    public void setFamilia(List<FamiliaModel> familia) {
        this.familia = familia;
    }


}


