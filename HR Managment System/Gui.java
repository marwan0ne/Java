package HR;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.accessibility.AccessibleActionEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField tUsername;
	private JTextField tPassword;
	final int length= 50;
	private String [] employees = new String[length];
	private String [] employeesPasswords = new String[length];
	private String [] employeeAge = new String[length];
	private String [] employeeGender = new String[length];
	private String [] employeeAddress = new String[length];
	private String [] employeeSalary = new String[length];
	private String [] employeeJobtitle = new String[length];
	private String [] employeeAttendance = new String[length];
	private int numEmp=3;
	int index=0;
	Employee emp1 = new Employee();
	Employee hr1 = new Employee();
	Employee ceo = new Employee();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		trial();
	}
	public void Emp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JButton btnNewButton = new JButton("View Data");
		btnNewButton.setBounds(10, 51, 176, 27);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				indvidulaDataView();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Advance payment-request");
		btnNewButton_1.setBounds(10, 164, 176, 27);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				advancePayment();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Vacation request");
		btnNewButton_2.setBounds(250, 51, 176, 27);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				vacationRequest();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.setBounds(250, 164, 176, 27);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				trial();
			
				
			}
			});
		
	}
	public void HR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JButton btnNewButton = new JButton("Add Employee");
		btnNewButton.setBounds(10, 51, 176, 27);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				addEmployee();
			}
		});
		JButton btnNewButton_1 = new JButton("View Data");
		btnNewButton_1.setBounds(10, 164, 176, 27);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				viewData();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Update Salary");
		btnNewButton_2.setBounds(250, 51, 176, 27);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				salaryUpdate();
			}
		});
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.setBounds(250, 164, 176, 27);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				trial();
			
				
			}
			});
		
		
	}
	public void cEO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JButton btnNewButton = new JButton("View Data");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				viewData();
			}
		});
		btnNewButton.setBounds(118, 73, 176, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Delete Data");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				deleteData();
			}
		});
		btnNewButton_2.setBounds(10, 164, 176, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Log Out");
		btnNewButton_3.setBounds(250, 164, 176, 27);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				trial();
			
				
			}
			});
		
	}
	public void trial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(163, 52, 61, 39);
		contentPane.add(lblNewLabel);
		
		tUsername = new JTextField();
		tUsername.setBounds(118, 111, 165, 19);
		contentPane.add(tUsername);
		tUsername.setColumns(10);
		
		tPassword = new JTextField();
		tPassword.setBounds(118, 155, 165, 19);
		contentPane.add(tPassword);
		tPassword.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(62, 217, 85, 21);
		contentPane.add(loginButton);
		// putting test values in the array One Employee 
		// One HR manager,Top manager,CEO
		
		employees[0] = "Marwan_E";
		employeesPasswords[0] = "1234";
		employeeAge[0] = "21";
		employeeGender[0] = "Male";
		employeeJobtitle[0] = "PR";
		employeeSalary[0] = "3000";
		employeeAddress[0] ="21 street";
		employees[1] = "Ashraf_HR";
		employeesPasswords[1] = "H123";
		employeeAge[1] = "41";
		employeeGender[1] = "Male";
		employeeJobtitle[1] = "HR";
		employeeSalary[1] = "7000";
		employeeAddress[1] ="12 street";
		employees[2] = "Ziad_CEO";
		employeesPasswords[2] = "A213";
		employeeAge[2] = "55";
		employeeGender[2] = "Male";
		employeeJobtitle[2] = "CEO";
		employeeSalary[2] = "100000";
		employeeAddress[2] ="9 street";
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) throws NullPointerException {
				boolean in = true;
				for (int i = 0;i <4; i++) {
					if (employees[i].equals(tUsername.getText())) {
						index = i;
						
						if(employeesPasswords[index].equals(tPassword.getText())){
								in = false;
							if (employees[i].endsWith("E")) {
							try {
									emp1.AttendanceCounter();
									setVisible(false);
									Emp();
								}
								catch(Exception a) {
									a.printStackTrace();
								}

							
							}
							else if(employees[i].endsWith("HR")) {
								try {
									hr1.AttendanceCounter();
									setVisible(false);
									
									HR();
								}
								catch(Exception a) {
									a.printStackTrace();
								}
							}
							else if(employees[i].endsWith("CEO")) {
								try {
									ceo.AttendanceCounter();
									setVisible(false);
									
									cEO();
								}
								catch(Exception a) {
									a.printStackTrace();
								}
							}
							break;
						}
					}

				}
				if(in) {
					tUsername.setText(null);
					tPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Invalid Username");
				}
			}
			
				
			

			
		});
	}
	public void addEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 29, 45, 13);
		contentPane.add(lblNewLabel);
		
		JTextField tName = new JTextField();
		tName.setBounds(92, 26, 96, 19);
		contentPane.add(tName);
		tName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(10, 62, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JTextField tAge = new JTextField();
		tAge.setBounds(92, 55, 96, 19);
		contentPane.add(tAge);
		tAge.setColumns(10);
		
		JTextField tGender = new JTextField();
		tGender.setBounds(92, 88, 96, 19);
		contentPane.add(tGender);
		tGender.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(10, 91, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JTextField tTitle = new JTextField();
		tTitle.setBounds(92, 127, 96, 19);
		contentPane.add(tTitle);
		tTitle.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Job title");
		lblNewLabel_3.setBounds(10, 130, 59, 13);
		contentPane.add(lblNewLabel_3);
		
		JTextField tDailySalary = new JTextField();
		tDailySalary.setBounds(92, 168, 96, 16);
		contentPane.add(tDailySalary);
		tDailySalary.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Daily salary");
		lblNewLabel_4.setBounds(10, 170, 76, 13);
		contentPane.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(10, 202, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(92, 199, 202, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add ");
		btnNewButton.setBounds(10, 218, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    emp1.setName(tName.getText());
				emp1.setAge(tAge.getText());
				emp1.setGender(tGender.getText());
				emp1.setJobtitle(tTitle.getText());
				emp1.setDailySalary(Integer.parseInt(tDailySalary.getText()));
				emp1.setAddress(textField_1.getText());
				// Saving Data in the database
				 employees[numEmp] = emp1.getName()+"_E";
				 // Creating a password
				 employeesPasswords[numEmp] = emp1.getName()+emp1.getId();
				 employeeAge [numEmp] = emp1.getAge();
				 employeeGender [numEmp] = emp1.getGender();
				 employeeAddress [numEmp] = emp1.getAddress();
				 employeeSalary [numEmp] = String.valueOf(emp1.calculateSalary((double) emp1.getCounter(), (double) emp1.advancePayment((int)emp1.getDailySalary(),emp1.getCounter())));
				 employeeJobtitle[numEmp] = emp1.getJobtitle();
				 employeeAttendance[numEmp] = String.valueOf(emp1.getCounter());
				
				
			}
		});
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(341, 218, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HR();
			}
		});
		
	}
	public void viewData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 29, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(79, 29, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setBounds(151, 29, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Job title");
		lblNewLabel_3.setBounds(239, 29, 59, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Salary");
		lblNewLabel_4.setBounds(311, 29, 76, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setBounds(381, 29, 76, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel name1 = new JLabel(employees[0]);
		name1.setBounds(1, 56, 76, 13);
		contentPane.add(name1);
		
		JLabel name2 = new JLabel(employees[1]);
		name2.setBounds(1, 91, 76, 13);
		contentPane.add(name2);
		
		JLabel name3 = new JLabel(employees[2]);
		name3.setBounds(1, 130, 76, 13);
		contentPane.add(name3);
		
		JLabel name4 = new JLabel(employees[3]);
		name4.setBounds(1, 170, 76, 13);
		contentPane.add(name4);
		
		JLabel age1 = new JLabel(employeeAge[0]);
		age1.setBounds(65, 56, 45, 13);
		contentPane.add(age1);
		JLabel age2 = new JLabel(employeeAge[1]);
		age2.setBounds(65, 91, 45, 13);
		contentPane.add(age2);
		
		JLabel age3 = new JLabel(employeeAge[2]);
		age3.setBounds(65, 130, 45, 13);
		contentPane.add(age3);
		
		JLabel age4 = new JLabel(employeeAge[3]);
		age4.setBounds(65, 170, 45, 13);
		contentPane.add(age4);
		
		JLabel gender = new JLabel(employeeGender[0]);
		gender.setBounds(151, 56, 45, 13);
		contentPane.add(gender);
		
		JLabel gender1 = new JLabel(employeeGender[1]);
		gender1.setBounds(151, 91, 45, 13);
		contentPane.add(gender1);
		
		JLabel gender2 = new JLabel(employeeGender[2]);
		gender2.setBounds(151, 130, 45, 13);
		contentPane.add(gender2);
		
		JLabel gender3 = new JLabel(employeeGender[3]);
		gender3.setBounds(151, 170, 45, 13);
		contentPane.add(gender3);
		
		JLabel title = new JLabel(employeeJobtitle[0]);
		title.setBounds(239, 56, 45, 13);
		contentPane.add(title);
		
		JLabel title1 = new JLabel(employeeJobtitle[1]);
		title1.setBounds(239, 91, 45, 13);
		contentPane.add(title1);
		
		JLabel title2 = new JLabel(employeeJobtitle[2]);
		title2.setBounds(239, 130, 45, 13);
		contentPane.add(title2);
		
		JLabel title3 = new JLabel(employeeJobtitle[3]);
		title3.setBounds(239, 170, 45, 13);
		contentPane.add(title3);
		
		JLabel s = new JLabel(employeeSalary[0]);
		s.setBounds(311, 56, 45, 13);
		contentPane.add(s);
		
		JLabel s1 = new JLabel(employeeSalary[1]);
		s1.setBounds(311, 91, 45, 13);
		contentPane.add(s1);
		
		JLabel s2 = new JLabel(employeeSalary[2]);
		s2.setBounds(311, 130, 45, 13);
		contentPane.add(s2);
		
		JLabel s3 = new JLabel(employeeSalary[3]);
		s3.setBounds(311, 170, 45, 13);
		contentPane.add(s3);
		
		JLabel ad1 = new JLabel(employeeAddress[0]);
		ad1.setBounds(381, 56, 76, 13);
		contentPane.add(ad1);
		
		JLabel ad2 = new JLabel(employeeAddress[1]);
		ad2.setBounds(381, 91, 76, 13);
		contentPane.add(ad2);
		
		JLabel ad3 = new JLabel(employeeAddress[2]);
		ad3.setBounds(381, 130, 76, 13);
		contentPane.add(ad3);
		
		JLabel ad4 = new JLabel(employeeAddress[3]);
		ad4.setBounds(381, 170, 76, 13);
		contentPane.add(ad4);
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(341, 218, 85, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(employees[index].endsWith("HR"))
					HR();
				else
					cEO();
			}
			
		});
	}
	public void indvidulaDataView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 36, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel eName = new JLabel(employees[index]);
		eName.setBounds(107, 36, 106, 13);
		getContentPane().add(eName);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(10, 74, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Attendance");
		lblNewLabel_3.setBounds(10, 109, 74, 13);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Job title");
		lblNewLabel_4.setBounds(10, 145, 45, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salary");
		lblNewLabel_5.setBounds(10, 180, 45, 13);
		getContentPane().add(lblNewLabel_5);
		
		JLabel eID = new JLabel(String.valueOf(emp1.getId()));
		eID.setBounds(107, 74, 106, 13);
		getContentPane().add(eID);
		
		JLabel eAttend = new JLabel(String.valueOf(emp1.getCounter()));
		eAttend.setBounds(107, 109, 106, 13);
		getContentPane().add(eAttend);
		
		JLabel eTitle = new JLabel(employeeJobtitle[index]);
		eTitle.setBounds(107, 145, 106, 13);
		getContentPane().add(eTitle);
		
		JLabel eSalary = new JLabel(employeeSalary[index]);
		eSalary.setBounds(107, 180, 106, 13);
		getContentPane().add(eSalary);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(341, 232, 85, 21);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				Emp();
			}
		});
	}
	public void salaryUpdate() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("Please enter the name of the employee ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(31, 38, 337, 17);
		getContentPane().add(lblNewLabel);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(31, 65, 205, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the updated salary");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPleaseEnterThe.setBounds(31, 108, 337, 17);
		getContentPane().add(lblPleaseEnterThe);
		
		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 135, 205, 19);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(10, 210, 85, 21);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i<4;i++) {
					int in=0;
					if(employees[i].equals(textField_1.getText()))
					{
						in = i;
						employeeSalary[in] = textField_2.getText();
						JOptionPane.showMessageDialog(null, "Salary updated");
					}
				}
			}
		});
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(301, 210, 85, 21);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HR();
			}
		});

		
	}

	public void deleteData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Please enter the name of the employee ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(31, 80, 337, 17);
		getContentPane().add(lblNewLabel);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(31, 116, 205, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBounds(10, 210, 85, 21);
		getContentPane().add(btnNewButton);
		JButton btnNewButton1 = new JButton("Delete");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "The Data has been deleted");
				}
			
			
		});
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBounds(301, 210, 85, 21);
		getContentPane().add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				cEO();
			}
		});

	}
	public void vacationRequest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		


		
		JButton back = new JButton("Back");
		back.setBounds(351, 164, 85, 27);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Emp();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Please enter the number of vaccation  days you want to take");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 38, 402, 27);
		contentPane.add(lblNewLabel);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(24, 81, 194, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBounds(10, 164, 85, 27);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// we have applied the concept of methods overloading 
				emp1.vacationRequest(Integer.parseInt(textField_2.getText()));
				textField_2.setText(null);
			}
		});

	}
	public void advancePayment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		


		
		JButton back = new JButton("Back");
		back.setBounds(351, 164, 85, 27);
		contentPane.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Emp();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Please enter how much money you want to take");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 38, 402, 27);
		contentPane.add(lblNewLabel);
		
		JTextField textField_2 = new JTextField();
		textField_2.setBounds(24, 81, 194, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setBounds(10, 164, 85, 27);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// we have applied the concept of methods overloading 
				int advance = emp1.advancePayment((int)emp1.getDailySalary(),Integer.parseInt(textField_2.getText()));
				if(advance > 0) {
					JOptionPane.showMessageDialog(null, "Your request is accepted");
				}
				else if(advance == 0) {
				JOptionPane.showMessageDialog(null, "Your request is denied");
				textField_2.setText(null);
				}
			}
		});

	}
}



