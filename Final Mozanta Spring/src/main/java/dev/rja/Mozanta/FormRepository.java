package dev.rja.Mozanta;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FormRepository extends MongoRepository<Form, Integer> {
}
