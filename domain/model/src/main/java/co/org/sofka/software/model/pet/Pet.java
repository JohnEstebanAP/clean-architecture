package co.org.sofka.software.model.pet;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Pet {
    
    private String id;
    private String name;
    private String breed;


    
}
