import static java.lang.Math.floor;
class Solution {
    public boolean isPerfectSquare(int num) {
        if(floor(Math.sqrt((double)num)) == Math.sqrt((double)num)){
                  return true;
            } else{
                  return false;
            }
    }
}