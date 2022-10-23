import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class YamlParser {
    public static void parseYAML(Book book) throws JsonProcessingException {
        ObjectMapper mapper = new YAMLMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String yamlBook = mapper.writeValueAsString(book);
        System.out.println(yamlBook);
    }
    public static void deparseYAML(String yamlString) throws JsonProcessingException {
        ObjectMapper mapper = new YAMLMapper();
        Book book = mapper.readValue(yamlString, Book.class);
        System.out.println(book);
    }
}
