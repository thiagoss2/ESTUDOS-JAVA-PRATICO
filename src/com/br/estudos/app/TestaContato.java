package com.br.estudos.app;

import java.util.ArrayList;
import java.util.List;

public class TestaContato {

    public static void main(String[] args) {

        Contato contato = new Contato("Pedro", "55 11 8922-7013");

        List<Contato> listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Andre", "55 11 8933-7013"));
        listaContatos.add(new Contato("Joaquina", "55 11 8922-7012"));
        listaContatos.add(new Contato("Breatris", "55 11 7960-1240"));

        contato.setContatos(listaContatos);

        contato.imprimeLista(listaContatos);

        System.out.println("\n");

        contato.ligarPara("Andre");
        contato.ligarPara("Joaquina");

        System.out.println("\n");

        contato.imprimeContatosRecentes();

    }

}
