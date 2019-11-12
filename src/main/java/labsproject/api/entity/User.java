package labsproject.api.entity;

public class User {
	
	public User (Long id, String name, String email, String username, String password, Integer usertype) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}

	private Long id;
	
	private String name;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private Integer usertype;	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getUserType() {
		return usertype;
	}

	public void setUserType(Integer usertype) {
		this.usertype = usertype;
	}

}
