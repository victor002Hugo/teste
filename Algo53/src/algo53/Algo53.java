package algo53;

import javax.swing.JOptionPane;

public class Algo53 {
    public static void main(String[] args) {
      
        Paralelepipedo PP = new Paralelepipedo();
        
        String s;
        
        s = JOptionPane.showInputDialog("Entre com o valor da base ");
        PP.dA = Double.parseDouble(s);
        
        System.out.println("O valor de dA eh : "+PP.dA);
        
        PP.dB = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Altura "));
        
        System.out.println("O valor de dB eh : "+PP.dB);
        
        PP.dC = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Profundidade"));
        
        System.out.println("O valor de dC eh : "+PP.dC);
        
        PP.dDiagonal = Math.sqrt(Math.pow(PP.dA, 2) + Math.pow(PP.dB, 2) + Math.pow(PP.dC, 2));
        
        JOptionPane.showMessageDialog(null,"O valor da Diagonal é : "+PP.dDiagonal);
    }
    
}
