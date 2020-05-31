class Solution {
    public int minSetSize(int[] arr) {
    int osize = arr.length;
    int size = arr.length;
    HashSet<Integer> helper = new HashSet<>();
    TreeMap<Integer, Integer> map = new TreeMap<>();
    for (int num : arr){
        if (map.containsKey(num)){
            map.put(num, map.get(num) +1);
        }
        else map.put(num, 1);
    }
    ArrayList<Integer> holder = new ArrayList<>();
    for (Integer num: map.values()){
        holder.add(num);
    }
    Collections.sort(holder);
    int answer = 0;
    for (int i = 0; i < holder.size(); i++){
        size = size - holder.get(holder.size() - 1 - i);
        answer++;
        if (size <= osize/2) break;
    }
    return answer;
}
}
