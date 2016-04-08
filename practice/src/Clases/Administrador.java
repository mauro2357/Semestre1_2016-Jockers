package Clases;

public class Administrador {
	private String adminuser;
	private String adminpass;
	public String getAdminuser() {
		return adminuser;
	}
	public void setAdminuser(String adminuser) {
		this.adminuser = adminuser;
	}
	public String getAdminpass() {
		return adminpass;
	}
	public void setAdminpass(String adminpass) {
		this.adminpass = adminpass;
	}
	public Administrador(String adminuser, String adminpass) {
		super();
		this.adminuser = adminuser;
		this.adminpass = adminpass;
	}
}
