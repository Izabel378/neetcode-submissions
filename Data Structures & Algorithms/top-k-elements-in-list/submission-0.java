class Solution {
    public int[] topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] arr = new int[k];
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        ArrayList<int[]> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            al.add(new int[] {e.getValue(),e.getKey()});
        }
        al.sort((a,b) -> Integer.compare(b[0],a[0]));
        for(int i=0;i<k;i++){
            arr[i]=al.get(i)[1];
        }
        return arr;
    }
}
