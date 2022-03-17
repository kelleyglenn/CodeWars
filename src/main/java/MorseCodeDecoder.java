public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
        StringBuilder builder = new StringBuilder();
        // replace 3-spaces by " ' "
        // split morseCode into morse character (separated by space)
        // for each morse character, if it is "'", output space, else output MorseCode.get(code)
        for (String code : morseCode.trim().replace("   ", " ' ").split(" ")) {
            builder.append(code.trim().equals("'") ? ' ' : MorseCode.get(code.trim()));
        }
        return builder.toString();
    }

    public static class MorseCode {

        public static String get(String code) {
            return "";
        }
    }
}


