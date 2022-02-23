class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map =new HashMap<>();
        
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        ArrayList<String> s =new ArrayList<>();
        int sum=Integer.MAX_VALUE;
        
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int a=i+map.get(list2[i]);
                if(a<=sum){
                    if(a!=sum){
                        s.clear();
                    }
                    sum=a;
                    s.add(list2[i]);
                }
            }
        }
        
        String[] st =new String[s.size()];
        for(int i=0;i<s.size();i++){
            st[i]=s.get(i);
        }
        return st;
        
    }
}