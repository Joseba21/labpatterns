package factory;

import domain.Covid19Pacient;
import domain.Medicament;
import domain.SymptomFactory;

public class Main {

	public static void main(String[] args) {
		SymptomFactory factory= new SymptomFactory();
        Medicament m=new Medicament("Ibuprofeno",factory);
        MedicalGUI mgui=new MedicalGUI(m);
	}

}
