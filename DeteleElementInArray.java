import java.util.Scanner;

public class DeteleElementInArray {
    public static void main(String[] args) {
        int[] arr = {12,23,56,45,65,34,75,4};
        Scanner sc = new Scanner(System.in);

        System.out.println(" nhập giá trị phần tử cần xóa trong mảng: ");
        int x = sc.nextInt();
        int index =-1;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index==-1){
                System.out.println("giá trị "+ x + " không xuất hiện trong mảng");
        }else {
            System.out.println(" đã xóa phần tử "+x);
            for (int i = index; i < arr.length-1 ; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }
        System.out.println("mảng mới của bạn nhận được là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+"\t");

        }
    }
        }



