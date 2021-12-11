package hashtable;

import org.junit.Assert;
import org.junit.Test;

public class HashTableTest {

    @Test
    public void givenSentence_WhenStringIsGiven_ShouldReturnWordFrequency() {
        String sentence = "To to be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        MyHashMap<String, Integer> hashMap = new MyHashMap();
        for (String word : words) {
            Integer value = hashMap.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMap.add(word, value);
        }
        Integer frequency = hashMap.get("to");
        Integer expectedValue=3;
        Assert.assertEquals(expectedValue, frequency);
    }

    @Test
    public void givenSentence_WhenLargeParaIsGiven_ShouldReturnWordFrequency() {

        String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = sentence.toLowerCase().split(" ");
        HashMapParanoid hashMapParanoid=  new HashMapParanoid<>();
        for (String word : words) {
            Integer value = (Integer) hashMapParanoid.get(word);
            if (value == null) {
                value = 1;
            } else {
                value += 1;
            }
            hashMapParanoid.add(word, value);
        }
        Integer frequency = (Integer) hashMapParanoid.get("paranoid");
        Integer expectedValue=3;
        Assert.assertEquals(expectedValue, frequency);


    }
}



