import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main extends JFrame {
	
	public Main() {

		JMenuBar menuBar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		menuBar.add(file);
		
		JMenuItem newFile = new JMenuItem("New");
		file.add(newFile);
		
		JMenuItem save = new JMenuItem("Save");
		file.add(save);
		
		JMenuItem saveAs = new JMenuItem("Save As");
		file.add(saveAs);
		
		file.addSeparator();
		
		JMenuItem fileImport = new JMenuItem("Import");
		file.add(fileImport);
		
		JMenuItem export = new JMenuItem("Export");
		file.add(export);
		
		file.addSeparator();
		
		JMenuItem quit = new JMenuItem("Quit");
		file.add(quit);
		
		setJMenuBar(menuBar);
		
		setSize(600,600);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}
