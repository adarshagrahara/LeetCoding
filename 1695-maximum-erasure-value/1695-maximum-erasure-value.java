class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> fre = new HashMap();
        int start = 0;
        int i = 0;
        boolean moveEnd = true;
        int bestScore = 0;
        int currentScore=0;
        while(i<n){
            if(moveEnd){
                int ev = nums[i];
                fre.put(ev, fre.getOrDefault(ev, 0)+1);
                currentScore += ev;
            }
            if(fre.keySet().size() == i-start+1){
                i++;
                moveEnd = true;
                bestScore = Math.max(bestScore, currentScore);
            }else if(fre.keySet().size() < i-start+1){
                int sv = nums[start++];
                fre.put(sv,fre.get(sv)-1);
                int scnt = fre.get(sv);
                if(scnt==0){
                    fre.remove(sv);
                }
                currentScore-=sv;
                moveEnd=false;
            }
        }
        return bestScore;
    }
}