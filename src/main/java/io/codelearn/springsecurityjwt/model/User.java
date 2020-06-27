package io.codelearn.springsecurityjwt.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Entity
public class User implements Serializable {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String password;


}
