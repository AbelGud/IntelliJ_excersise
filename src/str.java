import java.util.Scanner;

public class str {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string");
        String sen;
        sen = input.nextLine();
        for(int i = 0; i < sen.length(); i++){
            if(isVowel(sen.charAt(i))){
                System.out.print(sen.charAt(i));
                System.out.println();
            }

        }
    }
    static boolean isVowel(char c){
        if(c == 'a' || c == 'e'|| c=='i'||c=='o'||c=='u'){
            return true;
        }
        else
            return false;
    }
}
