import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Sayable sayable = new Sayable(){
            @Override
            //Hàm vô danh
            public String say() {
                // TODO Auto-generated method stub
                return "Hello";
            }
        };
        System.out.println(sayable.say());
    
    //Sử dụng lambda
    Sayable sayableUsingLambda = () -> {
        return "Hello Lambda!!";
    
    };
    System.out.println(sayableUsingLambda.say());
    //Sử dụng Lambda có nhiều tham số
    AddNumber addNumber = (a,b) -> {
        return a+b;
    };
    System.out.println("Tổng hai số:  "+addNumber.add2number(5,9));
    
    AddNumber addNumber2 = new AddNumber(){
        @Override
        public int add2number(int i, int j) {
            // TODO Auto-generated method stub
            return i+j;
        }
    };
        System.out.println(addNumber.add2number(10,20));
        ArrayList <String> list = new ArrayList<String>();
        list.add("Phuc");
        list.add("Duc");
        list.add("Ton");
        list.add("Tam");
        System.out.println("Sử dụng for each");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Sử dụng Lambda");
        list.forEach(n -> System.out.println(n));
        //Sắp xếp sử dụng Lambda
        Collection.sort(list,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
         } };
        System.out.println("Danh sách sau khi sắp xếp: ");
        list.forEach(n->System.out.println(n));
        Collection.sort(list,(String o1,String o2))->{
            return o1.compareTo(o2);
        };
    }
}