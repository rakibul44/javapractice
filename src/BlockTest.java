
//What is Block and How it's working in java //

public class BlockTest {
    public String info;
    public BlockTest(){
        info= " Costrautor executed in 2nd step";
        System.out.println(info);
    }
    {
        info = "Block Executed in 1st step";
        System.out.println(info);
	{
	System.out.println("Hello! i'm Rakibul");
	}
    }

    public void show() {
        info = "Method executed in 3rd step";
        System.out.println(info);
    }
    public static void main(String[] args) {
     BlockTest t = new BlockTest();
     t.show();
    }
}