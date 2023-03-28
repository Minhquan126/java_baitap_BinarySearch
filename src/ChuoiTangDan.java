import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String document = scanner.nextLine();
        List<Character> stringList = new ArrayList<>();

        for (int i = 0; i < document.length() - 1; i++) {
            List<Character> temp = new ArrayList<>();
            temp.add(document.charAt(i));
            for (int j = i; j < document.length(); j++) {
                if (document.charAt(j) > temp.get(temp.size() - 1) ) {
temp.add(document.charAt(j));
                }
            }
            if(temp.size()> stringList.size()){
                stringList.clear();
                stringList.addAll(temp);
            }
        }
int result = 0;
        for (Character c: stringList) {
            result += 1;
        }
        System.out.println("Do dai mang :" + result);
    }

}
