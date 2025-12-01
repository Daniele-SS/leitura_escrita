package br.dev.daniele.leitura_escrita.repository;

import br.dev.daniele.leitura_escrita.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {
    public Contato contato;
    private Path arquivo = Paths.get("/Users/25203622/Documents/Arquivos/dados.csv");

    public void gravar(){
        try {
            Files.writeString(arquivo, contato.separarDadosContato(), StandardOpenOption.APPEND);
            System.out.println("Contato gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void exibirContatos(){
        try {
            List<String> linhas = Files.readAllLines(arquivo);

            for(String linha : linhas){
                String[] linhaContato = linha.split(";");
                System.out.println(linhaContato[0] + " - " + linhaContato[1]);
                System.out.println(linha);
            }

//            int contador = 0;
//            while (contador < linhas.size()){
//                System.out.println(linhas.get(contador));
//                contador++;
//            }

            System.out.println("PROGRAMA FINALIZADO!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}