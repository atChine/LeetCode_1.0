import java.util.HashSet;

public class LeetCode1456 {
	public int maxVowels(String s, int k) {
		if(s==null || s.length()==0 || s.length()<k){
			return 0;
		}
		int count=0;
		int result=0;
		HashSet<Character> hashSet = new HashSet<>();
		hashSet.add('a');
		hashSet.add('e');
		hashSet.add('i');
		hashSet.add('o');
		hashSet.add('u');
		for(int i=0;i<k;i++){
			char temp=s.charAt(i);
			if(hashSet.contains(temp)){
				count++;
			}
		}
		result=Math.max(result, count);
		for(int i=k;i<s.length();i++){
			char out=s.charAt(i-k);
			if(hashSet.contains(out)){
				count--;
			}
			char in=s.charAt(i);
			if(hashSet.contains(in)){
				count++;
			}
			result=Math.max(result, count);
		}
		return result;
    }
}
