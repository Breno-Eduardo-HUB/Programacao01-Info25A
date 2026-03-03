/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Date dataNascimento;
    private char genero;
    private String matricula;
    private String email;
    
        public Estudante(){
                this.nome= "nobody";
        
        }
    
        public int obterIdade (Date hoje){
        int idade = 0;
        //Lógica para calcular idade
        return idade;
    }
        public String getNome(){
            return this.nome;
        }
        public void setNome (String _nome){
            this.nome = _nome;
        }
}
