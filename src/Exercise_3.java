public class Exercise_3 {
    private static Helper helper = new Helper();
    public static void main(String[] args) {
        do {
            String input=   helper.getString("Nhập vào 1 chuỗi kí tự : ");
            System.out.println("Chuỗi sau khi chuẩn hóa: "+normalizedString(input));
            break;

        }while (true);

    }
    public static String normalizedString(String str) {
        str = normalize(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return str;
    }
    public static String normalize(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }


}
