/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author nitin
 */
public class csvgeneratorgirl {
 
      String name;
    int  attractiveness;
    int intelligence;
    int maintenance;
    
    
    
    void csvgenerate()throws FileNotFoundException, IOException
 
    {
        
          try (PrintWriter p = new PrintWriter(new File("girl.csv"))) {
              StringBuilder sb = new StringBuilder();
              ArrayList<Boy> B = new ArrayList<Boy>(100);
              
              for(int i=0;i<100;i++)
              {
                  name="g"+(i);
                  attractiveness=(int) (10+(Math.random()*19));
                  intelligence=(int) (100+(Math.random()*1000));
                  maintenance=(int) (10+(Math.random()*25));
                  sb.append(name);
                  sb.append(',');
                  sb.append(attractiveness);
                  sb.append(',');
                  sb.append(intelligence);
                  sb.append(',');
                  sb.append(maintenance);
                  sb.append(',');
                  sb.append("\n");
                  //sb.append(',');
              }
              p.write(sb.toString());
          }
     
    }
}

