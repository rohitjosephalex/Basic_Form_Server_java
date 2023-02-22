package dev.rja.Mozanta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;


@Document(collection = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Form {

    @Transient
    public static final String SEQUENCE_NAME="user_sequence";

//    private ObjectId _id;
    @Id
    private String admNo;

    @NotNull
    private  String Name;
    @DateTimeFormat(pattern = "dd-mm-yyyy")
    private Date DOB;
    @NotBlank
    private String className;
    @NotBlank
    private  String Division;
    @NotBlank
    private  String Gender;

    public Form(String name, Date DOB, String className, String division, String gender) {
        Name = name;
        this.DOB = DOB;
        this.className = className;
        Division = division;
        Gender = gender;
    }
}
