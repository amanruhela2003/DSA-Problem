package College.Recursion.Recursion;

import java.util.HashMap;

public class CountFreqHashMap {
    static int count;
    static char ch;
    static HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();


    // static HashMap<Character,Integer> ShowHashMap(HashMap<Character,Integer> hashMap,int )
     

    static HashMap<Character,Integer> stringTraverse(int index,HashMap<Character,Integer> hashMap,String str)
    {
        if(index==str.length())
        {
            return hashMap;
        }
        ch=str.charAt(index);
        if(hashMap.containsKey(ch))
        {
            count=hashMap.get(ch);
            count++;
            hashMap.replace(ch,count);

        }
        else {
            hashMap.put(ch, 1);
        }

        stringTraverse(index+1, hashMap, str);
        return hashMap;
    }


    public static void main(String[] args) {
        String string="THODA HARD THE YAAR YE!!!!!";
        
     HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
     hashMap=stringTraverse(0, hashMap, string.trim());
     System.out.println(hashMap);



    }
    
}
