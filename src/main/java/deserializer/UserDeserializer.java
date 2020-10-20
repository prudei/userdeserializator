package deserializer;

import model.Register;

public interface UserDeserializer {

    Register deserialize (String fileName);
}
