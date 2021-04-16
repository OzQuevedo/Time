package mvc.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewNewImpegno extends JFrame {
	
	final int LARGHEZZA = 400;
	final int ALTEZZA= 700;
	
	JTextField txtNome;
	JTextField txtDescrizione;
	JTextField txtInizio;
	JTextField txtFine;
	JButton btnAnnulla;
	JButton btnSalva;
	
	
	
	
	public ViewNewImpegno (String titolo) {
		super(titolo);
		init(LARGHEZZA, ALTEZZA);
	}
	
	public ViewNewImpegno (String titolo, int larghezza, int altezza) {
		super(titolo);
		init(larghezza, altezza);
	} 
	
	private void init(int larghezza, int altezza) {
		this.setSize(larghezza, altezza);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//contenitore etichette
		JPanel impLabel = new JPanel(new GridLayout(4,1));
		impLabel.add(new JLabel("Titolo", JLabel.RIGHT));
		impLabel.add(new JLabel("Descrizione", JLabel.RIGHT));
		impLabel.add(new JLabel("Inizio", JLabel.RIGHT));
		impLabel.add(new JLabel("Fine", JLabel.RIGHT));
		
		//contenitore caselle di testo
		JTextField txtNome = new JTextField(15);
		JTextField txtDescrizione = new JTextField(30);
		JTextField txtInizio = new JTextField(15);
		JTextField txtFine = new JTextField(15);
		JPanel impTxt = new JPanel(new GridLayout(4, 1 , 10, 0));
		impTxt.add(txtNome);
		impTxt.add(txtDescrizione);
		impTxt.add(txtInizio);
		impTxt.add(txtFine);
		
		//contenitore area center
		JPanel impCenter_01 = new JPanel();
		impCenter_01.setLayout(new BoxLayout(impCenter_01, BoxLayout.X_AXIS));
		impCenter_01.add(impLabel);
		impCenter_01.add(impTxt);
		
		JPanel impCenter_02 = new JPanel();
		//impCenter_02.setLayout.add(impCenter_02);
		
		//contenitore area south
		btnAnnulla = new JButton ("Annulla");
		btnSalva = new JButton ("Salva");
		JPanel impSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5 , 10));
		impSouth.add(btnAnnulla);
		impSouth.add(btnSalva);
		
		this.getContentPane().add(impCenter_02, BorderLayout.CENTER);
		this.getContentPane().add(impSouth, BorderLayout.SOUTH);		
		
		
	}

	
}
