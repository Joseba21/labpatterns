package adapter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import domain.Covid19Pacient;
import domain.Symptom;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient p=new Covid19Pacient("Ane", 29);
		p.addSymptom(new Symptom("s1", 10, 10), 1);
		p.addSymptom(new Symptom("s2", 10, 8), 2);
		p.addSymptom(new Symptom("s3", 10, 7), 3);
		p.addSymptom(new Symptom("s4", 10, 5), 4);
		p.addSymptom(new Symptom("s5", 10, 2), 5);
		
		InvertedIterator it=new Iterator1(new ArrayList<Symptom>(p.getSymptoms()));
		Comparator<Object> comparator = new Comparator1();
		Comparator<Object> comparator2 = new Comparator2();
		
		Iterator<?> it1 = Sorting.sortedIterator(it, comparator);
		System.out.println("Sorted by SymptomName: ");
		while (it1.hasNext())
			System.out.println(it1.next());
		
		System.out.println("=====================");
		
		Iterator<?> it2 = Sorting.sortedIterator(it, comparator2);
		System.out.println("Sorted by SeverityIndex: ");
		while (it2.hasNext())
			System.out.println(it2.next());
		
	}

}
