class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true;
        if((num/10)*10 == num){
            System.out.println((num/10)*10);
            return false;
        }
        return true;
        
    }
}