package com.example.restfullservice.service.conversions;

import com.example.restfullservice.model.Student;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

@Service
public class JavaToXmlConversion { //Marshing

    public void marshing() throws JAXBException {

        Student student = new Student();
        student.setId(101);
        student.setName("sai");
        student.setRank(3);
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(student,System.out);
        marshaller.marshal(student,new File("student.xml"));
    }


}
