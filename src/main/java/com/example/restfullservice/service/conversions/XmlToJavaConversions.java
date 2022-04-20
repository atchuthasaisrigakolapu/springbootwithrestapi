package com.example.restfullservice.service.conversions;

import com.example.restfullservice.model.Student;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Service
public class XmlToJavaConversions {
    
    public void unMarshling() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Object unmarshal = unmarshaller.unmarshal(new File("student.xml"));
        Student student = (Student) unmarshal;
        System.out.println(student);

    }
    
}
