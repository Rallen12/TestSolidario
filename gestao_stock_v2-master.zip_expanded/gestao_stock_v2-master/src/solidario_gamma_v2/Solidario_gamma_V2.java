/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solidario_gamma_v2;

import static solidario_gamma_v2.MockupData.warehouse;

import java.util.Scanner;

import controller.*;
import model.Warehouse;

/**
 *
 * @author Missy M, Migthy Arroz e Arkham
 */
public class Solidario_gamma_V2 {

    private static Scanner scan;

	/**
     * @param args the command line arguments
     */
	
	
    public static void main(String[] args) {
    	
    	int op;
		do{
    		
    	
    	System.out.printf("escolha a opcao \n0--new armazem \n1--mod armazem\n2--Listar");
        scan = new Scanner(System.in);
    	Product_Controller pc=new Product_Controller();
    	Warehouse_Controller wc=new Warehouse_Controller();
    	
    	
    	op = scan.nextInt();
    	
        switch(op){
        
       
        
        case 0:
        	String categoria;
        	System.out.println("Indique os dados relativos ao novo armazem.");
            System.out.println("Designação do armazem:");
            String nome = new Scanner(System.in).nextLine();
             
            
            System.out.println("Seleccione a categoria de armazem:");                    
            for(int i=0; i<warehouse.size(); i++){ System.out.printf(""+ warehouse.get(i).getCategoria());  }                  
            System.out.println("0 - Criar nova categoria de armazem");
            op=scan.nextInt();
            if(op==0){
                System.out.println("Indique o nome da nova categoria de armazem");
              categoria=new Scanner(System.in).nextLine();
                System.out.println("Nova categoria "+ categoria + " criada." );
                System.out.flush();
               
            }else{
            categoria=new Scanner(System.in).nextLine();
            }
            System.out.println("Onde esta localizado o Armazem?");
            String local =new Scanner(System.in).nextLine();
            
             
            
            wc.criar_novo(nome,categoria,local);
            
            System.out.println("CRIADO!");
            
            
        	break;
        	
        	
        case 1:
        	System.out.println("Indique o armazem a modificar");
        	op = new Scanner(System.in).nextInt();
        	try {
        		warehouse.get(op).getName();
                	
        	} catch (IndexOutOfBoundsException e) {
        	    System.err.println("ERRO! " + e.getMessage()); break;}
        	
        	
        	System.out.println("Indique o que pretende modificar\n0--nome\n1--categoria\n2--local\n3--estado");
        	switch(new Scanner(System.in).nextInt()){
        	
        	case 0:
        		System.out.println("Indique o novo nome");
            	
            	warehouse.get(op).setNome_armazem(new Scanner(System.in).nextLine());
            	System.out.println("\nDone");
        	break;
        	case 1:
        		System.out.println("Indique a nova categoria");
            	
            	warehouse.get(op).setCategoria(new Scanner(System.in).nextLine());
            	System.out.println("\nDone");
        	break;
        	
        	case 2:
        		System.out.println("Indique o novo local");
            	
            	warehouse.get(op).setLocal(new Scanner(System.in).nextLine());
            	System.out.println("\nDone");
        	break;
        	}
        	
        case 2 :
        	
        	System.out.println("\nListar...\n");

        		for( Warehouse e : warehouse){
        			System.out.println("ID..."+e.getId());
        			System.out.println("NAME..."+e.getNome_armazem());
        			System.out.println("CATEGORIA..."+e.getCategoria());
        			System.out.println("LOCAL..."+e.getLocal());
        		
        		};
        	
        break;

case 3 :
        	
	System.out.println("\nProcurar...\n");
	System.out.println("\nProcurar por\n0--id\n1--nome\n2--categoria\n3--local");
        	switch(new Scanner(System.in).nextInt()){
        	case 0 :
        		System.out.println("\nInsira o Id a procurar\n");
        		int id; 
        		id = new Scanner(System.in).nextInt();
        		for( Warehouse e : warehouse){
        			if(e.getId_armazem()==id){
        			System.out.println("ID..."+e.getId());
        			System.out.println("NAME..."+e.getNome_armazem());
        			System.out.println("CATEGORIA..."+e.getCategoria());
        			System.out.println("LOCAL..."+e.getLocal());
        			}
        		}
        	break;
        	
        	case 1 :
        		System.out.println("\nInsira o nome a procurar\n");
        		String nomea; 
        		nomea = new Scanner(System.in).nextLine();
        		for( Warehouse e : warehouse){
        			if(e.getName()==nomea){
        			System.out.println("ID..."+e.getId());
        			System.out.println("CATEGORIA..."+e.getCategoria());
        			System.out.println("LOCAL..."+e.getLocal());
        			}
        		}
        	break;
        	
        	case 2 :
        		System.out.println("\nInsira a categoria a procurar\n");
        		String categoriaa; 
        		categoriaa = new Scanner(System.in).nextLine();
        		for( Warehouse e : warehouse){
        			if(e.getCategoria()==categoriaa){
        			System.out.println("ID..."+e.getId());
        			System.out.println("NAME..."+e.getNome_armazem());
        			
        			System.out.println("LOCAL..."+e.getLocal());
        			}
        		}
        	break;
        	
        	case 3 :
        		System.out.println("\nInsira o local a procurar\n");
        		String locala; 
        		locala = new Scanner(System.in).nextLine();
        		for( Warehouse e : warehouse){
        			if(e.getLocal()==locala){
        			System.out.println("ID..."+e.getId());
        			System.out.println("NAME..."+e.getNome_armazem());
        			System.out.println("CATEGORIA..."+e.getCategoria());
        			
        			}
        		}
        	break;
        	
        	}	
        break;
        
        }}while(op!=4);}}
    
    

