package mvc.view;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import mvc.controller.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.model.*;


public class ViewImpegno extends JFrame implements ActionListener {
	
	private Impegno impegno;
	
	private JLabel mostraImpegno;
	
	
	public ViewImpegno(Impegno impegno) {
		
		super("Impegno view: "+ impegno.getTitolo());
		
		this.impegno = impegno;
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(new Dimension (500, 500));
		
		JPanel basePane = new JPanel(new BorderLayout());
		setContentPane(basePane);
		
			
		JPanel topPane = new JPanel();
		basePane.add(topPane, BorderLayout.NORTH);
		
		JPanel centerPane = new JPanel();
		basePane.add(centerPane, BorderLayout.CENTER);
		
		JPanel downPane = new JPanel();
		basePane.add(downPane, BorderLayout.SOUTH);
		
		mostraImpegno = new JLabel(impegno.dichiaraImpegno());
		
		topPane.add(mostraImpegno);
		
		JButton modificaButton = new JButton("Modifica");
		centerPane.add(modificaButton);
		
		JButton newButton = new JButton("New");
		downPane.add(newButton); 
		
		JButton deleteButton = new JButton("Delete");
		downPane.add(deleteButton); 
		
		
		
		newButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Salva");
				
				
				
				JPanel impLabel = new JPanel();
				impLabel.add(new JLabel("Titolo", JLabel.RIGHT));
				impLabel.add(new JLabel("Descrizione", JLabel.RIGHT));
				impLabel.add(new JLabel("Inizio", JLabel.RIGHT));
				impLabel.add(new JLabel("Fine", JLabel.RIGHT));
				
				//contenitore caselle di testo
				JTextField txtNome = new JTextField(15);
				JTextField txtDescrizione = new JTextField(15);
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
				impCenter_02.add(impCenter_01);
				
				//contenitore area south
				
				JButton btnSalva = new JButton ("Salva");
				JButton btnAnnulla = new JButton ("Annulla");
				JPanel impSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5 , 5));
				
				impSouth.add(btnSalva);
				impSouth.add(btnAnnulla);
				
				
				
			}
			
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				super.windowClosed(e);;
				
				impegno.setViewListener(null);
			}
		});
		
		
		
		
		
		

		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
	
	/**
	
	
	
	
public class ViewNewImpegno {
	
	final int LARGHEZZA = 400;
	final int ALTEZZA= 300;
	
	JTextField txtNome;
	JTextField txtDescrizione;
	JTextField txtInizio;
	JTextField txtFine;

	JButton btnSalva;
	JButton btnAnnulla;
	
	
	
	
	public ViewNewImpegno (String titolo) {
		super(titolo);
		init(LARGHEZZA, ALTEZZA);
		initListener();
	}
	
	public ViewNewImpegno (String titolo, int larghezza, int altezza) {
		super(titolo);
		init(larghezza, altezza);
	} 
	
	private void initListener(){
		//btnSalva.addActionListener(new BtnListener());
		//btnAnnulla.addActionListener(new BtnListener());
		
		
		btnSalva.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hai cliccato su salva");
			}			
		});
		
		btnAnnulla.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hai cliccato su annulla");
			}			
		});
		
		/**
		btnSalva.addActionListener(this);
		btnAnnulla.addActionListener(this);
		
	}
	
	private void init(int larghezza, int altezza) {
		this.setSize(larghezza, altezza);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//contenitore etichette
		JPanel impLabel = new JPanel(new GridLayout(4,1));
		impLabel.add(new JLabel("Titolo", JLabel.RIGHT));
		impLabel.add(new JLabel("Descrizione", JLabel.RIGHT));
		impLabel.add(new JLabel("Inizio", JLabel.RIGHT));
		impLabel.add(new JLabel("Fine", JLabel.RIGHT));
		
		//contenitore caselle di testo
		JTextField txtNome = new JTextField(15);
		JTextField txtDescrizione = new JTextField(15);
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
		impCenter_02.add(impCenter_01);
		
		//contenitore area south
		
		btnSalva = new JButton ("Salva");
		btnAnnulla = new JButton ("Annulla");
		JPanel impSouth = new JPanel(new FlowLayout(FlowLayout.RIGHT, 5 , 5));
		
		impSouth.add(btnSalva);
		impSouth.add(btnAnnulla);
		
		this.getContentPane().add(impCenter_02, BorderLayout.CENTER);
		this.getContentPane().add(impSouth, BorderLayout.SOUTH);		
		
		
	}
	
	private class BtnListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton btnSorgente = (JButton) e.getSource();
			System.out.println(btnSorgente.getActionCommand());
			
			if (btnSorgente.getActionCommand().equals("salva")) {
				System.out.println("hai cliccato su salva");
			}else if (btnSorgente.getActionCommand().equals("annulla")){
				System.out.println("hai cliccato su annulla");
			}
			
		}
		
		
		

	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
*/



