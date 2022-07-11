package co.org.sofka.software.api;

import co.org.sofka.software.model.pet.Pet;
import co.org.sofka.software.usecase.createpet.CreatePetUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {
    private final CreatePetUseCase petUseCAse;

    public Mono<ServerResponse> POSTPetUseCase(ServerRequest serverRequest) {

        return  serverRequest.bodyToMono(Pet.class)
                .flatMap(pet -> petUseCAse.savePet(pet))
                .flatMap(pet -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromValue(pet), Pet.class));
    }
}
