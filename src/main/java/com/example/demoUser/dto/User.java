package com.example.demoUser.dto;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	 	private static final long serialVersionUID = 4894729030347835498L;
	 	
	 	@Id
	    @GeneratedValue
		Integer id; // database entity
		String name;
		Date birthdate;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getBirthdate() {
			return birthdate;
		}
		public void setBirthdate(Date birthdate) {
			this.birthdate = birthdate;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
		}
		public User(Integer id, String name, Date birthdate) {
			super();
			this.id = id;
			this.name = name;
			this.birthdate = birthdate;
		}
		
}
