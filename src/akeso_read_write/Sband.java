/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akeso_read_write;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.*;
import java.awt.image.*;
import java.util.Hashtable;
import java.util.*;

/**
 *
 * @author Nistica
 */
public class Sband {
 public static void main(String[] args) throws WriterException, IOException,
        NotFoundException {
     Scanner scanner = new Scanner( System.in );
     String data=null,keyData=null,presData=null;
     
     
     System.out.println("What is the Patiants name?");
     String name = scanner.nextLine();
            try {
                String filePath = ("/Users/Akeso/"+name+".jpeg");
                String charset = "UTF-8";
                Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
                hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
                data = readQRCode(filePath, charset, hintMap).toString();
                
                data = Decryption.decrypt(data);
                
               
                //if (key==keyData)throw new Exception ("Data read from QR Code:\r\n " +presData);
                System.out.println("Data read from QR Code:\r\n " +data);
                
            
                //System.out.println("Data read from QR Code:\r\n " + readQRCode(filePath, charset, hintMap));
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
    public static String readQRCode(String filePath, String charset, Map hintMap)
    throws FileNotFoundException, IOException, NotFoundException {
        BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(
            new BufferedImageLuminanceSource(
                ImageIO.read(new FileInputStream(filePath)))));
        Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, hintMap);
        return qrCodeResult.getText();
    }
}
