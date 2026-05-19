import java.util.HashMap;
public class PracticeProblem {


	public static void main(String args[]) {

	}
	public static HashMap<String,Integer> combineParallelArrays(String[]word,int[]num){
HashMap<String,Integer> map=new HashMap<String,Integer>();
for(int i=0;i<word.length;i++){
map.put(word[i],num[i]);
}
return map;
}
public static HashMap<String, Integer> increaseAge(HashMap<String, Integer> map, String name) {
    int age = map.get(name);
    map.put(name, age + 1);
    return map;
}
public static HashMap<String,Integer>replaceName(HashMap<String,Integer>map,String name,String name2){
int num=map.get(name);
map.remove(name);
map.put(name2,num);
return map;
}

}

