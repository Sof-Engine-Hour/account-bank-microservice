package cok.hour.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class Customer {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String firstName ;
    private String lastName ;
    private String email ;

}
