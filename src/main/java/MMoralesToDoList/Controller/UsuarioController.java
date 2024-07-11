/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MMoralesToDoList.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import MMoralesToDoList.JPA.Result;
import MMoralesToDoList.Model.Usuario;

/**
 *
 * @author Alien 5
 */
@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping()
	public String Vista() {
		return "Login";
	}

	@PostMapping("/login")
	@ResponseBody
	public Result Login(@RequestBody Usuario usuario) {
		Result result = new Result();
//		Usuario usuario=new Usuario("1234", "Lol");
		RestTemplate restTemplate = new RestTemplate();
//		HttpHeaders header=new HttpHeaders();		
		HttpEntity<Usuario> entity = new HttpEntity<Usuario>(usuario);
		String endpoint = "http://localhost:8080/api/login";
		ResponseEntity<Result> response = restTemplate.exchange(endpoint, HttpMethod.POST, entity, Result.class);
		result = response.getBody();
		return result;
	}

	@PostMapping("/addUsuario")
	@ResponseBody
	public Result AddUsuario() {
		Date fecha = new Date("2024/10/17");
		Usuario usuario = new Usuario("David", "Morales", fecha, "1234", "RevanCruz");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Usuario> entity = new HttpEntity<Usuario>(usuario);
		String endpoint = "http://localhost:8080/api/addUsuario";
		ResponseEntity<Result> response = restTemplate.exchange(endpoint, HttpMethod.POST, entity, Result.class);
		Result result = response.getBody();
		return result;

	}

	@GetMapping("/getAll")
	@ResponseBody
	public Result GetAll() {
		Usuario usuario = new Usuario();
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Usuario> entity = new HttpEntity<Usuario>(usuario);
		String endpoint = "http://localhost:8080/api/getAll";
		ResponseEntity<Result> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, Result.class);
		Result result = response.getBody();
		return result;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public Result Delete() {
		Usuario usuario=new Usuario();
		RestTemplate restTemplate=new RestTemplate();
		HttpEntity<Usuario> entity=new HttpEntity<Usuario>(usuario);
		String endpoint = "http://localhost:8080/api/delete?IdUsuario=24";
		ResponseEntity<Result> response = restTemplate.exchange(endpoint, HttpMethod.POST,entity,Result.class);
		Result result=response.getBody();
		return result;
	}
	@PostMapping("/update")
	@ResponseBody
	public Result Update() {
		Date fecha = new Date("2024/10/17");
		Usuario usuario =new Usuario(4, "David", "Morales",fecha, "1234", "Revan");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Usuario> entity= new HttpEntity<Usuario>(usuario);
		String endpoint="http://localhost:8080/api/update";
		ResponseEntity<Result> response= restTemplate.exchange(endpoint, HttpMethod.POST,entity,Result.class);
		Result result=response.getBody();
		return result;
	}

}
