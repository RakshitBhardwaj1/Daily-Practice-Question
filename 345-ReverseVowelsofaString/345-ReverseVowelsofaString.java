// Last updated: 7/10/2026, 5:03:25 PM
1class Solution {
2    public String reverseVowels(String s) {
3        int n = s.length();
4        char[] arr = s.toCharArray();
5
6        int i = 0;
7        int j = n - 1;
8
9        while (i < j) {
10
11            if (arr[i] != 'a' && arr[i] != 'e' &&
12                arr[i] != 'i' && arr[i] != 'o' &&
13                arr[i] != 'u' && arr[i] != 'A' &&
14                arr[i] != 'E' && arr[i] != 'I' &&
15                arr[i] != 'O' && arr[i] != 'U') {
16
17                i++;
18            }
19            else if (arr[j] != 'a' && arr[j] != 'e' &&
20                     arr[j] != 'i' && arr[j] != 'o' &&
21                     arr[j] != 'u' && arr[j] != 'A' &&
22                     arr[j] != 'E' && arr[j] != 'I' &&
23                     arr[j] != 'O' && arr[j] != 'U') {
24
25                j--;
26            }
27            else {
28                char ch = arr[i];
29                arr[i] = arr[j];
30                arr[j] = ch;
31
32                i++;
33                j--;
34            }
35        }
36
37        return new String(arr);
38    }
39}