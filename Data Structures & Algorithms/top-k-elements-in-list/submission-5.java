class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer>[] al = new ArrayList[nums.length+1];
        for(int i=0;i<al.length;i++){
            al[i] = new ArrayList<Integer>();
        }
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int[] arr = new int[k];
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            al[entry.getValue()].add(entry.getKey());
        }
        int index=0;
        for(int i=al.length-1;i>0;i--){
            for(int n : al[i]){
                arr[index]=n;
                index++;
                if(index==k){
                    return arr;
                }
            }
        }
        return arr;
    }
}
