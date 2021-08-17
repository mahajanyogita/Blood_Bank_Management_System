class Donor{
	
	private String fname;
	private String lname;
	private String email;
	private Long phone;
	private String password;
	private String state;
	private String city;
	private String blood_grp;
	private String gender;
	private int age;

	public Donor(){
		
		fname=null;
		lname=null;
		email=null;
		phone=null;
		password=null;
		state=null;
		city=null;
		blood_grp=null;
		gender=null;
		age=0;
	}

	public Donor(String fname,String lname,String email, Long phone,String password,String state,String city,int age,String blood_grp,String gender){
	
		this.fname=fname;
		this.lname=lname;
		this.password=password;
		this.email=email;
		this.phone=phone;
		this.state=state;
		this.city=city;
		this.blood_grp=blood_grp;
		this.gender=gender;
		this.age=age;
	}
	
	public String toString(){
		return fname+"\t"+lname+"\t"+email+"\t"+phone+"\t"+state+"\t"+city+"\t" +blood_grp+"\t"+gender+"\t"+age;
	}



	public void setFname(String fname){
		this.fname=fname;
	}


	public String getFname(){
		return fname;
	}

	////////////////////////////////////////////
	public void setLname(String lname){
		this.lname=lname;
	}
	


	public String getLname(){
		return lname;
	}

	////////////////////////////////////////////////
	public void setEmail(String email){
		this.email=email;
	}
	

	public String getEmail(){
		return email;
	}

	////////////////////////////////////////////////
	public void setPhone(Long phone){
		this.phone=phone;
	}
	
	public Long getPhone(){
		return phone;
	}

	////////////////////////////////////////////////

	public void setPassword(String password){
		this.password=password;
	}
	
	public String getPassword(){
		return password;
	}

	////////////////////////////////////////////////

	public void setCity(String city){
		this.city=city;
	}
	
	public String getCity(){
		return city;
	}

////////////////////////////////////////////////

	public void setState(String state){
		this.state=state;
	}
	
	public String getState(){
		return state;
	}

	////////////////////////////////////////////////

	public void setBlood_grp(String blood_grp){
		this.blood_grp=blood_grp;
	}
	
	public String getBlood_grp(){
		return blood_grp;
	}

	////////////////////////////////////////////////

	public void setGender(String gender){
		this.gender=gender;
	}
	
	public String getGender(){
		return gender;
	}

	////////////////////////////////////////////////

	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}

		////////////////////////////////////////////////
}
















