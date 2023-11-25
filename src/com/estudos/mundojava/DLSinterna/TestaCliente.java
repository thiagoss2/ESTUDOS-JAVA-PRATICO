package com.estudos.mundojava.DLSinterna;

import java.util.List;

import java.util.ArrayList;

public abstract class TestaCliente {

    public static void main(String[] args) {

    

        Video vd = new Video("A bruxa de Blair");
        List<Video> videos = new ArrayList<>();
        videos.add(vd);

        Cliente cli = new Cliente("394-588-599-77" ,"Joao" );

        Locacao lc = new Locacao(cli);

         Locacao lc2 = Locacao.para(cli);
        

        lc.setRelacaoVideo(videos);

        lc.imprimeNateLa().setCliente(cli);

    }



    
}
