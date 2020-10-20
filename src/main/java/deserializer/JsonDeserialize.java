package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import model.Register;

import java.io.File;
import java.io.IOException;

public class JsonDeserialize implements UserDeserializer {
    @Override
    public Register deserialize(String fileName) {

            ObjectMapper objectMapper = new ObjectMapper();
            ObjectReader objectReader = objectMapper.readerFor(Register.class);
            Register register = null;
            try {
                register = objectReader.readValue(new File(fileName), Register.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return register;
        }
    }

