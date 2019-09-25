/*class Implementation{
    Outter.Inner inner=new Outter.Inner(){
        }
    };
}*/
interface Outter{
   // public void m1();

    class Inner{
        public void m2(){
    System.out.println("m2");
    }
}
}

class ClassInsideInterface{
    public static void main(String[] args){
        Outter.Inner inner=new Outter.Inner();
        inner.m2();
    }
}
