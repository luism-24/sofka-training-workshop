package workshop;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workshop")
public class Workshop {
    @Id
    private ObjectId id;
    private String message;

    public Workshop(ObjectId id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
