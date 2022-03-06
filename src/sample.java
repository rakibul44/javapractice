// uses of add method //


public class sample {
    int x = 5;
    int y = 6;

    String str1 = "00p";
    String str2 = "java";
    public void add(){
        System.out.println(x+y);
        System.out.println(str1+ " " +str2);
    }

    public static void main(String[] args) {
        sample s = new sample();
        s.add();
    }
}