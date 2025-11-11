import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class JListExample {

	public void createGUI(ArrayList<Distrito> distritos) {
		JFrame frame = new JFrame("JList Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		// Create a JList using the string array
		JList<String> list = new JList<>(new DistritosListModel(distritos));

		// Add the JList to a JScrollPane to allow scrolling
		JScrollPane scrollPane = new JScrollPane(list);

		// Add the JScrollPane to the frame
		frame.add(scrollPane,BorderLayout.CENTER);
		JButton botao=new JButton("Detalhes");
		frame.add(botao,BorderLayout.SOUTH);
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(list.isSelectionEmpty())
					JOptionPane.showMessageDialog(null, "Não está nenhum item selecionado!");
				else if(list.getSelectedIndices().length>1)
					JOptionPane.showMessageDialog(null, "Estão vários itens selecionados!");
				else {
					String concelhos="";
					for(Concelho c:distritos.get(list.getSelectedIndex()).conselhos)
						concelhos+=c.name+", ";
					JOptionPane.showMessageDialog(null, "Concelhos do distrito "+distritos.get(list.getSelectedIndex()).name+
							": "+concelhos);
				}
			}
		});

		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
