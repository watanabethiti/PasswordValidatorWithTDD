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
        
        if(password==null || password.length()<8)
            return PasswordStrength.INVALID;

        int count = 0;
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
                count++;
        }
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        if(count==password.length())
            return PasswordStrength.WEAK;
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        return PasswordStrength.STRONG; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}