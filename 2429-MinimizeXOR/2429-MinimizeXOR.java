// Last updated: 1/21/2026, 12:36:24 PM
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int set_bit=0;
4        while(num2>0){
5            num2=(num2&(num2-1));
6            set_bit++;
7        }
8        int x=0;
9        for(int i=30;i>=0;i--){
10            int mask=(1<<i);
11            if((num1&mask)!=0){
12                x|=mask;//x=x|mask
13                set_bit--;
14                if(set_bit==0){
15                    return x;
16                }
17            }
18        }
19        for(int i=0;i<=30;i++){
20            int mask=(1<<i);
21            if((num1&mask)==0){
22                x|=mask;//x=x|mask
23                set_bit--;
24                if(set_bit==0){
25                    return x;
26                }
27            }
28        }
29        return x;
30    }
31}