/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.brenoeduardo;

import java.util.Date;

/**
 * *
 * @author aluno
 */
public class SistemaIFC {
    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante vinicius = new Estudante();
        Estudante joao = new Estudante();
        
        camada.setNome("Camada");
        vinicius.setNome("Vinicius");
        joao.setNome("Joao");
        
        System.out.println(camada.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(joao.getNome());
    }
}
