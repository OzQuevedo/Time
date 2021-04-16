package mvc.model;

import java.time.*;
import java.time.chrono.*;

import mvc.view.ViewImpegno;


public class Impegno {
	
	private LocalTime inizio;
	private LocalTime fine;
	private String titolo;
	private String descrizione;
	
	private ViewImpegno viewImpegno;
	
	
	
	public Impegno(LocalTime inizio, LocalTime fine, String titolo, String descrizione) {
		
		this.inizio = inizio;
		this.fine = fine;
		this.titolo = titolo;
		this.descrizione = descrizione;
		
		
	}
	
	
	
	public void setViewListener(ViewImpegno listener) {
		this.viewImpegno = listener;
	}
	
	public ViewImpegno getViewListener() {
		return viewImpegno;
	}

	
	public String getTitolo() {
		return titolo;
	}
	public void removeImpegno() {
		
		
		
	}
	
	public String dichiaraImpegno() {
		
		return "Titolo: " + titolo + "\n" +
		"Descrizione: " + descrizione + "\n" +
		"Inizio: " + inizio + "\n" +
		"Fine: " + fine + "\n";
		
	}
	
	

}
