class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        ArrayList<int[]> al = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            al.add(new int[] {entry.getKey(),entry.getValue()});
        }
        al.sort((a,b) -> Integer.compare(b[1],a[1]));
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i]=al.get(i)[0];
        }
        return arr;
    }
}
