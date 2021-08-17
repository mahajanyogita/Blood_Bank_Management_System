class Buser{
	
	private String email;
	private String name;
	private String password;
	private String city;
	private String state;
	private Long phone;
	public Buser(){
		email=null;
		name=null;
		password=null;
		city=null;
		state=null;
		phone=null;
	}

	public Buser(String name,String email, String password, String city,String state,Long phone){
	
		this.name=name;
		this.email=email;
		this.password=password;
		this.city=city;
		this.state=state;
		this.phone=phone;
	}
	
	public String toString(){
		return name+"\t"+email+"\t"+phone+"\t"+city+"\t"+state;
	}



	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email=email;
	}
	
	public String getEmail(){
		return email;
	}
	public void setPassword(String password){
		this.password = password;
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
///////////////////////////////////////////////////
	public void setPhone(Long phone){
		this.phone=phone;
	}
	
	public Long getPhone(){
		return phone;
	}

}


	













