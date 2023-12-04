package br.com.app;

import java.util.ArrayList;
import java.util.List;

public class TestaContato {

    public static void main(String[] args) {

        Contato contato = new Contato("Pedro", "55 11 8922-7013");

        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Andre", "55 11 8933-7013"));
        contatos.add(new Contato("Joaquina", "55 11 8922-7012"));
        contatos.add(new Contato("Breatris", "55 11 7960-1240"));

        contato.setContatos(contatos);

        for (Contato pessoa : contatos) {

            System.out.println(pessoa.getNome() + " " + pessoa.getNumeroCelular());

        }

        contato.ligarPara("Andre");

    }

}
