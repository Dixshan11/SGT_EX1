

public class SwapStaticNumbersWithFunction {
    int a=10,b=20,temp;
    public static void main(String[] args) {
        SwapStaticNumbersWithFunction s=new SwapStaticNumbersWithFunction();
        s.swap();
    }

    public void swap(){
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap numbers are a= "+a+"   b="+b);
    }
}
