package br.senai.sp.jandira.ds1t.avaliatorio;

import br.senai.sp.jandira.ds1t.avaliatorio.model.AvaliatorioDoAluno;

public class Avaliatorio {
    public static void main(String[] args) {
        System.out.println("Iniciando o programa...");

        AvaliatorioDoAluno situacao = new AvaliatorioDoAluno();

        situacao.obterDados();
    }
}
