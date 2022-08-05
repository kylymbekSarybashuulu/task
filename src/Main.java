import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     
      try {
          method();
      }catch (Exception o ){
          System.out.println("null");
      }



    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        Enum e = Enum.valueOf(sc.next());

        switch (e){
            case MYNDAY -> System.out.println("duyshomby kyny java sabagyn okuim");
            case TYESDAY -> System.out.println("sheyshembi kyny anglis tikin okuim");
        }
    }
}