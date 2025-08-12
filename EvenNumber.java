import java.lang.*;

// this is 1st method:

public class EvenNumber{
    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}





// this is 2nd method:

// public class EvenNumber{
//     public static void main(String[] args){
//         boolean isEven = true;
//         for(int i = 0; i < 100; i++){
//             isEven = (i % 2 == 0);
//             if(isEven){
//                 System.out.println(i);
//             }
//         }
//     }
// }





// this is 3rd  Method:

// public class EvenNumber {
//     public static void main(String[] args) {
//         for (int i = 0; i < 100; i += 2) {
//             System.out.println(i);
//         }
//     }
// }





// this is 4th method:

// public class EvenNumber {
//     public static void main(String[] args) {
//         int i = 0;
//         while (i < 100) {
//             System.out.println(i);
//             i += 2;
//         }
//     }
// }
