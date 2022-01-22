/*
 * Class Description: 	This class creates the GUI and is able to execute the code done previously in the Driver class
 * 						with some graphical features.
 * Name: Ryan Russell
 * UIN: 227006614
 * Email: rhrussell@tamu.edu
 */

import java.io.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectGUI extends JFrame 
{

	private JPanel contentPane;
	private JTextField fileNameTextField;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ProjectGUI frame = new ProjectGUI();	//creates a new GUI object
					frame.setVisible(true);	//opens the frame up
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public ProjectGUI() //default constructor for the GUI
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//closes the GUI when you click the "X"
		setBounds(100, 100, 1149, 728);	//boundaries
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	//adds the content pane
		
		JLabel titleLabel = new JLabel("CSCE 314 Java Team Creator");	//label in the GUI for the title
		titleLabel.setBounds(-15, 69, 1121, 22);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(titleLabel);	//adds the fonted and formatted label to the pane
		
		JLabel fileNameLabel = new JLabel("Filename:");	//label in the GUI for the fileName
		fileNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fileNameLabel.setBounds(42, 149, 77, 36);
		contentPane.add(fileNameLabel);	//adds the fonted and formatted label to the pane
		
		JLabel resultsLabel = new JLabel("Results");	//label in the GUI for the results
		resultsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		resultsLabel.setBounds(42, 198, 77, 22);
		contentPane.add(resultsLabel);	//adds the fonted and formatted label to the pane
		
		JScrollPane resultsScrollPane = new JScrollPane();	//scroll pane for the results (being able to scroll through the results)
		resultsScrollPane.setBounds(42, 233, 493, 406);
		contentPane.add(resultsScrollPane);	//adds the result scroll pane to the pane
		
		JTextArea resultsTextArea = new JTextArea();	//text area where the results will be put
		resultsScrollPane.setViewportView(resultsTextArea);
		
		JLabel errorsLabel = new JLabel("Errors");	//label in the GUI for the errors
		errorsLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		errorsLabel.setBounds(562, 197, 56, 24);
		contentPane.add(errorsLabel);	//adds the fonted and formatted label to the pane
		
		JScrollPane errorsScrollPane = new JScrollPane();	//scroll pane for the errors (being able to scroll through the errors)
		errorsScrollPane.setBounds(561, 233, 525, 256);	
		contentPane.add(errorsScrollPane);	///adds the error scroll pane to the pane
		
		JTextArea errorsTextArea = new JTextArea();	//text area where the errors will be put
		errorsScrollPane.setViewportView(errorsTextArea);
		
		JButton generateTeamsButton = new JButton("Generate Teams"); //button to execute the program from the driver
		generateTeamsButton.addActionListener(new ActionListener() 	//listens for the button to be clicked; if clicked, then this code will execute
		{
			public void actionPerformed(ActionEvent e) 
			{
				TeamBuilder teamMaker = new TeamBuilder(); //the program from the driver
		    	teamMaker.computeResults();
				
		    	try
		    	{
		    		FileReader resultsFR = new FileReader("C:\\Ryan Russell\\College\\Texas A&M\\Sophomore\\Summer 2020\\Courses\\CSCE 314(10 Week)\\Project\\CSCE314_Project\\results.txt");	//reads the results.txt
		    		resultsTextArea.read(resultsFR, null);	//puts it into the resultsTextArea
		    		resultsFR.close();	//closes the reader
		    	}
		    	catch(IOException e2)
		    	{
		    		System.err.println(e2);
		    	}
		    	
		    	try
		    	{
		    		FileReader errorsFR = new FileReader("C:\\Ryan Russell\\College\\Texas A&M\\Sophomore\\Summer 2020\\Courses\\CSCE 314(10 Week)\\Project\\CSCE314_Project\\ErrorLog.txt");	//reads the errors.txt
		    		errorsTextArea.read(errorsFR, null);	//puts it into the errorsTextArea
		    		errorsFR.close();	//closes the reader
		    	}
		    	catch(IOException e3)
		    	{
		    		System.err.println(e3);
		    	}
			}
		});
		
		generateTeamsButton.setBackground(new Color(211, 211, 211));
		generateTeamsButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		generateTeamsButton.setBounds(743, 550, 163, 36);
		contentPane.add(generateTeamsButton);	//some formatting and added to the pane for the Generate Teams button 
		
		fileNameTextField = new JTextField();	//file Name text field where the file name will go
		fileNameTextField.setBounds(118, 157, 417, 22);
		contentPane.add(fileNameTextField);	//added to the pane
		fileNameTextField.setColumns(10);	//file Name text field formatted
		
		JButton openFileButton = new JButton("File");	//button that will look for the file if clicked
		openFileButton.addActionListener(new ActionListener() //listens for the button to be clicked, if clicked then this code will execute
		{
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser fileChoose = new JFileChooser();	
				int returnValue = fileChoose.showOpenDialog(null);	//opens the open file window
				if(returnValue == JFileChooser.APPROVE_OPTION)	//if file is approved to be choosen
				{
					File selectedFile = fileChoose.getSelectedFile();	
					fileNameTextField.setText(selectedFile.getName());	//the file name will go where the fileName textField is
				}
			}
		});
		
		openFileButton.setHorizontalAlignment(SwingConstants.LEFT);
		openFileButton.setBackground(new Color(211, 211, 211));
		openFileButton.setBounds(0, 0, 1131, 25);
		contentPane.add(openFileButton);	//formatting the openFile button and adding it to the pane
	}
}