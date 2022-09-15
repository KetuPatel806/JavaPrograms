package ArraysTypeRecursion;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(printNumbers(0,6));
    }
    public static int printNumbers(int s,int e){
        if(s == e){
            return e;
        }
        System.out.println(s);
        return printNumbers(s+1,e);
    }
}
