package HM.HMOverLoadedMethods;
/*
  Create 1 class with a private method that has 3 overloaded forms.
  Then call each overloaded method with specific arguments and observe result.
 */
class task4Overloaded {

    protected void bob(int a, int b, int c){
        System.out.println("bob #1 where 3 num are int");
    }
    protected void bob(int a,int b){
        System.out.println("bob #2 where 2 num are int");
    }
    protected void bob(int a){
        System.out.println("bob #3 where only one int num");
    }

}
class cheka{
    public static void main(String[] args) {
        task4Overloaded lolo=new task4Overloaded();
        lolo.bob(5);
        lolo.bob(1,4,3);
        lolo.bob(4,6);
    }
}
