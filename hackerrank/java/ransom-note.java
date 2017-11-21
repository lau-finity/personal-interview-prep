// Hash Tables: Ransom Note (Java)
Map<String, Integer> magazineMap;
Map<String, Integer> noteMap;
    
public Solution(String magazine, String note) {
    magazineMap = new HashMap <String, Integer>();
    for(String word : magazine.split(" ")) {
        if (magazineMap.containsKey(word)) magazineMap.put(word, magazineMap.get(word) + 1);
        else magazineMap.put(word, 1);
    }
    noteMap = new HashMap <String, Integer>();
    for (String word : note.split(" ")) {
        if (noteMap.containsKey(word)) noteMap.put(word, noteMap.get(word) + 1);
        else noteMap.put(word, 1);
    }
}

public boolean solve() {
    if (noteMap.size() > magazineMap.size()) return false;
    for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
         //System.out.println("NMAP -> Key : " + entry.getKey() + " Value : " + entry.getValue());
         //System.out.println("MMAP -> Key : " + entry.getKey() + " Value : " + magazineMap.get(entry.getKey()));
        if (noteMap.containsKey(entry.getKey()) && magazineMap.containsKey(entry.getKey())) {
            if (entry.getValue() > magazineMap.get(entry.getKey())) return false;
        } 
    }
    return true;
}