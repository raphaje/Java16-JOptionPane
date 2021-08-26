import javax.swing.JOptionPane;

public class Dialogos {

	public static void main(String[] args) {
	    String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
	    
	    JOptionPane.showMessageDialog(null, nome);
	    //System.out.println(nome);
	  }
}
