package com.br.estudos.app;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private String nome;
    private String numeroCelular;
    private List<Contato> contatos;
    private List<Contato> contatosRecentes = new ArrayList<>();

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

    public void setContatosRecentes(Contato contato) {
        contatosRecentes.add(contato);
    }

    public List<Contato> getContatosRecentes() {
        return this.contatosRecentes;
    }

    public List<Contato> getContatos() {
        return this.contatos;
    }

    public void imprimeContatosRecentes() {
        for (Contato contato : getContatosRecentes()) {
            System.out.println("Nome: " + contato.getNome() + "\n" +
                    "Celular: " + contato.getNumeroCelular());
        }
    }

    public void imprimeLista(List<Contato> contatos) {
        System.out.println("LISTA DE CONTATOS" + "\n" + "==================");
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + ":" + "\n" +
                    "Celular: " + contato.getNumeroCelular() + "\n");
        }
    }

    public void ligarPara(String nome) {
        for (Contato contato : this.getContatos()) {
            if (nome.equals(contato.getNome())) {
                System.out.println("Voce ligou para: " + contato.getNome() + "\n" +
                        "Celular: " + contato.getNumeroCelular());
                this.setContatosRecentes(contato);
                break;
            }
        }
    }
}