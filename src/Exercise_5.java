public class Exercise_5 {
    private static String NAME_REGEX="^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static Helper helper=new Helper();
    public static void main(String[] args) {
                    do{
                        String name=helper.getString("Nhập vào tên theo dạng Họ Đệm Tên: ");
                        if(checkName(name)){
                            System.out.println( getNewFormattedName(Exercise_3.normalizedString(name)));
                        }

                    }while(true);
    }

 public static boolean checkName(String name){
          return ((!name.equals(""))
             && (name != null)
             && (name.matches(NAME_REGEX)));
 }

public static String getNewFormattedName(String name){
    String [] strList= name.split(" ");
    String temp=strList[strList.length-1];
    String res= "";
    for (int i=strList.length-1;i>=1;i--){
       strList[i]=strList[i-1];
    }
    strList[0]=temp;
  for(int i=0;i<=strList.length-1;i++){
     res = res+strList[i]+" ";
  }
    return res;
}
}
