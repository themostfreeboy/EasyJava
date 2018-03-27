 public class Test{
     public static void main(String[] args) {
        int i=29;
        int j=3;
        float a=23.5f;
        double b=4.0 ;
		char ch=31005;
	    System.out.println("i+a="+(i+a));        
        System.out.println("i*j="+(i*j)); 
        System.out.println("i/j="+(i/j));    //运算结果为整数
        System.out.println("i%j="+(i%j));  //求余数
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));  //运算结果为浮点数
        System.out.println("a%b="+(a%b));   //结果为浮点数
        System.out.println("i++="+(i++));   // 先使用，后自增
        System.out.println("++i="+(++i));   // 先自增，后使用
        System.out.println("ch"+ch);   

    }
}
