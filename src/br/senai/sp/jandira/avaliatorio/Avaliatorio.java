package br.senai.sp.jandira.avaliatorio;

import br.senai.sp.jandira.avaliatorio.model.Aluno;

public class Avaliatorio {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...");

        Aluno situacao = new Aluno();

        situacao.obterDados();
    }
}
