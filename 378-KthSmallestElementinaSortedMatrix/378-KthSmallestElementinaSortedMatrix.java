// Last updated: 10/26/2025, 7:56:19 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                l.add(matrix[i][j]);
            }
        }
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        Arrays.sort(arr);
        return arr[k - 1];
    }
}