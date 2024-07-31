package InterviewPrep.StringQuestions;

public class CamelCaseToSnakeCase {
    public static void main(String[] args) {
        String str = "ConvertCamelCaseToSnakeCase";
        System.out.println(convertCamelCaseToSnakeCase(str));
        
    }
    public static String convertCamelCaseToSnakeCase(String str){
        StringBuffer ans = new StringBuffer("");
        char firstChar = str.charAt(0);
        ans.append(Character.toLowerCase(firstChar));

        for(int i = 1; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                ans.append("_");
                ans.append(Character.toLowerCase(ch));
            }else{
                ans.append(ch);
            }
            
        }
        return ans.toString();
    }

}
