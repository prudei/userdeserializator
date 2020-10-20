package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.Register;

import java.io.File;
import java.io.IOException;

public class XmlDeserializer implements  UserDeserializer {
    @Override
    public Register deserialize(String fileName) {
        XmlMapper objectMapper = new XmlMapper();
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
