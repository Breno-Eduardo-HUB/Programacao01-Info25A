/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ifc.brenoeduardo;

import java.util.Date;

// * @author Breno
public class Estudante {

    private static String nome;
    private Date dataNascimento;
    private char genero;
    private String matricula;
    private String email;
    private String nivelEnsino;
    private String telefone;
    private String dataDeIngresso;
    private String SemestreInicial;
    private String SituacaoAcademica;
    private String digito;

    public Estudante() {
        this.nome = "nobody";

    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        //Lógica para calcular idade
        return idade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }

    public static void setMatricula(String digito) {
        digito = digito;

    }
}
