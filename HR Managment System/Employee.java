package HR;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Employee extends Person {
		double attendance ;
		double advancePayment ;
		double dailySalary ; 
		int counter ;
	    private static int id = 20002000 ; 
	    String jobtitle ; 
	    public Employee() {
	        id++ ;
	    }     
	   
	    public String getJobtitle() {
	        
	        return jobtitle;
	    }
	 
	     
	    public double getAdvancePayment() {
			return advancePayment;
		}

	    
		public void setDailySalary(double dailySalary) {
			this.dailySalary = dailySalary;
		}

		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
		}

		public double getDailySalary() {
	        
	        return dailySalary;
	    }
		public int getId() {
			return id;
		}
	    

 /*
	    public void setSalary(double attendance , double advancePayment) {
	        this.attendance = attendance ;
	        this.advancePayment = advancePayment ;
	        hashbash  
	    }
	 */  
	     public double calculateSalary(double attendance, double advancPayment) {
	         int workDays = 22;
	         int weeklyHolidays = 8 * 150 ;
	         double vacationDays = (double) (workDays-attendance) ;
	         double workedDays = (double)(workDays - vacationDays ) ; 
	         double workedDaysSalary = (dailySalary *  workedDays) ;
	         double mainSalary = (workedDaysSalary + weeklyHolidays) ;
	         double taxes = (mainSalary*0.236); /* 23.6% is the total of taxes */ 
	         double theSalary = (mainSalary - taxes);
	         
	         return theSalary ;
	         
	     }
	     public void AttendanceCounter(){

    	     counter =0;
    	    counter++;
    	    if  (counter>22)
    	    	counter=0;
  
	    }
	     public int getCounter() {
	    	 return counter;
	     }
	     public int advancePayment(int dailySalary,int advance) { 
	         int allowedAdvance = (dailySalary * 5);
	         if(advance <= allowedAdvance) {
	             
	         	return advance;
	         }
	         else {
	            
	            return 0;
	         }
	     }
	     public int vacationRequest(int vacation) {
	    	 // The allowed vacation days for employee within a month is 4 days
	    	 if(vacation >4) {
	    		 JOptionPane.showMessageDialog(null,"Vacation request denied");
	    		 return 0;
	    	 }
	    	 else {
	    		 JOptionPane.showMessageDialog(null,"Vacation request accepted");
	    		 return vacation;
	    	 }
	     }


	  }

	

