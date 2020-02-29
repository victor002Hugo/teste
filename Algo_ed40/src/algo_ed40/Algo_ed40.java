package algo_ed40;
public class Algo_ed40 {

   
    public static void main(String[] args) {
    //primeiro nome da classe depois nome do objeto
        Divisao DV = new Divisao();
        
        DV.iDividendo =  10;
        DV.iDivisor = 3;
        
        DV.iQuociente=DV.iDividendo/DV.iDivisor;
        DV.iResto=DV.iDividendo%DV.iDivisor;
        
        System.out.println("Dividendo..: " + DV.iDividendo);
        System.out.println("Divisor..: " + DV.iDivisor);
        System.out.println("Quociente..: " + DV.iQuociente);
        System.out.println("Resto..: " + DV.iResto);
        
        
    }
    
}
