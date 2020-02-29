/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05092019;

/**
 *
 * @author Victor Hugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Numeros Num = new Numeros();
        
        byte i;
        //leitura dos dados
        for(i=0;i<=9;i++){
            
            Num.v1[i]=i;
        }
        //Imprimir os dados
        i=0;
        
        while(i<10){
            System.out.println("O numero na posicao["+i+"] eh..: "+Num.v1[i]);
            i++;

        }
        
        
    }
    
}
