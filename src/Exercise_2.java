public class Exercise_2 {
     private static Helper helper = new Helper();
     private static final String ONLY_LETTER_REGEX="^[a-zA-Z]*$";
    public static void main(String[] args) {
        System.out.println(   getConvertString("dfsdfgsd"));

        do {
              String input=   helper.getString("Nhập vào 1 chuỗi kí tự chỉ chứa các chữ cái: ");
              if(checkLetter(input)){
                  System.out.println("Chuỗi sau khi biến đổi: "+getConvertString(input));
                  break;
              }
        }while (true);
    }


    static boolean checkLetter(String str){
        return ((!str.equals(""))
                && (str != null)
                && (str.matches(ONLY_LETTER_REGEX)));
    }
    static String getConvertString(String str){
        boolean check=true;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(check){
            ch[i] =Character.toUpperCase(str.charAt(i));
            check=false;
            }else{
                ch[i] =Character.toLowerCase(str.charAt(i));
                check=true;
            }
        }
        String res= String.valueOf(ch);
        return res;


    }
}
