/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static solidario_gamma_v2.MockupData.warehouse;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Dummy_funcionario;
import model.Warehouse;

/**
 *
 * @author Missy M, Migthy Arroz e Arkham
 */
public class Warehouse_Controller {
	Scanner scan=new Scanner(System.in);
	
	public Warehouse_Controller(){
		
	}
	
public void criar_novo( String nome,String categoria, String local) {
        
        String cat;
        int op=0;
        boolean existe; 
        
        Warehouse armazem = new Warehouse(0,categoria,nome,local,null,null,0,null);  
        
        armazem.setId_armazem(warehouse.size());               
           
            
            warehouse.add(armazem);            
      
                    } 


}



