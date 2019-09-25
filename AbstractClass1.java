class AbstractClass{
    public static void main(String args[]){
 
      Potato potato=new Potato();
      Brinjal brinjal=new Brinjal();
      Tomato tomato=new Tomato();

      potato.setColor("White");
      brinjal.setColor("Purple");
      tomato.setColor("Red");
      
      System.out.println(potato);
      System.out.println(brinjal);
      System.out.println(tomato);
    }
}
abstract class Vegetable{
    public String color;
}

class Potato extends Vegetable{
     
     public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    
    public String toString(){
            return "Potato color="+color;
        }
}

class Brinjal extends Vegetable{
    private String color;
     public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    
    public String toString(){
        return "Brinjal color="+color;
    }
}

class Tomato extends Vegetable{
    private String color;
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    
    public String toString(){
        return "Tomato color="+color;
    }
}




































































































































































































































































































































































