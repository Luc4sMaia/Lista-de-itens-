package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ConfiguracoesDaLista;

public class ListaDeSupermercado { // class
	

	public static void main(String[] args) { // method
		Scanner sc = new Scanner(System.in);
		
       ConfiguracoesDaLista CL = new ConfiguracoesDaLista();
       int continuarOuSair;
       String produto;
       char escolha;
       List<String> list = new ArrayList<>();
       
   do { // do
	   System.out.println();
	   System.out.println("----------Caso queira encerrar o programa digite '9'----------");
	   System.out.println();
       System.out.println(CL);
       System.out.println();
       System.out.print("Qual opção deseja acessar? ");
       int option = sc.nextInt();
       if(option == 9) { // if
    	   System.exit(0);
       } // if

       switch (option) { // switch
     //---------------------------------------------------------------------------------------------------    
     //---------------------------------------------------------------------------------------------------     
       case 1: 
           do { // do
        	   System.out.println();
    	   System.out.print("Digite o nome do produto para ser adicionado a sua lista: ");
    	   sc.nextLine();
    	   produto = sc.nextLine();
    	   CL.addList(produto, list);
    	   System.out.println("-----Produto adicionado a sua lista-----");
    	   System.out.println();
    	   System.out.print("Digite 'C' para continuar e 'S' para sair: ");
    	   escolha = sc.next().charAt(0);
    	   if (escolha == 'S' || escolha == 's') { // if
    		   break;
    	   } // if
       } // do
           
while (escolha == 'c' || escolha == 'C');
           break;
         //---------------------------------------------------------------------------------------------------   
         //---------------------------------------------------------------------------------------------------     
       case 2: 
    	   do { // do
    		   System.out.println();
    	   System.out.print("Digite o nome do produto para ser removido da lista: ");
    	   sc.nextLine();
    	   produto = sc.nextLine();
    	   CL.removeList(produto, list);
    	   System.out.println("-----Produto removido da lista-----");
    	   System.out.println();
    	   System.out.print("Digite 'C' para continuar e 'S' para sair: ");
    	   escolha = sc.next().charAt(0);
    	   if(escolha == 'S' || escolha == 's') { // if
    		   break;
    	   } // if
    	   } // do
    	   while (escolha == 'C' || escolha == 'c');
    	   break;
    	 //---------------------------------------------------------------------------------------------------  
    	 //---------------------------------------------------------------------------------------------------     
       case 3:
    	   do { // do
    		   System.out.println();
    	   System.out.println("Produtos da lista: ");
    	   CL.allList(list);
    	   System.out.println();
    	   System.out.print("Digite 'C' para verificar os produtos novamente ou 'S' para sair: ");
    	   escolha = sc.next().charAt(0);
    	   if(escolha == 's' || escolha == 'S') { // if
    		   break;
    	   } // if
    	   } // do
    	   while (escolha == 'C' || escolha == 'c');
    	   break;
    	 //---------------------------------------------------------------------------------------------------     
    	 //---------------------------------------------------------------------------------------------------
       case 4:
    	   do { // do
    		   System.out.println();
    	   System.out.println("Sua lista contém " + list.size() + " iten(s)");
    	   System.out.println();
    	   System.out.print("Digite 'C' para verificar a quantidade novamente ou 'S' para sair: ");
    	   escolha = sc.next().charAt(0);
    	   if(escolha == 's' || escolha == 'S') {
    		   break;
    	   } // if
    	   } // do
    	   while (escolha == 'C' || escolha == 'c');
    	   break;
    	 //---------------------------------------------------------------------------------------------------     
    	 //---------------------------------------------------------------------------------------------------  
    	   default:
    		   System.out.println("Essa opção não existe! ");
    		   break;
    	   
       } // switch
	   System.out.println();
       System.out.print("Digite '0' para retornar ao menu ou '9' para finalizar o programa: ");
       continuarOuSair = sc.nextInt();
       if (continuarOuSair == 9) {
    	   System.exit(0);
       }
   } // do

     while (continuarOuSair == 0);
       sc.close();
	} // method
} // class

