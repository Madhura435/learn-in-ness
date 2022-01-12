package com.ja.madhura.serialjson;
import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 /XmlMapper xmlMapper = new XmlMapper();
//xmlMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
//
//			JsonNode tree = objectMapper.readTree(jsondata.getBytes());
//			String jsontoXml =xmlMapper.writeValueAsString(tree);
//			//xmlMapper.writeValue(new File(target/nadhura.xml),jsontoXml);
//			System.out.println("please find below json File to xml");
//			 //System.out.println(XML.toString(tree));
			
    	 */
    	
    	try
    	{
        ObjectMapper om=new ObjectMapper();
//        Employee e=new Employee(1,7999,"india","m@gmiail.com","madhu");
//    om.writeValue(new File("target/emp.json"), e);
        String s="{\"id\":7999,\"name\":\"madhu\",\"city\":\"m@gmiail.com\",\"email\":\"india\",\"mobile\":1}";
//    	Employee e=om.readValue(s,Employee.class);
//    	System.out.println(e);
        JsonNode g=om.readTree(s);
        String id=g.get("id").asText();
        String name=g.get("name").asText();
        String city=g.get("city").asText();
        String mobile=g.get("mobile").asText();
        String email=g.get("email").asText();
        om.writeValue(new File("target/empnode.json"),id+" , "+name+
        		" , "+city+" , "+mobile+" , "+email);
    	}
    	catch(Exception e1)
    	{
    		System.out.println(e1);
    	}
    	
    }
}
