//#1.3: URLify (Java)
//TODO: (Note: If implementing in Java, please a character array so that you can perform this operation in place - didn't do this above) 
public static String urlify(String sentence, int len) {
    String result = "";
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == ' ') {
        result += "%20";
      } else {
        result += sentence.charAt(i);
      }
    }
    return result;
}