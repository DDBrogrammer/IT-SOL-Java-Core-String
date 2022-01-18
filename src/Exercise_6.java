public class Exercise_6 {
    private static Helper helper = new Helper();
    public static void main(String[] args) {
                      do{
                          String input= helper.getString("Nhập vào một chuỗi ký tự:");
                          String [] inputListString=getSortStringList(input);
                          if(validateString(input)){
                              System.out.println(" Chuỗi sau khi sắp xếp theo bảng chữ cái là:");
                              for(int i=0;i<inputListString.length;i++){
                                  System.out.print(inputListString[i]+" ");
                              }
                              break;
                          }else System.out.println("Chuỗi quá 20 từ hoặc từ quá 10 ký tự !!!");

                      }while(true);
    }
    public static boolean validateString(String str){
        String[] temp = str.split(" ");
        boolean checkName=true;
        for(int i=0;i<temp.length;i++){
            if(temp[i].length()>20){
                checkName=false;
            }
        }
        if(temp.length>20){
            checkName=false;
        }
        return checkName;
    }

    public static String [] getSortStringList(String str){
        String[] temp = str.split(" ");
        String t="";
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].compareTo(temp[j]) > 0) {
                    t =temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }
        return temp;
    }
}
