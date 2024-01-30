package day4Lab;

class Employee{
 private String fname;
 private String lname;
 private String gender;

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFname(){
          return fname;
   }
   public String getLname(){
          return lname;
   } 
   public void setFname(String fname){
        this.fname=fname;
   } 
   public void setLname(String lname){
        this.lname=lname;
   } 
} 
 
class InvalidNameException extends Exception {
    InvalidNameException(String s) {
        super(s);
    }
} 
 class EmpName {
    void empdetails(String fname, String lname) throws InvalidNameException {
         if (fname.isEmpty() &&  lname.isEmpty()) {
            throw new InvalidNameException("Employee First and last name missing");
        }     else if(fname.isEmpty()){
            throw new InvalidNameException("Employee First name is missing");
        }
         else  if(lname.isEmpty()){
            throw new InvalidNameException("Employee Last name is missing");
        }
    }
 }