import java.util.ArrayList;


public class Checklist {

	ArrayList<ListItem> items;
	
	public Checklist() {
		items = new ArrayList<ListItem>();
	}
	
	private ListItem removeItem(int num) {
		return items.remove(num);
	}

}
