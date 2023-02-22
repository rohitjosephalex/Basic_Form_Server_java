package dev.rja.Mozanta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;

    public List<Form> allUser(){
        return formRepository.findAll();
    }

    public Form createNewUser(String admNo, String Name, Date DOB, String className, String Division, String Gender){
        Form form=new Form(admNo,Name,DOB,className,Division,Gender);
        System.out.println(form);
        formRepository.insert(form);
        return form;


    }

}
