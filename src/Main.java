
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9};
        int result = findMaximum(arr);
        System.out.println("Maximum element: " + result);
    }
    public static int findMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i=0;i< arr.length;i++){
            if (arr[i] > max){
                max= arr[i];
            }
        }


        return max;
    }
}