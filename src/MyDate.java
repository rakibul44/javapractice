//creating variable then printing the method//


public class MyDate {
    private int date;
    private  int month;
    private int year;

    public MyDate(){
        date = 06;
        month = 02;
        year = 2022;
    }

    public void print_date(){
        System.out.println(date + "-" + month + "-" + year);
    }

    public static  void main(String[] args){
        MyDate m = new MyDate();
        m.print_date();
    }

}
