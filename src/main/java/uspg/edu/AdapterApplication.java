package uspg.edu;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.model.alumno;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);
		
		alumno alumno = new alumno(1,"Antonio","Tejeda","antonioteje125@gmail.com");
		objectToXML(alumno);
		
	}
	
	public static void objectToXML(alumno alumno) {
		
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(alumno.class);
			
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			StringWriter sw = new StringWriter();
			
			jaxbMarshaller.marshal(alumno, sw);

			String xmlData = sw.toString();
			
			System.out.println(xmlData);
			
			
		} catch(Exception e) {
			 
		e.printStackTrace();	
			
		}
		
	}

}
