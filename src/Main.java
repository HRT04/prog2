import jp.ac.uryukyu.ie.a.library.*;

public class Main {
    public static void main(String[] args){
        //貸し出し図書の準備
        RentalBook book1 = new RentalBook("何故ルートビアは美味いのか", 123);
        System.out.println(book1.title);
        book1.printSummary();

        RentalBook book2 = new RentalBook("ルートビア最高",456);
        book2.printSummary();

    }    
}