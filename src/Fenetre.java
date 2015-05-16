import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;
 
public class Fenetre extends JFrame{
 
	private static final long serialVersionUID = 1L;

public Fenetre(){
    this.setTitle("Calculatrice");//titre
    this.setSize(470, 530);//taille fenetre
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//si il clique sur la croix alors la fenetre se ferme             
    this.setVisible(true);//la fenetre s'affiche
    this.setBackground(Color.black); // definis la couleur du fond de la fenetre       
    this.setContentPane(new Panneau());// Lie la fenetre au panneau
    this.setResizable(false);//La redimmension de la fenetre est désactivé

  }

public static void main(String[] args) {
	new Fenetre();//Affiche la fenetre
}

}