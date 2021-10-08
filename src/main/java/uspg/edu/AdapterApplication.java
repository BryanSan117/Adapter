package uspg.edu;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.uspg.model.ListaAlumnos;
import edu.uspg.model.Alumno;

@SpringBootApplication
public class AdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdapterApplication.class, args);
		int carnet;
		String nombres;
		String apellidos;
		String correo;
		Scanner scn = new Scanner(System.in);
		ArrayList<Alumno> listaAlumno = new ArrayList();
		Alumno alumno = new Alumno();
		Alumno alumno2 = new Alumno();
		ListaAlumnos listaAlumnos = new ListaAlumnos();

		int opcion = 0;

		do {

			System.out.println(" ");
			System.out.println("\t ---Menú para registrar datos---");
			System.out.println("1. Ingresar datos Alumnos");
			System.out.println("2. XML");
			System.out.println("3. Salir");
			System.out.print("--");
			opcion = scn.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("carnet: ");
				carnet = scn.nextInt();

				System.out.println("nombre: ");
				nombres = scn.next();

				System.out.println("apellido: ");
				apellidos = scn.next();

				System.out.println("correo electronico: ");
				correo = scn.next();

				listaAlumno.add(alumno);
				listaAlumno.add(alumno2);

				listaAlumnos.setIdLista(1);
				listaAlumnos.setListaAlumno(listaAlumno);

				break;

			case 2:

				System.out.println("---XML---");
				// objectToXML(alumno);
				listObjectTOXML(listaAlumnos);
				break;

			}

		} while (opcion != 3);

	}

	public static void listObjectTOXML(ListaAlumnos listaAlumnos) {
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(ListaAlumnos.class);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter sw = new StringWriter();

			jaxbMarshaller.marshal(listaAlumnos, sw);

			String xmlData = sw.toString();

			System.out.println(xmlData);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void objectToXML(Alumno alumno) {

		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(Alumno.class);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter sw = new StringWriter();

			jaxbMarshaller.marshal(alumno, sw);

			String xmlData = sw.toString();

			System.out.println(xmlData);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
