package com.testjpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class JpaTestApplication {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		appContext = SpringApplication.run(JpaTestApplication.class, args);
		displayAllBeans();
	}

	public static void displayAllBeans(){
		String[] allBeans = appContext.getBeanDefinitionNames();
		for(String str : allBeans){
			System.out.println(str);
		}
	}

	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(10);
	}


	/*@Bean
	CommandLineRunner run(ServiceDao serviceDao) {
	}
		return args ->{
			*//*
			serviceDao.saveUser(new Users(null, "naruto",
					passwordEncoder().encode("ichiraku"), new ArrayList<>()));
			serviceDao.saveUser(new Users(null, "kakashi",
					passwordEncoder().encode("raikiri"), new ArrayList<>()));

			serviceDao.saveBlog(new Blog(null, "hokage", "naruto is the 7th hokage", null));
			serviceDao.saveBlog(new Blog(null, "chidori", "kakashi invented chidori",null));

			 *//*
			*//*
			serviceDao.saveRole(new Roles(null, "ROLE_USER"));
			serviceDao.saveRole(new Roles(null, "ROLE_ADMIN"));
			*//*

			*//*serviceDao.addRoleToUser("naruto", "ROLE_USER");
			serviceDao.addRoleToUser("naruto", "ROLE_ADMIN");
			serviceDao.addRoleToUser("kakashi", "ROLE_USER");*//*
		};

	}
*/
}
