package com.userservice.configuration;

import org.springframework.context.annotation.*;

import java.util.*;

@Configuration
public class UserGenerateConfiguration {

	@Bean
	public List<String> nameList(){
		List<String> names = new ArrayList<>();
		names.add("Maks");
		names.add("Anna");
		names.add("Vlad");
		names.add("Andrii");
		names.add("Ivan");
		names.add("Shura");
		names.add("Vasi");
		names.add("Tolia");
		names.add("kolia");
		names.add("Sasha");
		names.add("Natasha");
		names.add("Katia");
		names.add("Vova");
		return names;
	}

	@Bean
	public List<String> emailList(){
		List<String> email = new ArrayList<>();
		email.add("bober05@gmail.com");
		email.add("rediska23@gmail.com");
		email.add("shtepsiek5443@gmail.com");
		email.add("abracadabra89005@gmail.com");
		email.add("univermag74@gmail.com");
		email.add("nagazine34@gmail.com");
		email.add("ultramet@gmail.com");
		email.add("dashboard@gmail.com");
		email.add("traktor@gmail.com");
		email.add("korova@gmail.com");
		email.add("himik34@gmail.com");
		return email;
	}

	@Bean
	public List<String> loginList(){
		List<String> email = new ArrayList<>();
		email.add("bober05");
		email.add("rediska23");
		email.add("shtepsiek5443");
		email.add("abracadabra89005");
		email.add("univermag74");
		email.add("nagazine34");
		email.add("ultramet");
		email.add("dashboard");
		email.add("traktor");
		email.add("korova");
		email.add("himik34");
		return email;
	}

	@Bean
	public List<String> passwordList(){
		List<String> email = new ArrayList<>();
		email.add("bober0523425");
		email.add("rediska23fgt");
		email.add("shtepsiek54435436");
		email.add("abracadabra89005grehy");
		email.add("univermag74bgh");
		email.add("nagazine34123");
		email.add("ultrametqwe");
		email.add("dashboardqwe");
		email.add("traktorqwe");
		email.add("korovaqwe");
		email.add("himik34qwe");
		return email;
	}
}
