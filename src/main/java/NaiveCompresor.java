import java.util.Arrays;
import java.util.stream.Collectors;

public class NaiveCompresor implements Compresor {


    @Override
    public String compress(String input) {
        if (input == null || input.isEmpty()){
            return "";


        }

      return Arrays.stream(input.split(" "))
              .map(word -> word.length() > 0 ? word.substring(0,1).toUpperCase()
                      + word.substring(1).toLowerCase() : word)
              //.map(word -> word.toLowerCase())
              .collect(Collectors.joining(""));

      // <warunek> ? jeżeli prawda wyonaj to : w innym przypadku to


    }
    @Override
    public String uncompress(String input) {
        return Arrays.stream(input.split("(?=\\p{Lu})"))
                .map(String::toLowerCase)
                .collect(Collectors.joining(" "));


    }
}
