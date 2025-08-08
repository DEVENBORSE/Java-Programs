public class CountNumFromString {
    public static void main(String[] args){
        String str = new String("abcd154fhgi654gr55ufhg84");
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='0' && ch <='9'){
                count++;
            }
 
        }
        System.out.println("the no. of digits: "+ count);
    } 
}
