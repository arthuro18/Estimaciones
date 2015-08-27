package com.pruebas;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.entidades.tryEntidades;
import com.interfaces.contactDao;

public class pruebaConexion {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:conexion.xml");
		ctx.refresh();
		contactDao cd = ctx.getBean("try", contactDao.class);
		
		List<tryEntidades> lstEntidades = cd.findALL();
		
		for (tryEntidades te : lstEntidades){
			System.out.println("ID" + te.getId());
			System.out.println("NOMBRE" + te.getNombre());
			System.out.println("PASS" + te.getPass());
		}
	}

}
