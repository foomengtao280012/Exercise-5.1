import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Calculator {

	private JFrame frame;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, ans;
				try {
					n1 = Integer.parseInt(textFieldN1.getText());
					n2 = Integer.parseInt(textFieldN2.getText());

					ans = n1 + n2;
					textFieldAnswer.setText(Integer.toString(ans));

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error! Please enter number only!");
				}
			}
		});
		AddButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		AddButton.setBounds(80, 100, 90, 30);
		frame.getContentPane().add(AddButton);

		JButton MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1, n2, ans;
				try {
					n1 = Integer.parseInt(textFieldN1.getText());
					n2 = Integer.parseInt(textFieldN2.getText());
					ans = n1 - n2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error! Please enter number only!");
				}
			}
		});
		MinusButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		MinusButton.setBounds(280, 100, 90, 30);
		frame.getContentPane().add(MinusButton);

		textFieldN1 = new JTextField();
		textFieldN1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textFieldN1.setBounds(75, 50, 100, 30);
		frame.getContentPane().add(textFieldN1);
		textFieldN1.setColumns(10);

		textFieldN2 = new JTextField();
		textFieldN2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textFieldN2.setBounds(275, 50, 100, 30);
		frame.getContentPane().add(textFieldN2);
		textFieldN2.setColumns(10);

		textFieldAnswer = new JTextField();
		textFieldAnswer.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textFieldAnswer.setBounds(230, 180, 100, 30);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);

		JLabel AnswerLabel = new JLabel("The Answer is");
		AnswerLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AnswerLabel.setBounds(80, 180, 150, 30);
		frame.getContentPane().add(AnswerLabel);
	}
}
