package JavaWithDSA.Searching;

public class RationalNumberSearch {
    public static void main(String [] args){
        float [] a = {1/5,2/3,3/4,4/5,5/6,7/8};
        float target = 7/8;
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(a[mid] == target){
                System.out.println("Rational Number found at index: " + mid);
                return;
            }
            else if(a[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("Rational Number not found");
    }
}
