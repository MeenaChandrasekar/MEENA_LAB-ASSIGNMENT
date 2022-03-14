
	
	
	
	class Employee{
		private int id;
		private String firstName;
		private String lastName;
		private int salary;
		
		public Employee(int id, String firstName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}


		public String getFirstName() {
			return firstName;
		}

		//calculate full name and return 
		public String getName() {
			//------------------------IMPLEMENT LOGIC------------------------
			return null;
		}
		
		public String getLastName() {
			return lastName;
		}

		public int getSalary() {
			return salary;
		}
		
		//calculate annual salary and return 
		public int getAnnualSalary() {
			//------------------------IMPLEMENT LOGIC------------------------
			return 0;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		//increase the salary by the percentage and return the new salary
		public void raiseSalary(int percentage) {
			//------------------------IMPLEMENT LOGIC------------------------
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
					+ "]";
		}

		public double getPayment() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
	}
	
