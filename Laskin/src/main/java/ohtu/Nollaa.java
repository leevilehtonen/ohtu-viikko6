package ohtu;

import javax.swing.JTextField;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int syote;

    public Nollaa (Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovelluslogiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

	@Override
	public void suorita() {
        syote = sovelluslogiikka.tulos();
        sovelluslogiikka.nollaa();
        syotekentta.setText("");
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }

	@Override
	public void peru() {
        sovelluslogiikka.plus(syote);
        syotekentta.setText("");
        tuloskentta.setText("" + sovelluslogiikka.tulos());
	};
   
}