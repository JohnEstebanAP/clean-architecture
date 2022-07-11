package co.org.sofka.software.mongo;

import co.org.sofka.software.model.pet.Pet;
import co.org.sofka.software.model.pet.gateways.PetRepository;
import co.org.sofka.software.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Pet, PetDocument, String, MongoDBRepository>
implements PetRepository
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Pet.class));
    }
}
