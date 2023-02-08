import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLParser {
    public static void parseXML(Book book) throws JsonProcessingException {
        ObjectMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xmlBook = mapper.writeValueAsString(book);
        System.out.println(xmlBook);
    }

    public static void deparseXML(String xmlString) throws JsonProcessingException {
        ObjectMapper mapper = new XmlMapper();
        Book book = mapper.readValue(xmlString, Book.class);
        System.out.println(book);
    }
}
