import java.util.HashMap;

public class day2 {
    
    public static void main(String[] args) {
        
        String str = "Anjali";

        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("world"));
        System.out.println(str.replace('a', 'i'));

        String s1 = "java is easy to learn";
        String[] words = s1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }


        //reverse a string
        String s2 = "hello";
        int v = 0;
        int con = 0;
        for(char c: s2.toCharArray())
        {
          if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
          {
              v++;
          }
          else
            {
            con++;
          }
        }
        System.out.println(v);
        System.out.println(con);

        String freq = "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: freq.toCharArray())
        {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);


    }

}