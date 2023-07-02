public class swapno {
    public static void main(String args[]){
        float first = 1.20f, second= 2.4f;
        System.out.println("--Before swap--");
        System.out.println("First number="+first);
        System.out.println("Second number ="+second);
        float temparory =first;
        first=second;
        second = temparory;
        System.out.println("--After swap--");
        System.out.println("Frist number="+first);
        System.out.println("Second number="+ second);
    }
    
}
