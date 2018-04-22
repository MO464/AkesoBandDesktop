/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;
/**
 *
 * @author Nistica
 */
public class Decryption {
    
    private static final String ALGO = "AES";
    private static final byte[] keyValue = 
        new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't',
'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };


    public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
}

}
