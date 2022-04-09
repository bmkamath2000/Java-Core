package frames;
import java.awt.FlowLayout;  
import javax.swing.*;  
  
public class SimpleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Frame example");
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.setText("button");
		JLabel label = new JLabel("Frame Label");
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(button);
		window.add(panel);
		window.setSize(300, 200);
		window.setLocationRelativeTo(null);  
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
