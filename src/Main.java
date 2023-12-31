public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to my HashMap");

        MyHashMap<String, Integer> myHashMap = new MyHashMap<String, Integer>();

        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println(sentence);
        String[] words = sentence.split("\\s+");

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

        System.out.println("getting paranoid before removal : " + myHashMap.get("paranoid"));
        myHashMap.remove("paranoid");
        System.out.println("getting paranoid after removal : " + myHashMap.get("paranoid"));

        System.out.println("getting avoidable before removal : " + myHashMap.get("avoidable"));
        myHashMap.remove("avoidable");
        System.out.println("getting avoidable after removal: " + myHashMap.get("avoidable"));

    }
}
