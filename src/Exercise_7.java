public class Exercise_7 {
    static private  Helper helper=new Helper();
    public static void main(String[] args) {
        do{
            String s1= helper.getString("Nhập chuỗi s1: ");
            String s2=helper.getString("Nhập chuỗi s2: ");
            System.out.println("Chuỗi s1 sau khi loại bỏ s2: " +getConvertString(s1,s2));
            break;
        }while(true);


    }
    public static String getConvertString(String s1,String s2){
        String tempString="";
        int len=(s1.length()/s2.length());
    for(int i=0;i<len;i++) {
    if (s1.contains(s2) && s1.length()>=s2.length()) {
        tempString = s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2)+s2.length(), s1.length() - 1);
        s1=tempString;
      } else tempString=s1;
     }
    if(tempString==s2){
        return "";

    }       else return tempString;
    }
}
