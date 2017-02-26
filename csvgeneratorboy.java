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
public class csvgeneratorboy {
      String name;
    int  attractiveness;
    int intelligence;
    int budget;
    int minAtt;   
     void csvgenerate()throws FileNotFoundException, IOException
  
    {
          try (PrintWriter p = new PrintWriter(new File("boy.csv"))) {
              StringBuilder stringb = new StringBuilder();
              ArrayList<Boy> N = new ArrayList<>(100);
              
              for(int j=0;j<100;j++)
              {
                  name="b"+(j);
                  attractiveness=(int) (10+(Math.random()*19));
                  budget=(int) (100+(Math.random()*25));
                  intelligence=(int) (10+(Math.random()*1000));
                  minAtt=(int) (0+(Math.random()*19));
                  stringb.append(name);
                  stringb.append(',');
                  stringb.append(attractiveness);
                  stringb.append(',');
                  stringb.append(intelligence);
                  stringb.append(',');
                  stringb.append(budget);
                  stringb.append(',');
                  stringb.append(minAtt);
                  stringb.append(',');
                  stringb.append("\n");
              }
              p.write(stringb.toString());
          }
      
    }
}
