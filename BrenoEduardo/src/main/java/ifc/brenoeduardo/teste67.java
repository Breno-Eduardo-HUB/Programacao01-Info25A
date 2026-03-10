/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.brenoeduardo;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class teste67 {
    public static void main(String[] args) {
        Estudante camada = new Estudante();
        camada.getNome();
        camada.obterIdade(new Date());
        camada.genero = 'm';
        
        System.out.println("Hello World!");
    }
}
