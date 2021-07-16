package com.example.demo;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealth implements HealthIndicator {

	@Override
	public Health health() {
		
		return checkNet()==true?Health.up().withDetail("Internet Up", "Active Connection").build():
		Health.down().withDetail("Internet Down", "Inactive Connection").build();
	}
	public boolean checkNet() {
		try {
		URL url= new URL("https://www.google.com");
		URLConnection connection=url.openConnection();
		connection.connect();
		return true;
	}
		catch (Exception e) {
			e.printStackTrace();
			return false;
			
		}
			// TODO: handle exception
		}

}
