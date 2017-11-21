//#1.2: isPermutated (Java)
public static boolean isPermutated(String s1, String s2) {
  if (s1.length() != s2.length()) {
    return false;
  } else {
    int n1[] = new int[128];
    int n2[] = new int[128];
    for (int i = 0; i < s1.length(); i++) {
      n1[s1.charAt(i)]++;
      n2[s2.charAt(i)]++;
    }
    for (int i = 0; i < 128; i++) {
      if (n1[i] != n2[i]) {
        return false;
      }
    }
    return true;
  }
}