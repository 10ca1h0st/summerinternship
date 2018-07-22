public class TEST {
    public static void main(String[] args){
        System.out.println("Hello World!".toCharArray());
        System.out.println("Say Something");
        //流星花园 For You
        iface i = new iface_real();
        i.func();
    }
}

interface iface{
    void func();
}

class iface_real implements iface{
    public void func(){
        System.out.println("iface real");
    }
}
