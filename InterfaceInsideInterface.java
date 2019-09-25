class Implementation{
    Outter.Inner inner=new Outter.Inner(){
    public void m2(){
    System.out.println("m2");
    }
    };
}
interface Outter{

    interface Inner{
        public void m2();
    }
}

class InterfaceInsideInterface{
    public static void main(String[] args){
        Implementation implementation=new Implementation();
        implementation.inner.m2();
    }
}
