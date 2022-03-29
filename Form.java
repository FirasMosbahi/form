import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
public class Form extends JPanel implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JLabel nameLabel;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_2_2;
	private JLabel lblNewLabel_1_2_3;
	private JLabel a1 ;
	private JLabel a2 ;
	private JLabel a3 ;
	private JLabel a4 ;

	/**
	 * Create the panel.
	 */
	public Form() {
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(250, 235, 215));
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Formulaire", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 128)));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register a new Student");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana Pro", Font.BOLD, 30));
		lblNewLabel.setBounds(39, 0, 423, 65);
		add(lblNewLabel);
		
		nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(51, 0, 0));
		nameLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		nameLabel.setBounds(94, 81, 71, 40);
		add(nameLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		textField.setBounds(200, 84, 241, 40);
		add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1_1 = new JLabel("DOB");
		lblNewLabel_1_1.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(94, 143, 71, 40);
		add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2.setBounds(94, 203, 71, 40);
		add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		textField_1.setBounds(200, 146, 241, 40);
		add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Male");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		chckbxNewCheckBox.setBounds(215, 213, 93, 21);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxFemale = new JCheckBox("Female");
		chckbxFemale.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		chckbxFemale.setBounds(340, 213, 93, 21);
		add(chckbxFemale);
		
		lblNewLabel_1_2_1 = new JLabel("Mail id");
		lblNewLabel_1_2_1.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_1.setBounds(94, 253, 71, 40);
		add(lblNewLabel_1_2_1);
		
		lblNewLabel_1_2_2 = new JLabel("Password");
		lblNewLabel_1_2_2.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_2.setBounds(94, 314, 82, 40);
		add(lblNewLabel_1_2_2);
		
		lblNewLabel_1_2_3 = new JLabel("Re Password");
		lblNewLabel_1_2_3.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_3.setBounds(94, 384, 108, 40);
		add(lblNewLabel_1_2_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		textField_2.setBounds(200, 253, 241, 40);
		add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 317, 241, 40);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(200, 384, 241, 40);
		add(passwordField_1);
		
		JLabel lblNewLabel_1_2_3_1 = new JLabel("Courses");
		lblNewLabel_1_2_3_1.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_3_1.setBounds(94, 447, 108, 40);
		add(lblNewLabel_1_2_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"aa1", "aa2", "aa3", "aa4"}));
		comboBox.setBounds(200, 447, 241, 40);
		add(comboBox);
		
		JLabel lblNewLabel_1_2_3_1_1 = new JLabel("Branch");
		lblNewLabel_1_2_3_1_1.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_3_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_3_1_1.setBounds(94, 512, 108, 40);
		add(lblNewLabel_1_2_3_1_1);
		
		JLabel lblNewLabel_1_2_3_1_2 = new JLabel("Semester");
		lblNewLabel_1_2_3_1_2.setForeground(new Color(51, 0, 0));
		lblNewLabel_1_2_3_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_2_3_1_2.setBounds(94, 580, 108, 40);
		add(lblNewLabel_1_2_3_1_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"java", "python", "Mysql", "javascript"}));
		comboBox_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		comboBox_1.setBounds(200, 512, 241, 40);
		add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		comboBox_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		comboBox_2.setBounds(200, 580, 241, 40);
		add(comboBox_2);
		a1 = new JLabel("");
		a1.setBounds(463, 85, 99, 37);
		add(a1);
		
		a2 = new JLabel("");
		a2.setBounds(463, 146, 99, 37);
		add(a2);
		
		a3 = new JLabel("");
		a3.setBounds(463, 256, 99, 37);
		add(a3);
		
		a4 = new JLabel("");
		a4.setBounds(463, 387, 99, 37);
		add(a4);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setForeground(new Color(51, 153, 204));
		btnNewButton.setBounds(200, 646, 241, 33);
		add(btnNewButton);
		
		
	}public boolean email(String s)
	{
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		return(matcher.matches()); 
	}
	public boolean verife(String s) {
		int n=0;
		for(int i=0;i<s.length();i++) {
			char x=s.charAt(i);
			if((((x>='a')&&(x<='z'))||((x>='A')&&(x<='Z')))||(x==' '))
				n=0;
			else return(false);
		}
		return(true);
	}
	public boolean date(String s) {
		String regex="(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		return(matcher.matches());
	}
	public void actionPerformed(ActionEvent e) {
		String s1=textField.getText();
		String s2=textField_1.getText();
		String s3=textField_2.getText();
		@SuppressWarnings("deprecation")
		String s4=passwordField.getText();
		@SuppressWarnings("deprecation")
		String s5=passwordField_1.getText();
		String v="";
		if(s1.equals(v))
			a1.setText("donner un nom");
		else if(!verife(s1)) {
			a1.setForeground(Color.red);
			a1.setText("nom invalide");}
		     else {
		     a1.setForeground(Color.GREEN);
		     a1.setText("OK");}
		if(s2.equals(v))
			a2.setText("donner DOB");
		else if(date(s2))
		{
	     a2.setForeground(Color.GREEN);
	     a2.setText("OK");}
		else {
			a2.setForeground(Color.red);
			a2.setText("date invalide");}
		if(s3.equals(v))
			a3.setText("donner email");
		else if(email(s3))
		{
		     a3.setForeground(Color.GREEN);
		     a3.setText("OK");}
		else {a3.setForeground(Color.red);
		a3.setText("email invalide");}
		if((s4.equals(v))||(s5.equals(v)))
			a4.setText("donner Password");
		else if(s4.equals(s5))
		{
		     a4.setForeground(Color.GREEN);
		     a4.setText("OK");}
		else  {
			a4.setForeground(Color.red);
			a4.setText("invalide");}
		     
	}
	
	public static void main(String[]args) {
		JFrame frame = new JFrame("student");
        frame.setContentPane(new Form());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,750);
        frame.setVisible(true);
	}
}