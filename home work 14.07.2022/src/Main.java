import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        validate("I like Java!!!");
        String[] SA = {"hello", "good", "love", "bye", "yes", " I", "yoo"};
        System.out.println("����� �������� ����� - ��� " + smallest(SA));
        bigger();
        StringBuilder stringBuilder = createString(3, 56);
        System.out.println(stringBuilder);
        unite();
        reversDemo();
        saw();
    }
    public static void validate(String str) {
        System.out.println(str);
        System.out.println("��������� ������ ������ - " + str.charAt(12));
        System.out.println("������������� �� ���� ������ ���������� �!!!� - " + str.endsWith("!!!"));
        System.out.println("���������� �� ���� ������ ���������� I like - " + str.startsWith("I like"));
        System.out.println("C������� �� ������ ��������� Java - " + str.contains("Java"));
        System.out.println("������� ��������� �Java� � ������ �I like Java!!! - " + str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(7, 11));
    }
    public static void reversDemo() {
        String s = "ABBA";
        s = s.replaceAll("", "");
        if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
            System.out.println("���������! " + s);
        else
            System.out.println("�� ���������! :( " + s);
    }

     public static void saw() {
         String s = "����� �� �������, ������� - �� ��������";
         for (String word : s.split(" ")) {
             if (word.length() > 3 & word.length() <= 5) {
                 System.out.println(word);
             }
         }
     }
     public static String smallest (String SA[]){
        int index = 0, minLength = SA[0].length();
        for (int i = 1; i < SA.length; i++) {
            if (SA[i].length() < minLength) {
                index = i;
                minLength = SA[i].length();
            }
        }
        return SA[index];
    }

    public static void bigger(){
        String str = "����� ������� �����";
        String[] mas_str = str.split(" ");
        String max = mas_str[0];
        for(int i = 1; i < mas_str.length; ++i){
            if(max.length() < mas_str[i].length())
                max = mas_str[i];
        }
        System.out.println("����� ������� �����: " + max);
    }
    private static StringBuilder createString ( int a, int b){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a).append(" + ").append(b).append(" = ").append(" 59 ").append("\n");
        stringBuilder.append(a).append(" - ").append(b).append(" = ").append(" -53 ").append("\n");
        stringBuilder.append(a).append(" * ").append(b).append(" = ").append(" 168 ").append("\n");
        return stringBuilder;
                }
                public static void unite () {
                    String str1 = "����";
                    String str2 = "����";
                    System.out.println("������ ����� = " + str1);
                    System.out.println("������ ����� = " + str2);
                    String str3 = (str1.substring(0, str1.length() / 2)) +
                            (str2.substring(str2.length() / 2, str2.length()));
                    System.out.println(str3);
                }
            }


