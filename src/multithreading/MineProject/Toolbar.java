/**
03-Aug-2019
Dell

 * 
 */
package multithreading.MineProject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author Dell
 *
 *         11:47:18 am
 */
public class Toolbar extends JPanel implements ActionListener {

	private JButton startButton;

	private JButton stopButton;
	private ButtonListener listener;

	public Toolbar() {

		setLayout(new FlowLayout(FlowLayout.CENTER));
		initVariables();

		add(startButton);
		add(stopButton);
	}

	/**
	 * 
	 */
	private void initVariables() {
		this.startButton = new JButton("Start");

		this.stopButton = new JButton("Stop");
		this.startButton.addActionListener(this);

		this.stopButton.addActionListener(this);

	}

	public void setButtonListener(ButtonListener listener) {
		this.listener = listener;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if ((JButton) e.getSource() == startButton && this.listener != null) {
			this.listener.startClicked();
		} else {
			this.listener.stopClicked();
		}

	}

}
