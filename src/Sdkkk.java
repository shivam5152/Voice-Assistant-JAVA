import org.apache.poi.hwpf.*;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import java.awt.Desktop;
import javax.speech.Central;
import javax.speech.EngineModeDesc;
import javax.speech.recognition.*;
import javax.speech.synthesis.*;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.io.FileReader;
import java.util.Locale;
import java.util.*;
import java.io.IOException;
import java.io.*;

public class Sdkkk
        
{

public static void main(String arr[])
{
try
{

        File file = null;
        WordExtractor extractor = null;
        file = new File("D:\\sample.doc");
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String[] fileData = extractor.getParagraphText();
            for (int i = 0; i < fileData.length; i++)
            {
                if (fileData[i] != null)
                   System.out.println(fileData[i]);
            }
}

 catch (Exception e) {
			e.printStackTrace();
		                                           }
}






}