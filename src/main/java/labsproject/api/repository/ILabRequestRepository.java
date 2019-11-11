package labsproject.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import labsproject.api.entity.LabRequest;

public interface ILabRequestRepository extends MongoRepository<LabRequest, String>{

}
