package cn.cdl.domain;

public class User {
	private String username;
	private String userpassword;
	private String truename;
	private String sex;
	private int age;
	private String department;
	private String grade;
	private String professional;
	private String phone;
	private String qqmun;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQqmun() {
		return qqmun;
	}
	public void setQqmun(String qqmun) {
		this.qqmun = qqmun;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getProfessional() {
		return professional;
	}
	public void setProfessional(String professional) {
		this.professional = professional;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userpassword=" + userpassword
				+ ", grade=" + grade + ", prof=" + professional + ", truename="
				+ truename + ", sex=" + sex + ", age=" + age + ", phone="
				+ phone + ", qqmun=" + qqmun + "]";
	}
	
}
