package br.com.app;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nome;
    private String numeroCelular;
    private List<Contato> contatos;

    Contato(String nome, String numeroCelular) {
        this.nome = nome;
        this.numeroCelular = numeroCelular;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = new ArrayList<>();
        this.contatos = contatos;

    }

    public List<Contato> getContatos() {
        return this.contatos;
    }

    public void imprimeLista(List<Contato> contatos) {
        for (Contato contato : contatos) {
            System.out.println("Nome do contato " + contato.getNome() + "\n" +
                    " Celular do contato" + contato.getNumeroCelular());
        }
    }
}
