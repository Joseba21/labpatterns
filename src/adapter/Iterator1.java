package adapter;

import java.util.List;
import domain.Symptom;

public class Iterator1 implements InvertedIterator {
	private List<Symptom> symptoms;
	private int position;

	public Iterator1(List<Symptom> sintomak) {
		symptoms=sintomak;
		position=symptoms.size();
	}

	@Override
	public Object previous() {
        if(position<symptoms.size()-1) {
            return symptoms.get(position--);
        }else {
            position--;
            return this.symptoms.get(symptoms.size()-1);
        }
	}

	@Override
	public boolean hasPrevious() {
		if(position>=0) {
			return true;
		}
		return false;
	}

	@Override
	public void goLast() {
		this.position=symptoms.size()-1;
	}
}