package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DtoClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String Name;
private String Email;
private String Phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}




}
