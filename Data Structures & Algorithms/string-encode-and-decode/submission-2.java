class Solution {
    StringBuilder sb = new StringBuilder();
    public String encode(List<String> strs) {
        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> al = new ArrayList<String>();
        for(int i=0;i<str.length();){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i=j+1;
            al.add(str.substring(i,i+length));
            i=i+length;
        }
        return al;
    }
}
