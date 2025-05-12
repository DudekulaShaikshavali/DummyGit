import java.util.*;
class RemoveArrayDuplicates {
    public static void main(String[] args) {
        String []names={"java","python","c language","sql","java","python"};
        String result="";
        for(int i=0;i<names.length;i++){
        if(result.indexOf(names[i])== -1){
            result=result+names[i]+",";
        }
        }
        String[] unique=result.split(" ");
        System.out.println(Arrays.toString(unique));
    }
}
