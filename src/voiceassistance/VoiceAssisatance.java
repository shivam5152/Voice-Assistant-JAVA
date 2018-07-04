package voiceassistance;

import org.apache.poi.hwpf.*;
import java.lang.*;
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
import javax.speech.EngineListener;



        public class VoiceAssisatance extends ResultAdapter
	{
	private static Synthesizer synth;
	private String speech,gst;
	private static Recognizer recognizer ;
        
    /**
     *
     * @param re
     */
        @Override
    public void resultAccepted(ResultEvent re)
	 {
        try
	   {
	Result res=(Result)(re.getSource());
	ResultToken tokens  []=res.getBestTokens();
        speech="";
	for (int i=0;i<tokens.length;i++)
	{
	gst=tokens[i].getSpokenText();
	speech=speech+gst+" ";
        
	}
	speech=speech.trim();
	System.out.println(speech);
        
        
                                                        switch(speech)
                                                        {
                                                            
                                                        case "hello": synth.speakPlainText("hello sir ",null);break;
                                                        case "open task manager": synth.speakPlainText("ok sir ",null);
                                                        Process p90=Runtime.getRuntime().exec("start Taskmgr");
                                                        break;
                                                        case "good": synth.speakPlainText("thanks sir ",null);break;

                                                        case "open notepad": synth.speakPlainText("ok sir ",null);//for notepad
                                                        //Notepad c=new Notepad();
                                                        //   c.notepad();
                                                        Runtime runtime = Runtime.getRuntime();
                                                        
                                                        Process p891 = runtime.exec("notepad");
                                                        //Process proc3 = runtime.exec("D:");
                                                        
                                                        break;
                                                        
                                                        case "open calculator": synth.speakPlainText("ok sir ",null);//for calculator
                                                        //Calculator  ca=new Calculator();
                                                        //     ca.calc();

                                                        //Runtime runtime1 = Runtime.getRuntime();
                                                        //Process proc = runtime1.exec("calc");
                                                        Process proc1=Runtime.getRuntime().exec("calc");
                                                        
                                                        break;
                                                        case "open c m d":synth.speakPlainText("ok sir",null);
                                                        Process p89=Runtime.getRuntime().exec("cmd");
                                                        Runtime runtime141 = Runtime.getRuntime();

                                                        Process proc141 = runtime141.exec("cmd.exe /c start");
                                                        break;
                                                        
                                                        case "open my computer": synth.speakPlainText("ok sir ",null);//for explorer

                                                        case "open all disk": synth.speakPlainText("ok sir ",null);

                                                        Runtime runtime14 = Runtime.getRuntime();

                                                        Process proc14 = runtime14.exec("explorer");
                                                       //    proc14 = runtime14.exec("TASKKILL /F /IM EXPLORER.EXE");
                                                        break;
                                                        
                                                        case "hide my desktop":
                                                          Runtime runtime15 = Runtime.getRuntime();

                                                        
                                                          proc14 = runtime15.exec("TASKKILL /F /IM EXPLORER.EXE");
                                                        
                                                          break;
                                                          
                                                            case "stop":System.out.println();
                                                          Runtime runtime1711 = Runtime.getRuntime();

                                                        
                                                          proc14 = runtime1711.exec("TASKKILL /F /IM ");
                                                        
                                                          break;
                                                          
                                                        case "close notepad":
                                                          Runtime runtime16 = Runtime.getRuntime();

                                                           proc14 = runtime16.exec("TASKKILL /F /IM notepad.exe");
                                                         break;
                                                           
                                                        case "close calculator":
                                                        
                                                            Runtime runtime17 = Runtime.getRuntime();

                                                           proc14 = runtime17.exec("TASKKILL /F /IM calculator.exe");
                                                         
                                                           break;
                                                        case"close c m d":
                                                            
                                                        
                                                            Runtime runtime171 = Runtime.getRuntime();

                                                           proc14 = runtime171.exec("TASKKILL /F /IM cmd.exe");
                                                         
                                                           break;
                                                           
                                                        case "unhide  my desktop":
                                                        
                                                            Runtime runtime18 = Runtime.getRuntime();
                                                          
                                                            synth.speakPlainText("please wait sir",null);
                                                          
                                                        proc14 = new ProcessBuilder("explorer.exe").start();

                                                           proc14 = runtime18.exec("EXPLORER.EXE /c start");
                                                           break;
                                                         
                                                        case "open crome": synth.speakPlainText("ok sir ",null);

                                                         Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
                                                         p.waitFor();
                                                        break;
                                                        case "open ms word": synth.speakPlainText("ok sir ",null);

                                                        Runtime runtime123 = Runtime.getRuntime();

                                                        Process proc12 = runtime123.exec("winword /c start");
                                                        //proc12 = new ProcessBuilder("winword").start();
                                                         
                                                        break;
                                                        case "open window media player": synth.speakPlainText("ok sir ",null);
                                                        WindowMp  m=new WindowMp();
                                                        m.mp();
                                                        break;
                                                        case "open all process":
                                                            synth.speakPlainText("ok sir i want to try show you all processes run in background ",null);
                                                            
                                                                //proc14 = Runtime.getRuntime().exec("System.getenv(\"windir\")+\"\\\\system32\\\\+\"tasklist.exe /fo csv /nh\"");
                                                           
                                                            String str;
                                                             Process p1 = Runtime.getRuntime().exec("tasklist");
   
                                                          BufferedReader input = new BufferedReader(new InputStreamReader(p1.getInputStream()));
   
                                                         while ((str = input.readLine()) != null) {
                                                         
                                                         System.out.println(str);
                                                         }
   
                                                            break;
                                                        case "show me all process only name or id":
                                                            Shadow sh=new Shadow();
                                                            sh.show();
                                                            
                                                        
                                                       case "who is piyoosh": synth.speakPlainText("sub incharge of this project",null);break;
                                                       
                                                       case "who is vishal": synth.speakPlainText("i do not know sir",null);break;
                                                       
                                                       case "what are you doing": synth.speakPlainText("waiting for your instrection",null);break;
                                                       
                                                       case "how are you": synth.speakPlainText(" hello everybody, I really want to make a difference in the future and try and help people to develop empathy and respect each other. sir",null);break;
                                                       
                                                       case "what is your name": synth.speakPlainText("floodi",null);break;
                                                       
                                                       case "how about my study": synth.speakPlainText("brilliant sir",null);break;
                                                       
                                                       case "who is ram": synth.speakPlainText("Rama (or Ramacandra) is the seventh avatar of the Hindu god Vishnu. His adventures, notably the slaying of the demon king Ravana, are recounted in the Vana Parva of the Mahabharata and in the Ramayana, the oldest Sanskrit epic, written sometime in the 5th century BCE but with some later additions. ",null);break;
                                                       
                                                       case "how many brother have i": synth.speakPlainText("five sir",null);break;
                                                       
                                                       case "what am i doing currently": synth.speakPlainText("mca from g l a university",null);break;
                                                       
                                                       case "what's going on": synth.speakPlainText("nothing special",null);break;
                                                       
                                                       
                                                       case "leave me": synth.speakPlainText("ok sir",null);break;
                                                       
                                                       case "what is day today" : 
                                                       
                                                       case "aaj din kaun sa hi" :
                                                       
                                                       case "tell me date":
                                                       
                                                           Date d = new Date();
                                                        
                                                           String temp1 = d.toString();
                                                        
                                                           String str1[]  = temp1.split(" ");
                                                        
                                                           synth.speakPlainText(str1[0],null);
                                                                    break;
                                                        
                                                       case "what time it is now" :
                                                       
                                                       case "time kya hua hai":
                                                       
                                                       case "tell me current time":
                                                       
                                                           Date d1 = new Date();
                                                        
                                                           String temp = d1.toString();
                                                        
                                                           String str78[]  = temp.split(" ");

                                                        
                                                           synth.speakPlainText(str78[3],null);
                                                           System.out.println(str78[3]);
                                                        
                                                           break;
                                                       
                                                       case "who is shivam": synth.speakPlainText("head incharge of this project",null);
                                                       
                                                         
                                                       break;
                                                       
                                                       case " read text file" : 
                                                       
                                                           File f = new File("D:/Java/jdk1.8.0_144/bin/Shivam.java");
                                                        
                                                           BufferedReader reader = new BufferedReader(new FileReader("D:/ramesh.java"));
                                                        
                                                           StringBuilder stringBuilder = new StringBuilder();
                                                        
                                                           String line = null;
                                                        
                                                           String ls = System.getProperty("line.separator");
                                                        
                                                           while ((line = reader.readLine()) != null) {
                                                        
                                                               stringBuilder.append(line);
                                                        
                                                               stringBuilder.append(ls);
                                                                                                            }
                                                        
                                                         
                                                           synth.speakPlainText(stringBuilder.toString(),null);
                                                       
                                                           // delete the last new line separator
                                                        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                                                        
                                                        reader.close();

                                                        String content = stringBuilder.toString();
                                                        //break;  
                                                        
                                                       case "read d o c file" : synth.speakPlainText("ok sir",null);
                                                       
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
                                                       
                                                           synth.speakPlainText(fileData[i], null);
                                                        }
                                                        
                                                       break;
                                                       

                                                       
                                                       

                                                        case "shutdown my pc": synth.speakPlainText("ok sir",null);
                                                           Scanner sc=new Scanner(System.in);
                                                       
                                                                System.out.println("anter your verifier code");
                                                        
                                                                int xs=sc.nextInt();
                                                        
                                                                if(xs==8484448){
                                                                  
                                                        Runtime runtime13 = Runtime.getRuntime();
                                                        Process proc13 = runtime13.exec("shutdown -s -t 0");
                                                                
                                                                }
                                                        break;


                                                        case "open present working directory":
                                                        
                                                            String workingDir = System.getProperty("user.dir");
                                                        
                                                            System.out.println("Current working directory : " + workingDir);
                                                        
                                                            Desktop desktop = Desktop.getDesktop();
                                                        
                                                            File file1 = new File(workingDir);
                                                        
                                                            desktop.open(file1);
                                                            break;
                                                              case "open D":
                                                        
                                                            String workingDir1 = System.getProperty("D.dir8");
                                                        
                                                            System.out.println("Current working directory : " + workingDir1);
                                                        
                                                            Desktop desktop1 = Desktop.getDesktop();
                                                        
                                                            File file12 = new File(workingDir1);
                                                        
                                                            desktop1.open(file12);
                                                        
                                                        

                                                        }
                                                       // System.out.println(speech);

    }
                                                        catch (Exception e)
                                                        {
                                                        System.out.println("Exception in MAIN->>>" + e);
                                                        
                                                        synth.speakPlainText("Sir?there is problem?I could not be retrieve your commands from the database?",null);
                                                        }
 }
        


                                                        public static void main(String args[])throws IOException
                                                        {
                                                        try
                                                            {


                                                        
                                                                new VoiceAssisatance();
                                                               
                                                        
                                                                Scanner sc=new Scanner(System.in);
                                                       
                                                                System.out.println("enter your verifier code");
                                                        
                                                                int s=sc.nextInt();
                                                        
                                                                if(s==8484448)
                                                        
                                                                {
                                                        
                                                                    synth = Central.createSynthesizer(new SynthesizerModeDesc(Locale.ENGLISH));
                                                        
                                                                    recognizer = Central.createRecognizer(new EngineModeDesc(Locale.ENGLISH));

                                                        
                                                                    synth.allocate();
                                                        
                                                                    recognizer.allocate();
                                                       
                                                                    FileReader grammar1 = new FileReader("D:\\backup of project\\Java\\hello.gram");
                                                        //FileReader piyoosh=new FileReader("D:\\Java\\ram.gram");

                                                        RuleGrammar rg = recognizer.loadJSGF(grammar1);

                                                        //RuleGrammar rgs = recognizer.loadJSGF(piyoosh);
                                                        synth.resume();
                                                        rg.addResultListener(new VoiceAssisatance());
                                                        // rgs.addResultListener(new Shivam());
                                                        System.out.println("I am Ready for your  Input Mr Shivam Bhardwaj ->>>>>");
                                                        // Commit the grammar.
                                                        
                                                        synth.speakPlainText("hello sir how can i help you ",null);
                                                        
                                                        recognizer.commitChanges();
                                                        
                                                        // Request focus and start listening.


                                                        recognizer.requestFocus();
                                                        
                                                        recognizer.resume();
                                                        
                                                        synth.allocate();

                                                        synth.resume();
                                                        
                                                        //mg.Testawt();
                                                        }
                                                       else if(s!=8484448)
                                                       {
                                                           System.out.println("access Denied");
                                                       
                                                            //synth.speakPlainText("sorry sir your verfier code not valid at this time",null); 
                                                       }
                            
	
                                                        }
                                        
                                                        catch (Exception e) 
                                                        {                                      
                                                        e.printStackTrace();
                                                        }
                                              }
                                                        
    }