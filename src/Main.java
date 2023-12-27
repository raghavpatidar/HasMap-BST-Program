public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to my HashMap");

        MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();

        String sentence = "To be or not to be";
        System.out.println(sentence);
        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {

            if (myHashMap.get(word) == null) {
                myHashMap.put(word, 1);
            } else {
                myHashMap.put(word, myHashMap.get(word) + 1);
            }
        }
        System.out.println("Frequency of each words are ");
        for (String word : words) {
            System.out.println(word + " --> : " + myHashMap.get(word));
        }

    }
}
