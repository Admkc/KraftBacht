package eylul_06_Constructor;

public class Square {

   public int sideLengt;

   public Square(){

   }
   public Square(int sideLengt){
       this.sideLengt=sideLengt;
   }
   public int calculateArea(){

       return (int)Math.pow(this.sideLengt,2);
   }
   public double calculateArea(int sideLengt){
       return Math.pow(sideLengt,2);
   }
   public int calculatePerimeter(){
       return 4*this.sideLengt;
   }
   public double calculatePerimeter(int sideLengt){

       return 4*sideLengt;
   }



}
