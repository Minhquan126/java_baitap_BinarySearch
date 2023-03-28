import java.util.*;

public class BinarySearch implements Comparator<Integer> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Nhap so phan tu cua mang");
        int numb = scanner.nextInt();
        System.out.println("Nhap phan tu");
        for (int i = 0; i < numb; i++) {
            integerList.add(scanner.nextInt());
        }
        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.println(binarySearch(integerList,0,integerList.size() - 1,5));
    }

public static int binarySearch(List<Integer> list,int left, int right,int value){
        while (left <= right) {
            int middle = (left + right) / 2;
            if (list.get(middle) == value){
                return middle;
            } else if (list.get(middle) < value) {
              return   binarySearch(list,middle + 1,right,value);
            } else {
               return binarySearch(list,left,middle -1,value);
            }
        }
    return -1;

}
;

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
