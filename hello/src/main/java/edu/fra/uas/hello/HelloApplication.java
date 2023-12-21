package edu.fra.uas.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {

     @Autowired
    private Notenberechner notenBerechner;
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
       
    }
   

@Override
    public void run(String... args) throws Exception {
        double [] noten = { 1.7, 2.3, 2.0, 3.7, 1.3 };
        double durchschnitt = notenBerechner.berechneDurchschnitt(noten);
        System.out.println("Der Notendurchschnitt ist: " + durchschnitt);
        }
    }
  
    

