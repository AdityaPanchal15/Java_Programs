class Implement{
    public static void main(String []args){
        Outterimpl o=new Outterimpl();
        o.m2();
    }
}
class Outter{
    public void m1(){
        System.out.println("m1");
    }
    interface Inner{
        public void m2();
    }
}
class Outterimpl implements Outter.Inner{
    public void m2(){
    System.out.println("m2");
    }
}
