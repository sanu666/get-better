package JanInterViewArchive1;


public class Jan6thInterviewP3 {

    public static void main(String[] args) {

        System.out.println(reverse("abcd",0,3));
    }

    public static String reverse(String str,int i, int j){

        if(i>=j)
            return str;

        char[] chaArr=str.toCharArray();
        char temp= chaArr[i];
        chaArr[i]=chaArr[j];
        chaArr[j]=temp;

        i++;
        j--;

        return reverse(String.valueOf(chaArr),i,j);

//        Select * from employee_table where employee_table.sal
    }

}
