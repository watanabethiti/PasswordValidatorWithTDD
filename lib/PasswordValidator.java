package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength INVALID อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
         int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
         int countLower = 0;
         int countUpper = 0;
         int countNum = 0;


        if(password==null || password.length()<minLength)
            return PasswordStrength.INVALID;

        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){ countLower++ ;}
            else if(Character.isUpperCase(c)) { countUpper++ ;}
            else if(Character.isDigit(c)){ countNum++ ;}
        }
        if(countNum==password.length() || countLower == password.length())                                                                                                                                                                                      
            return PasswordStrength.WEAK;
        if(countLower > 0 && countUpper > 0)
            return PasswordStrength.MEDIUM;
        
        
        return PasswordStrength.STRONG; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}