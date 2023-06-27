import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 7 ,9, 2, 7, 1 , 9);

        List<Integer> result = new ArrayList<>();

        for(Integer element:list){
            if (result.contains(element)){
                result.remove(element);
            }else {
                result.add(element);
            }
        }

        //Printing the unpaired number
        System.out.println(result);
    }
}