

/*Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade)*/

import entities.Itens;

import java.io.*;
import java.util.ArrayList;

public class Exercise {
    public static void main(String[] args) {

        String path = "C:\\Programacao\\Workspace\\FileHandling-Java\\temp\\archive.csv";
        ArrayList<Itens> itens = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                String[] atributes = line.split(",");
                    itens.add(new Itens(atributes[0],Double.parseDouble(atributes[1]),Integer.parseInt(atributes[2])));

                    line= br.readLine();

            }
        }
        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        String pathOut= "C:\\Programacao\\Workspace\\FileHandling-Java\\temp\\archiveOut.csv";
        try(BufferedWriter bw= new BufferedWriter(new FileWriter(pathOut,true))){
            for(Itens it : itens){
                bw.write(String.format("%s, %.2f",it.getName(),it.getPrice()*it.getNumberItens()));
                bw.newLine();
            }

        }
        catch (IOException e){
             System.out.println("error: "+e.getMessage());
        }

    }
}