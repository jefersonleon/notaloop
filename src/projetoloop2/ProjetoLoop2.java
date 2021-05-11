package projetoloop2;

import java.util.Scanner;

/**
 * @author Jeferson
 * Assunto: Introdução aos Acumuladores 
 */
public class ProjetoLoop2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor, acumulador,icms;
        int cont, quantidade, numItens;
        String nomeProd, conteudo;
        acumulador = 0; cont = 1; icms= 0;
        conteudo =  "       N O T A  F I S C A L \n----------------------------\n";
         conteudo = conteudo + "Produto       Quantidade      Vlr. Unit     Total\n";
        System.out.println("Quantos produtos irá passar?");
        quantidade = ler.nextInt(); 
        while(cont<=quantidade){
            System.out.println("Informe o nome do produto");
            nomeProd = ler.next();
            System.out.println("Quantos itens deste produto?");
            numItens = ler.nextInt();
            System.out.println("Quanto custa o produto?");
            valor = ler.nextDouble();
            acumulador = acumulador +(numItens * valor);
           
            if(cont == 1){
                conteudo = conteudo + "  "+nomeProd+"         "+numItens+"              R$ "
                                                +valor+"      R$"+(numItens*valor)+"\n";
            }else{
              conteudo = conteudo + "  "+nomeProd+"         "+numItens+"              R$ "
                                                +valor+"      R$"+(numItens*valor)+"\n";
            }
            cont++;
        }//fim do loop
        System.out.println(conteudo);
        System.out.println("--------------------------\nTotal da nota: R$ "+acumulador);
        System.out.println("Total de ICMS: "+(acumulador*0.18));
      
    }
    
}
