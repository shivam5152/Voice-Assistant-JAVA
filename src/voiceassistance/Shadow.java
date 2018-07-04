
package voiceassistance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Shadow  {
    public void show() throws IOException{
        try{
    
        
   String process;



           
   Process p = Runtime.getRuntime().exec("tasklist");
   
   BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
   
   while ((process = input.readLine()) != null) {
   
       String[] s = process.trim().split(" ");
       
       ArrayList<String> list1 = new ArrayList<>();
                
       
       ArrayList<String> list2 = new ArrayList<>();

       int count = 0 ;
       
       for(String temp : s)
                {
                    temp = temp.trim();
                    if(!temp.equals(""))
                    {
                        if(count==0)
                        {
                            list2.add(temp);
                        }
                        else if(count==1)
                        {
                            list1.add(temp);
                        }
                        count++;
                        System.out.println(list1);
                        
                        System.out.println(list2);
                    }
                }
            

                
            } 
        }catch(IOException e){}
}
}

