package HM.HMOverLoadedMethods;

 class Repls139 {
    String  alphabetical(String str) {
        String result="";
        //System.out.println(str.length());==> print 8 for the software
        for(int i=0;i<str.length()-1;i++) {
            if(i==0){
                result+=str.charAt(i);//result= h
            }if(str.charAt(i+1)>str.charAt(i)){//charAt(2)>charAt(1)
                result = result + str.charAt(i+1);//result=h+l=hl
            }
        }
        // str= hello->5--0h-e1-
//3>2

        return result;
    }
    public static void main(String[] args){
        Repls139 main = new Repls139();
        System.out.println(main.alphabetical("hello"));
        System.out.println(main.alphabetical("software"));
        System.out.println(main.alphabetical("language"));


    }
}
