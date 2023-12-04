package br.com.estudos.mundojava.dls_interna;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {

    private Cliente cliente; // TEM UM CLIENTE
    private List<Video> relacaoVideo = new ArrayList<Video>(); // TEM MUTOS VIDEOS
    private Date dataDevolucao; // TEM UMA DATA DE DEVOLUÇÃO
    private boolean pago; // ESTA PAGO OU NÃO

    // contrutor
    public Locacao(Cliente cliente) {
        this.cliente = cliente;

    }

    static Locacao para(Cliente cliente) {
        return new Locacao(cliente);

    }

    public Locacao imprimeNateLa() {
        System.out.println("Ola");
        return this;
    }

    // getters e setters

    public Cliente getCliente() {
        return this.cliente;

    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Video> getRelacaoVideo() {

        return relacaoVideo;
    }

    public void setRelacaoVideo(List<Video> relacaoVideo) {
        this.relacaoVideo = relacaoVideo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

}
