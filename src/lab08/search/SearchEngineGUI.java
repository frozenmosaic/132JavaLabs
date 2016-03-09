package lab08.search;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.*;

public class SearchEngineGUI extends JFrame implements Observer {

	private KeyWordList myModel;

	private JTextField indexFile;
	private JTextField searchTerms;
	private JComboBox searchType;
	private JButton search;
	private JTextArea result;
	private JScrollPane scroll;

	public SearchEngineGUI() {
		super("Search Engine");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setPreferredSize(new Dimension(600, 400));
		this.add(mainPanel);

		myModel = new KeyWordList();
		myModel.addObserver(this);

		indexFile = new JTextField();
		indexFile.addActionListener(new IFListener());

		searchTerms = new JTextField();
		searchTerms.addActionListener(new STListener());

		searchType = getSearchTypes();

		search = new JButton("Search!");
		search.addActionListener(new ButtonListener());
		search.setEnabled(false);

		result = new JTextArea();
		scroll = new JScrollPane(result);
		scroll.setPreferredSize(new Dimension(200, 400));

		mainPanel.add(indexFile);
		mainPanel.add(searchTerms);
		mainPanel.add(searchType);
		mainPanel.add(search);
		mainPanel.add(scroll);

		this.pack();
		this.setVisible(true);

	}

	public static void main(String[] args) {
		SearchEngineGUI seg = new SearchEngineGUI();

		// try {
		// seg.myModel.loadIndexFile(seg.indexFile.getText());

		// KeyWord kw1 = new KeyWord("dickinson");
		// PageInfo t1 = new PageInfo("Dickinson College", "dickinson.edu",
		// 15);
		// PageInfo t2 = new PageInfo("Dickinson Academic",
		// "dickinson.edu/academic", 10);
		// kw1.addPage(t1);
		// kw1.addPage(t2);
		//
		// KeyWord kw2 = new KeyWord("facebook");
		// PageInfo t3 = new PageInfo("FB Home", "facebook.com", 25);
		// PageInfo t4 = new PageInfo("FB Help", "facebook.com/help", 5);
		// kw2.addPage(t3);
		// kw2.addPage(t4);
		//
		// KeyWord kw3 = new KeyWord("misc");
		// kw3.addPage(t1);
		// kw3.addPage(t2);
		// kw3.addPage(t3);
		// kw3.addPage(t4);
		//
		// // add all keywords to keyword list
		// seg.myModel.addKeyWord(kw2);
		// seg.myModel.addKeyWord(kw1);
		// seg.myModel.addKeyWord(kw3);
		// } catch (FileNotFoundException e) {
		// System.out.println("Cannot find the specified file.");
		// System.out.println(seg.indexFile.getText());
		// System.out.println("Done.");
		// }
	}

	public JComboBox getSearchTypes() {
		JComboBox res = new JComboBox();
		res.addItem("Select method of searching");
		res.addItem("Search Any");
		res.addItem("Search All");

		return res;
	}

	public void update(Observable o, Object arg) {

		if (searchTerms.getText().isEmpty()) {
			result.append("Please enter keywords. \n");
		} else {
			ArrayList<PageInfo> res = myModel.getResult();

			if (res.size() == 0) {
				result.setText(null);
				result.append("No matches found. \n");
			} else {
				result.setText(null);
				result.append("Results: \n \n");
				for (PageInfo each : res) {
					result.append(each.getTitle() + "\n" + each.getURL()
							+ "\n \n");
				}
				result.append("\n");
			}
		}

	}

	class ButtonListener implements ActionListener {

		public ButtonListener() {
		}

		public void actionPerformed(ActionEvent arg0) {
			String[] terms = searchTerms.getText().split(" ");
			if (terms.length == 1) {
				myModel.searchGUIOne(terms[0]);
			} else if (terms.length > 1) {
				if (searchType.getSelectedItem().equals("Search All")) {
					myModel.searchGUIAll(terms);
				} else if (searchType.getSelectedItem().equals("Search Any")) {
					myModel.searchGUIAny(terms);
				}
			}

		}
	}

	class IFListener implements ActionListener {
		public IFListener() {
		}

		public void actionPerformed(ActionEvent arg0) {
			try {
				myModel.loadIndexFile(indexFile.getText());
			} catch (FileNotFoundException e) {
				result.append("Cannot load file.");
			}
		}
	}

	class STListener implements ActionListener {
		public STListener() {
		}

		public void actionPerformed(ActionEvent arg0) {
			search.setEnabled(true);
		}
	}

}
