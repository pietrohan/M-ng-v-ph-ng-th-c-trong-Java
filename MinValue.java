public class MinValue {
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr= {23,24,45,34,65,36,46};
        int index = minValue(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là: "+arr[index]);
    }
}
