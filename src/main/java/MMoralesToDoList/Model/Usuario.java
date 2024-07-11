/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MMoralesToDoList.Model;


import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Alien 5
 */
public class Usuario {
    
    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date FechaVencimiento;
    private String Password;
    private String UserName;

    public Usuario() {
    }
    
    

    public Usuario(String nombre, String apellido, Date fechaVencimiento, String password, String userName) {
		Nombre = nombre;
		Apellido = apellido;
		FechaVencimiento = fechaVencimiento;
		Password = password;
		UserName = userName;
	}



	public Usuario(String password, String userName) {
		Password = password;
		UserName = userName;
	}



	public Usuario(int IdUsuario, String Nombre, String Apellido, Date FechaVencimiento, String Password, String UserName) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaVencimiento = FechaVencimiento;
        this.Password = Password;
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaNacimiento) {
        this.FechaVencimiento = FechaNacimiento;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    
}
