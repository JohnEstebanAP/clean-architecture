package co.org.sofka.software.mongo.config;

import lombok.Builder;
import lombok.Getter;
@Builder
@Getter
public class MongoDBSecret {
    private final String uri;
    //asign event
}
