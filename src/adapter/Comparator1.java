package adapter;

import java.util.Comparator;

import domain.Symptom;

public class Comparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		if(((Symptom) o1).getName().compareTo(((Symptom) o2).getName())>0) {
			return 1;
		} else if(((Symptom) o1).getName().compareTo(((Symptom) o2).getName())<0) {
			return -1;
		} else {
			return 0;
		}
	}

}
