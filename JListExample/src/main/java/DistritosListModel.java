import java.util.ArrayList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class DistritosListModel implements ListModel<String> {
	private ArrayList<Distrito> distritos;
	
	public DistritosListModel(ArrayList<Distrito> distritos) {
		super();
		this.distritos = distritos;
	}

	@Override
	public int getSize() {
		return distritos.size();
	}

	@Override
	public String getElementAt(int index) {
		return distritos.get(index).name+" <"+distritos.get(index).conselhos.size()+">";
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// irrelevante
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// irrelevante
		
	}

}
