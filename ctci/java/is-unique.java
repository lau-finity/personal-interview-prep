// #1.1: isUnique (Java)
public static boolean isUnique(String sentence) {
  for (int i = 0; i < sentence.length(); i++) {
    for (int j = i + 1; j < sentence.length(); j++) {
      if (sentence.charAt(i) == sentence.charAt(j)) {
        return false;
      }
    }
  }
  return true;
}