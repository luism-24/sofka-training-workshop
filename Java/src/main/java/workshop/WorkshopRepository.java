package workshop;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkshopRepository extends MongoRepository<Workshop, String> {
}
