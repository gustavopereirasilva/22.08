package pkg22.pkg08;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String t1 = JOptionPane.showInputDialog("Insira nome");
        String nu = JOptionPane.showInputDialog("Informe idade");
        int conversao = Integer.parseInt(nu);
          if (conversao >= 18){
            JOptionPane.showMessageDialog(null, t1+" Voce ja pode tirar a CNH");
        }
        if (conversao < 18){
            JOptionPane.showMessageDialog(null, t1+" Voce nao pode tirar a CNH, voce tem apenas "+nu+" anos");
        }
    }
    
}
