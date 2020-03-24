package pairprogramming;

public class calculator {
	String name = "dave"; 
	int daveSalary = 21000;
	double tax10 = 0.1;
	double tax20 = 0.2; 
	double tax30 = 0.3;
 public String nameprinter(){
	 return name;} 
public int salaryprinter() {
	return daveSalary;}
public double tax() {
if ( daveSalary <21000 ) { 
		return daveSalary * tax10;
	} 
else { 
	return daveSalary * tax20; } 
}

}
