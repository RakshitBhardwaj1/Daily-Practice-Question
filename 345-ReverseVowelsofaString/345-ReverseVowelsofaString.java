// Last updated: 7/10/2026, 5:04:33 PM
1class Solution {
2    public String reverseVowels(String s) {
3        int n=s.length();
4        char[] arr=s.toCharArray();
5        int i=0;
6        int j=n-1;
7        while(i<j){
8            if(arr[i]!='a'&& arr[i]!= 'e'&& arr[i]!='i'&& arr[i]!='o' && arr[i]!='u' && arr[i]!='A'&& arr[i]!= 'E'&& arr[i]!='I'&& arr[i]!='O'&& arr[i]!='U'){
9                i++;
10            }
11            else if(arr[j]!='a'&& arr[j]!= 'e'&& arr[j]!='i'&& arr[j]!='o'&& arr[j]!='u'&& arr[j]!='A'&& arr[j]!= 'E'&& arr[j]!='I'&& arr[j]!='O' && arr[j]!='U'){
12                j--;
13            }
14            else{
15
16            
17            char ch=arr[i];
18            arr[i]=arr[j];
19            arr[j]=ch;
20
21            i++;
22            j--;
23            }
24        }
25        return new String(arr);
26    }
27}