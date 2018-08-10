package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import model.Person;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Gson gson=new Gson();
       
    public MyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDate localDate=LocalDate.of(2018, 8, 2);
		Person person=new Person("TOTO", "Luc", localDate);
		
		//Convertit l'objet person en objet json et renvoie une chaine de ccaractères
		String personJsonString=this.gson.toJson(person);
		
		PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        out.print(personJsonString);
        out.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
