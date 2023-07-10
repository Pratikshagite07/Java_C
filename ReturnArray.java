public class ReturnArray {
        static int[] get(){
             return new int[] {10,20,40,40};

        }
        public static void main(String args[]){
        int arr[]= get();
        for(int i=0;i<4;i++)
        System.out.println(arr[i]);

        }
    }
    

