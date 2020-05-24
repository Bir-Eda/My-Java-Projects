package Oracle;

public class StrConCat {
    public static void main(String[] args) {
        System.out.println("redxx");
    }
    public String see(String str){
    int len=str.length();
  if(len>=4){
        if(str.substring(0,4).equals("blue")){
            return "blue";
        }
        else if(str.substring(0,3).equals("red")){
            return "red";
        }
        else{
            return "";
        }
    }
  else if(len == 3)
    {
        if(str.substring(0, 3).equals("red"))
            return "red";
        else
            return "";
    }
	else
            return "";
}
}
