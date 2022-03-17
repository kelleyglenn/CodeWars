import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Accumul {

    public static String accum(String s) {
        // Convert to array
        char[] chars = s.toUpperCase().toCharArray();

        // For each character, output a word that contains that character times the index+1
        // Make the first letter of each word upper case, the rest are lower case
        Stream<String> words = IntStream.range(0, chars.length).mapToObj(
            i -> chars[i] + String.valueOf(chars[i]).toLowerCase().repeat(i));

        // concatenate each word with '-'
        return words.collect(Collectors.joining("-"));
    }
}