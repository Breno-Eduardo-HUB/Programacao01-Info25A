/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ifc.brenoeduardo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Date dataNascimento;
    char genero;
    private String matricula;
    private String email;
    
        public Estudante(){
                this.nome= "nobody";
            System.out.println("eu sou hetero");
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