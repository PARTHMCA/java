public class p3 {
    static int count =0;
    
    p3(){
        count++;
        System.out.print(count+  "\n");
    }
    
    public static void main(String[] top){
        p3 p = new p3();
        p3 q = new p3();
    }
}
