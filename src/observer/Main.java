package observer;

import java.util.Observable;

import domain.Covid19Pacient;
import domain.SymptomFactory;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String args[]){
		SymptomFactory factory = new SymptomFactory();
		Covid19Pacient pacient1=new Covid19Pacient("aitor", 35, factory);
		PacientObserverGUI pacientGUI1= new PacientObserverGUI (pacient1);
		PacientSymptomGUI frame1 = new PacientSymptomGUI (pacient1);
		PacientThermometerGUI thermo1 = new PacientThermometerGUI(pacient1);
		SemaphorGUI semaphor1 = new SemaphorGUI(pacient1);
		
		/*
		Covid19Pacient pacient2=new Covid19Pacient("mikel", 28);
		PacientObserverGUI pacientGUI2= new PacientObserverGUI (pacient2);
		PacientSymptomGUI frame2 = new PacientSymptomGUI (pacient2);
		PacientThermometerGUI thermo2 = new PacientThermometerGUI(pacient2);
		
		Covid19Pacient pacient3=new Covid19Pacient("jon", 17);
		PacientObserverGUI pacientGUI3= new PacientObserverGUI (pacient3);
		PacientSymptomGUI frame3 = new PacientSymptomGUI (pacient3);
		PacientThermometerGUI thermo3 = new PacientThermometerGUI(pacient3);
		*/
	}

}
