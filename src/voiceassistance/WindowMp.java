/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voiceassistance;

import java.io.IOException;
class WindowMp
{

public  void mp() throws IOException{

  Runtime runtime = Runtime.getRuntime();

  Process proc = runtime.exec("wmplayer");

  


}
public static void main(String[] str)
{
WindowMp a = new WindowMp();
try
{a.mp();}
catch(Exception e)
{
System.out.println(e);
}
}

}
    
