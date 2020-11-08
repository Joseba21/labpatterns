package adapter;

import java.util.Comparator;

import domain.Symptom;

public class Comparator2 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if(((Symptom) o1).getSeverityIndex()>((Symptom) o2).getSeverityIndex()) {
			return 1;
		} else if(((Symptom) o1).getSeverityIndex()<((Symptom) o2).getSeverityIndex()) {
			return -1;
		} else {
			return 0;
		}
	}

}
