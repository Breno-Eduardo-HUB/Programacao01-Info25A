/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

import java.util.List;

public abstract class Cursos {
    
    private int codigo;
    private String nome;
    private String chTotal;
    private String duracao;
    private String tipoDeDuracao;
    private List<String> modalidade;
    private boolean status;

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChTotal() {
        return chTotal;
    }

    public void setChTotal(String chTotal) {
        this.chTotal = chTotal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTipoDeDuracao() {
        return tipoDeDuracao;
    }

    public void setTipoDeDuracao(String tipoDeDuracao) {
        this.tipoDeDuracao = tipoDeDuracao;
    }

    public List<String> getModalidade() {
        return modalidade;
    }

    public void setModalidade(List<String> modalidade) {
        this.modalidade = modalidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public List<String> obterDiciplina(){
    return this.modalidade;
    }
    
}
