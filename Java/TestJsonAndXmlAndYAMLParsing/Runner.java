
import com.fasterxml.jackson.core.JsonProcessingException;


public class Runner {

    public static void main(String[] args) throws JsonProcessingException {
        String jsonString = """
                {
                 	"title" : "Обитаемый остров",
                 	"author" : "Стругацкий А., Стругацкий Б.",
                 	"pages" : 413,
                 	"unknown property" : 42
                }""";
        String xmlString = """
                 <Book>
                  <title>Обитаемый остров</title>
                  <author>Стругацкий А., Стругацкий Б.</author>
                  <pages>413</pages>
                </Book>""";

        String yamlString =  """
           ---
           title: "Обитаемый остров"
           author: "Стругацкий А., Стругацкий Б."
           pages: 413""";

        Book book = new Book("Обитаемый остров", "Стругацкий А., Стругацкий Б.", 413);

        try {
            JsonParser.parseJson(book);
            JsonParser.deparseJson(jsonString);

            XMLParser.parseXML(book);
            XMLParser.deparseXML(xmlString);

            YamlParser.parseYAML(book);
            YamlParser.deparseYAML(yamlString);
        }
        catch (JsonProcessingException e){
            System.out.println("Ошибка в методах обработки данных");
        }
    }
}
