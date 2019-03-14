package com.etc.hibernate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	FileReader fr = new FileReader("C:\\Users\\Vipin Mittal\\Desktop\\Maven\\hibernate\\src\\main\\java\\com\\etc\\hibernate\\file1");
    	BufferedReader br = new BufferedReader(fr);
    	String str = null;
    	Session session = null;
    	while((str=br.readLine())!=null) {
    		String[] str1 = str.split(",");
    		
    		Alien alien2 = new Alien();
        	alien2.setAid(str1[0]);
        	alien2.setAname(str1[1]);
        	alien2.setAvalue(str1[2]);
    	
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(alien2);
        tx.commit();
    }
    	
    	Query query = session.createQuery("from Alien");
    	
    	List<Alien> list =  query.list();
    	for(Alien x : list) {
    		System.out.println(x);
    	}
      
        br.close();
         
    	
}
}
