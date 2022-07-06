package domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.Array;
import org.hibernate.mapping.Collection;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Appuser {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id ;
    private String name;
    private String userName;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Role> roles ;

}
