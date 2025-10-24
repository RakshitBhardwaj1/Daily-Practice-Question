// Last updated: 10/24/2025, 10:53:49 AM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(2*num)|| (num % 2 == 0 && set.contains(num / 2))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}