class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            pq.offer(new int[] {entry.getKey(),entry.getValue()});
            if(pq.size()>k){
            pq.poll();
            }
        }
        
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll()[0];
        }
        return res;
    }
}
