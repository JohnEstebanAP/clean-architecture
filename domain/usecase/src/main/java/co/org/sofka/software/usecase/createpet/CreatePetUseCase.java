package co.org.sofka.software.usecase.createpet;

import co.org.sofka.software.model.pet.Pet;
import co.org.sofka.software.model.pet.gateways.PetRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreatePetUseCase  {

    private final PetRepository repository;

    public Mono<Pet> savePet(Pet pet){

        return repository.save(pet);
    }

}
