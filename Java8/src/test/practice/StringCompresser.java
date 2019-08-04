package test.practice;

import java.util.HashMap;
import java.util.Map;

public class StringCompresser {

			public static void main(String[] args) {
				
				String str="aabbddvvvv";
				
				char[] c=str.toCharArray();
				
				Map<Character,Integer> hm=new HashMap<Character,Integer>();
			    for(char ch1:c)
			    {

			        if(hm.containsKey(ch1))
			        {
			            hm.put(ch1,hm.get(ch1)+1);
			        }
			        else
			        {
			            hm.put(ch1,1);
			        }
			    }
				
				for(Map.Entry<Character, Integer> en:hm.entrySet())
				{
					System.out.println(en.getKey()+" ----> "+en.getValue());
				}
				
	
			}
}
