package October.Ex_03102024;

public class Lab059 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int result=duplicates(arr);
        System.out.println("The duplicate element is "+result);
    }
    static int duplicates(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
