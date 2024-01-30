package Java_Pack1;

public class Lab1_7_Person {
		private String fname;
		private String lname;
		private String gender;
		private String pnumber;
		
		public Lab1_7_Person() {
		}
		
		public Lab1_7_Person(String fname, String lname, String gender, String pnumber) {
			super();
			this.fname = fname;
			this.lname = lname;
			this.gender = gender;
			this.pnumber = pnumber;
		}

		public String getPnumber() {
			return pnumber;
		}

		public void setPnumber(String pnumber) {
			this.pnumber = pnumber;
		}

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public void printData() {
			System.out.println("First name: "+fname+ "Last name: "+lname+ " Gender: "+gender + " Phone number: "+pnumber);
		}
	}

