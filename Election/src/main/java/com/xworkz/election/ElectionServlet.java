package com.xworkz.election;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.service.ElectionService;
import com.xworkz.election.service.ElectionServiceImpl;




public class ElectionServlet extends HttpServlet{
	
	
	private ElectionService service = new ElectionServiceImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.setParameter("name");
	String phoneNumber = request.setParameter("phoneNumber");
	String age = request.setParameter("age");
	String address = request.setParameter("address");
	String pincode = request.setParameter("pincode");
	
	ElectionDto dto = new ElectionDto(name, phoneNumber, age, address, pincode);
	
	boolean status = service.save(dto);
	
	
	if(status) {
		request.getRequestDispatcher("/Read.jsp").forward(request, response);
	}
	else {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("Data not valid so not saved");
		request.getRequestDispatcher("/ElectionForm.jsp").include(request, response);
	}
	
	
		
	}
	
	

}
