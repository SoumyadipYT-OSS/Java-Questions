package Important_Questions_in_java.Assignment7;

/* Find the largest and smallest word in a string */
@SuppressWarnings("ALL")
public class q5 {
    protected static void FindLargestAndSmallestWord(String str) {
        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;
        str = str + " ";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) != ' ')
                word = word + str.charAt(i);
            else {
                words[length] = word;
                length++;
                word = "";
            }
        }

        small = large = words[0];

        for (int k=0; k<length; k++) {
            if (small.length() > words[k].length())
                small = words[k];
            if (large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: "+small);
        System.out.println("Largest word: "+large);
    }

    public static void main(String[] args) {
        String s = "We are using java programming language";
        s = s.toLowerCase();
        FindLargestAndSmallestWord(s);
    }
}