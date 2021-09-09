package com.userservice.data;

import java.util.Date;
import java.util.Objects;

public class User {
	private int id;
	private String name;
	private String login;
	private String password;
	private String email;
	private Date creationDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return id == user.id && Objects.equals(name, user.name) &&
				Objects.equals(login, user.login) &&
				Objects.equals(password, user.password) &&
				Objects.equals(email, user.email) &&
				Objects.equals(creationDate, user.creationDate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, login, password, email, creationDate);
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", creationDate=" + creationDate +
				'}';
	}
}
