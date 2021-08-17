class Admin{
	
	private String email;
	private String name;
	private String password;

	public Admin(){
		email=null;
		name=null;
		password=null;
	}

	public Admin(String name,String email, String password){
	
		this.name=name;
		this.email=email;
		this.password=password;
	}
	
	public String toString(){
		return "name = "+name+" Email = "+email+" password = "+password;
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
}
















