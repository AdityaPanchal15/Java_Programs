class Outterimpl{
    Outter.Inner inner=new Outter.Inner(){
    public void m2(){
    System.out.println("m2");
    }
    };
}
class Outter{
    public void m1(){
        System.out.println("m1");
    }
    interface Inner{
        public void m2();
    }
}

class InnerInterface{
    public static void main(String[] args){
        Outterimpl o=new Outterimpl();
        o.inner.m2();
    }
}
