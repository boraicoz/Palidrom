import java.util.Scanner;
public class Palidrom {

public static boolean isPalidrom(int number){
    boolean isPolidrom;
    int temp=number;
    int lastNumber,reverseNumber=0;
    while(temp!=0)
    {
        lastNumber=temp%10;
        reverseNumber=(reverseNumber*10)+lastNumber;
        temp/=10;
    }
     if(reverseNumber==number)
     {
         return true;
     }
     else
         return false;
}



    public static void main(String[] args) {
        System.out.print("Sayiyi Girin:");
        Scanner in=new Scanner(System.in);
        int sayi=in.nextInt();
        if(isPalidrom(sayi))
        {
            System.out.println("Palidrom Sayi");
        }
        else
            System.out.println("Palidrom Degil");
    }


}
