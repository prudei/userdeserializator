package deserializer;

import model.Register;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonDeserializeTest {

    @Test
    void deserializeJson() {
        JsonDeserialize jsonDeserializer = new JsonDeserialize();
        Register deserialize = jsonDeserializer.deserialize("/Users/pavelprudej/IdeaProjects/hw3/users.json");
        Assertions.assertNotNull(deserialize);
    }

    @Test
    void deserializeXml() {
        XmlDeserializer xmlDeserializer = new XmlDeserializer();
        Register deserialize = xmlDeserializer.deserialize("/Users/pavelprudej/IdeaProjects/hw3/users.xml");
        System.out.println(deserialize);
        Assertions.assertNotNull(deserialize);
    }
}