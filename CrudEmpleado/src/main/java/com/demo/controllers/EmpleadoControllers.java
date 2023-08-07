package com.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpEntity;


@RestController
@RequestMapping("api")

/**
 *
 * @author Jhon Rendon
 */
public class EmpleadoControllers {

 //@Autowired
 private RestTemplate restTemplate;
 private String API = "http://localhost:8080/spia-test/aguadulce";


@GetMapping("/employees")
public String getEmpleados(){
     String uri = this.API+"/employees";
     RestTemplate restTemplate = new RestTemplate();
     String result = restTemplate.getForObject(uri,String.class);
     return result;
}

@GetMapping({"/employee/{id}"})
public String getEmpleados( @PathVariable("id") String id){
     String uri = this.API+"/employee/"+id;
     RestTemplate restTemplate = new RestTemplate();
     String result = restTemplate.getForObject(uri,String.class);
     return result;
}

@DeleteMapping("/employee/{id}")
public String deleteEmpleado( @PathVariable("id") String id){
     String uri = this.API+"/employee/"+id;
     HttpHeaders headers = new HttpHeaders();
     RestTemplate restTemplate = new RestTemplate();
     
     restTemplate.delete(uri,id);
     return "{ \"result\": \"True\" }";
     
}


@PutMapping("employee/{id}")
public String crearEmpleado( @PathVariable("id") String id, @RequestBody String dataEmpleado){
     String uri = this.API+"/employee/"+id;
     HttpHeaders headers = new HttpHeaders();
     headers.setContentType(MediaType.APPLICATION_JSON);
     RestTemplate restTemplate = new RestTemplate();
     restTemplate.put(uri,new HttpEntity<>(dataEmpleado, headers),String.class);
     return "{ \"result\": \"True\" }";
}


@PostMapping("employee")
public String crearEmpleado( @RequestBody String dataEmpleado){
     String uri = this.API+"/employee";
     HttpHeaders headers = new HttpHeaders();
     headers.setContentType(MediaType.APPLICATION_JSON);
     RestTemplate restTemplate = new RestTemplate();
     String result = restTemplate.postForObject(uri,new HttpEntity<>(dataEmpleado, headers),String.class);
     return result;
}

}
