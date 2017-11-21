//Strings: Making Anagrams (Java)
public static int numberNeeded(String first, String second) {
    int f[] = new int[26];
    int s[] = new int[26];
    for (int i = 0; i < first.length(); i++) f[first.charAt(i) - 97]++;
    for (int j = 0; j < second.length(); j++) s[second.charAt(j) - 97]++;
    int deletions = 0;
    for (int i = 0; i < 26; i++) {
        if (f[i] == 0 && s[i] == 0) {
            continue;
        } else if (f[i] == 0) { // 0, 2
            deletions += s[i];
        } else if (s[i] == 0) { // 2, 0
            deletions += f[i];
        } else { // 1, 2
            if (s[i] > f[i]) {
                deletions = (s[i] - f[i]) + deletions;
            } else {
                deletions = (f[i] - s[i]) + deletions;
            }
        }
    }
    return deletions;
}