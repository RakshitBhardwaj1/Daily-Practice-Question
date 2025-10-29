// Last updated: 10/29/2025, 12:54:42 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                l.add("FizzBuzz");
            }
            else if(i%3==0){
                l.add("Fizz");
            }
            else if(i%5==0){
                l.add("Buzz");
            }
             
            else{
                l.add(Integer.toString(i));
            }
            
        }
        return l;
    }
}