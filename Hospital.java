class Hospital{
	
	private String name;
	private String email;
	private Long phone;
	private String password;
	private String state;
	private String city;
	private int ap;
	private int an;
	private int bp;
	private int bn;
	private int abp;
	private int abn;
	private int onb;
	private int opb;
	
	public Hospital(){		
		
		name=null;
		email=null;
		phone=null;
		password=null;
		state=null;
		city=null;
		ap=0;
		an=0;
	
		bp=0;
		bn=0;
		abp=0;
		abn=0;
		opb=0;
		onb=0;
		
	
	
	}


	public Hospital(String name,String email, Long phone,String password,String state,String city,int ap,int an,int bp,int bn,int abp,int abn,int opb,int onb)
	{
	

	System.out.println("ENtered");
	
		this.name=name;
		this.password=password;
		this.email=email;
		this.phone=phone;
		this.state=state;
		this.city=city;
		this.ap=ap;
		this.an=an;
	
		this.bp=bp;
		this.bn=bn;
		this.opb=opb;
		this.onb=onb;
		this.abp=abp;
		this.abn=abn;
		
	
		
	}
	
	
	public String toString(){
		return name+"\t"+email+"\t"+phone+"\t"+city+"\t"+state+"\t"+ap+"\t"+an+"\t"+bp+"\t"+bn+"\t"+abp+"\t"+abn+"\t"+opb+"\t"+onb;
	}


	public void setName(String name){
		this.name=name;
	}


	public String getName(){
		return name;
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

//////////////////////////////////////////////////
	public void setAp(int ap){
		this.ap=ap;
	}
	
	public int getAp(){
		return ap;
	}

//////////////////////////////////////
	public void setAn(int an){
		this.an=an;
	}
	
	public int getAn(){
		return an;
	}
	/////////////////////////////////////
	

	public void setBp(int bp){
		this.bp=bp;
	}
	
	public int getBp(){
		return bp;
	}
	/////////////////////////////////////////
		public void setBn(int bn){
		this.bn=bn;
	}
	
	public int getBn(){
		return bn;
	}

	//////////////////////////////////////////
		public void setAbp(int abp){
		this.abp=abp;
	}
	
	public int getAbp(){
		return abp;
	}//////////////////////////////////////////
			public void setAbn(int abn){
		this.abn=abn;
	}
	
	public int getAbn(){
		return abn;
	}

		////////////////////////////////////////////////




	public void setOpb(int opb){
		this.opb=opb;
	}
	
	public int getOpb(){
		return opb;
	}
	/////////////////////////////////////////
		public void setOnb(int onb){
		this.onb=onb;
	}
	
	public int getOnb(){
		return onb;
	}

}










