package com.ecommerce.microcommerce.JSON;

import java.io.File;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author new
 *
 */
public class JSONCommentClass {
	
	
	
	// 1- add this dependecy in pom.xml
	
//	<dependency>
//	<groupId>com.fasterxml.jackson.core</groupId>
//	<artifactId>jackson-databind</artifactId>
//	<version>2.11.1</version>
//	</dependency>

	
	
	
	// 2- i have this class for example
//	
//	public class Car {
//
//		private String color;
//		private String type;
//
//		// standard getters setters
//	
	
	
	
	// 3- Java Object to JSON
	
//	
//	ObjectMapper objectMapper = new ObjectMapper();
//	Car car = new Car("yellow", "renault");
//	objectMapper.writeValue(new File("target/car.json"), car);
	

	
	//Result : must result like it:
	
	
	// {"color":"yellow","type":"renault"}
	
	
	
	
	
	// 4- JSON to Java Object
	
	
//	String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
//	Car car = objectMapper.readValue(json, Car.class);
	
	
	
	///////////// Other Example /////////////

	// create Object Mapper
	//ObjectMapper mapper = new ObjectMapper();
	
	// read JSON file and map/convert to java POJO
	//Person personn = mapper.readValue(new File("src/main/resources/data.json"), Person.class);
	
	
	
	
	
	//@Embedded in Model class 
	
	
	
	
	
///////////// Main class SafetyNetAlert /////////////
	
	//person save = repo.save(person);
	
	
			//log.info(" Person info " + save.toString());

			//Data data = mapper.readValue(filePath, Data.class);
			//Data save = repo.save(data);
			
			
			
			//System.out.println(" Test run method ");
			
			//log.info(" log ");
			
			
	
	
	
	        // create Object Mapper
			//ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map/convert to java POJO
			//Person personn = mapper.readValue(new File("src/main/resources/data.json"), Person.class);
			
			
	
	
///////////// Person Controller  /////////////
	
	
//
//	@GetMapping(value="/listPersons/{firstName}")
//	public Person getPersonByName(@PathVariable String firstName) {
//		
//		return personService.findByName(firstName);
//	}
//	
//	
//	
//	
//	@PostMapping("/listPersons")
//	public Person createPerson(Person person) {
//		
//		return person;
//		
//	}
//	
//	
//	@PutMapping("/listPersons/{firstName}")
//	public ResponseEntity<Person> update(@RequestBody Person person, @PathVariable String firstName) {
//	    Person updatedPerson = personService.update(firstName, person);
//	    if (updatedPerson == null) {
//	        return ResponseEntity.notFound().build();
//	    } else {
//	        return ResponseEntity.ok(updatedPerson);
//	    }
//	}
//	
//	
//	
//	@DeleteMapping("/listPersons/{firstName}")
//	public ResponseEntity<Person> deletePerson(@PathVariable String firstName) {
//	    personService.delete(firstName);
//	    return ResponseEntity.noContent().build();
//	}

	
}
