package model;

import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    
    private Long id;
    private String nome;
    private String departamento;
    private String funcao;
    private Double salario;
    private int dependentes;
    private Calendar dataContratacao;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * @return the depenedentes
     */
    public int getDependentes() {
        return dependentes;
    }

    /**
     * @param depenedentes the depenedentes to set
     */
    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    /**
     * @return the dataContratacao
     */
    public Calendar getDataContratacao() {
        return dataContratacao;
    }

    /**
     * @param dataContratacao the dataContratacao to set
     */
    public void setDataContratacao(Calendar dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    
}
