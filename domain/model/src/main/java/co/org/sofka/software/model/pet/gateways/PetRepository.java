package co.org.sofka.software.model.pet.gateways;

import co.org.sofka.software.model.pet.Pet;
import reactor.core.publisher.Mono;

public interface PetRepository {

    //save
    public Mono<Pet> save(Pet pet);

}
