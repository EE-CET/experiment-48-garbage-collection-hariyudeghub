public class GarbageCollection {
    protected void finalize(){
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {
        GarbageCollection object= new GarbageCollection();
        object=null;
        System.gc();
    }
}
