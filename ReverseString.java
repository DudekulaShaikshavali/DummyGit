public class ReverseString {
  public static void main(String[]args){
    String str="hello");
    String reverse="";
    for(int i=str.length()-1;i>=0;i--){
      char c=str.charAt(i);
      reverse=reverse+c;
    }
    System.out.println(reverse);
  }
}
