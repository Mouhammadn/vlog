package com.fst.srt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fst.srt.entities.Client;

@SpringBootApplication
public class DemoApplication {
	public static List<Client> clients=new ArrayList<>();
	public static void main(String[] args) {
		
	
		SpringApplication.run(DemoApplication.class, args);
	}

}
