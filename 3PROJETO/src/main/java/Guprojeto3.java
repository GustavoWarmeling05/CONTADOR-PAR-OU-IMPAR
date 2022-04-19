import javax.swing.*;

public class Guprojeto3 {
    public static void main(String[] args) {
       
        double n1;                                                    
        String ret;
        int cp = 0, ci = 0;  
       
        for (int i = 0; i <= 9; i++) {
            ret = JOptionPane.showInputDialog(null, " Digite o número "); 
            n1 = Double.parseDouble(ret); 
            if ( n1 %2 == 0 ) { 
                cp++;
             } else {
                ci++;
            }
        }
        JOptionPane.showMessageDialog(null," Quantidade de números pares é  " + cp ); 
        JOptionPane.showMessageDialog(null," Quantidade de números ímpares  é  " + ci ); 
    }
}
