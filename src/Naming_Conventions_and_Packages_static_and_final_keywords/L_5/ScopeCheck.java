package Naming_Conventions_and_Packages_static_and_final_keywords.L_5;

public class ScopeCheck {

public int publicVar = 0;
public int varOne = 1;

public  ScopeCheck(){
    System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varThree = " + varOne);

}

    public int getVarOne() {
        return varOne;
    }


    public void timesTwo(){
    int varTwo = 2;
    for(int i =0;i<10;i++){
        System.out.println(i + " times two is " + i * varTwo);
    }
    }

    public void useInner(){
     InnerClass innerClass  = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }


  public class InnerClass{
    private int varThree = 3;
    public InnerClass(){
        System.out.println("Inner class created,varThree is " + varThree);

    }


      public void timesTwo(){
          //int privateVar = 3;
          System.out.println("varOne is Still available here " + varOne);
          ScopeCheck.this.timesTwo();
          for(int i =0;i<10;i++){
              System.out.println(i + " times two is " + i * varThree);
          }
      }
  }



}
