public class Exercise_4 {
    private static Helper helper =new Helper();
    public static void main(String[] args) {
         do {
            String input= helper.getString(" Nhập vào một chuỗi bất kỳ:");
             System.out.println("Từ dài nhất là: "+ getLongestString(input) );
             System.out.println("Độ dài: "+getLongestString(input).length());
         }while(true);
    }

    public static String getLongestString(String str){
        int max = 0;
        String result = "";
        String [] strList= str.split(" ");
        for(int i=0;i<=strList.length-1;i++){
            if(strList[i].length()>max){

                max= strList[i].length();
                result = strList[i];
            }
        }
        return result;
    }


}
