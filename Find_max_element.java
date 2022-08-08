import java.util.Scanner;

public class Find_max_element {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập độ dài mảng: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println(" kích thước không quá 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println(" nhập giá trị thứ " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println(" danh sách mảng: ");
        for ( int j = 0; j<array.length; j++){
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("\n"+" giá trị lớn nhất trong danh sách là: "+max+" , tại vị trí: "+index);
    }
}
