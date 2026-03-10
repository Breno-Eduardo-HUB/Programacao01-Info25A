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
    private static String nome;
    private Date dataNascimento;
    char genero;
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
        public static String getNome(){
            return nome;
        }
        public static void setNome (String _nome){
            nome = _nome;
        }

}