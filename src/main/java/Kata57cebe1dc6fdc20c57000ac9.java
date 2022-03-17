public class Kata57cebe1dc6fdc20c57000ac9 {

    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        for (String word : s.split(" ")) {
            min = Math.min(min, word.length());
        }
        return min;
    }

}
