//#1.6: String Compression (Java)
public static String compression(String str) {
  String result = "";
  int repeats = 1;
  StringBuilder sb = new StringBuilder();
  if (str.length() == 0) return "";
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == str.charAt(i + 1)) repeats++;
    else {
      sb.append(str.charAt(i));
      sb.append(repeats);
      repeats = 1;
    }
    if (i + 1 == str.length() - 1) {
        sb.append(str.charAt(i));
        sb.append(repeats);
        repeats = 1;
        break;
      }
  }
  result = sb.toString();
  return result;
}