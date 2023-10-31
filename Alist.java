public class Alist {
    public static void main(String[] args) {
        int [] Arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        // Output the value of the tenth element of the array numArray.
        System.out.println(Arr[10]);
        // Set the value of the fifth element of the array numArray to 35.
        Arr[5]=35;
        System.out.println(Arr[5]);
       // Set the value of the ninth element of the array numArray to the sum of the sixth and thirteenth elements of the array numArray.
        Arr[9]=Arr[6]+Arr[13];
        System.out.println(Arr[9]);
    }
}
