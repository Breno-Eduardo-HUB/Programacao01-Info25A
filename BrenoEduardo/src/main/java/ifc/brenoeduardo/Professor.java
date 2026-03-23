/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.brenoeduardo;

import java.util.Date;

public class Professor {
    
    private static String nome;
    private static String SIAPE;
    private String email;
    private String telefone;
    private String TitulacaoAcademica;
    private String areaDeAtuacao;
    private String Formacao;
    private Date DataDeNascimento;
    private String cpf;
    private String genero;
    
    public Professor(){
    this.nome = "nobody";
    }
    
    public int obterIdade(Date hoje) {
        int idade = 0;
        //Lógica para calcular idade
        return idade;
    }
    
    public static void setNome(String _nome){
    nome = _nome;
    
    }
    public static String getNome(){
    return nome; 
    }
    
    public void setEmail(String e){
    email = e;
    }
    public String getEmail(){
    return email;
    }
    
    public void setTelefone(String call){
    telefone = call;
    }
    public String getTelefone(){
    return telefone;
    }
    
    public void setTitulacaoAcademica(String titulo){
    TitulacaoAcademica = titulo;
    }
    public String getTitulacaoAcademica(){
    return TitulacaoAcademica;
    }
    
    public void setAreaDeAtuacao(String area){
    areaDeAtuacao = area;
    }
    public String getAreaDeAtuacao(){
    return areaDeAtuacao;
    }
    
    public void setFormacao(String form){
    Formacao = form;
    }
    public String getFormacao(){
    return Formacao;
    }
    
    public void setCpf(String _cpf){
    cpf = _cpf;
    }
    public String getCpf(){
    return cpf;
    }
    
    public void setGenero(String gen){
    genero = gen;
    }
    public String getGenero(){
    return genero;    
    }    
}
