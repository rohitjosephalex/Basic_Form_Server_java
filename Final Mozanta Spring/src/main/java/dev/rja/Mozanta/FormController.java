package dev.rja.Mozanta;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/forms")
public class FormController {
    @Autowired
    private FormService formService;
    @GetMapping
    public ResponseEntity<List<Form>> getAllForm(){
//        System.out.println("###HELLO");
        return new ResponseEntity<List<Form>>(formService.allUser(), HttpStatus.OK);

    }
    @Autowired
    private SequenceGenerator sequenceGenerator;

    @PostMapping("/new-user")
    public ResponseEntity<Form> createUser(@Valid @RequestBody  Form form){
        String admNo=sequenceGenerator.create_admNo();

        String Name= form.getName();
        Date DOB=form.getDOB();
        String className= form.getClassName();
        String Division= form.getDivision();
        String Gender= form.getGender();

        return new ResponseEntity<Form>(formService.createNewUser(admNo,Name,DOB,className,Division,Gender), HttpStatus.CREATED);

    }
}
