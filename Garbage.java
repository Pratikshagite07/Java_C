class Garbage {
    int rollno=10;
    String name="Ronak";
    protected void finalize()
    {
        System.out.println("Finalize Method Executed");
    }
    public static void main(String args[]){
        Garbage s1=new Garbage();
        System.out.println("Rollno"+s1.rollno);
        System.out.println("Name"+s1.name);
        s1=null;
        System.gc();
    }
}

