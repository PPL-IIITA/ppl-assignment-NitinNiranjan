/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author nitin
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Main {
    static commitedarray moc = new commitedarray();
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
                Logger logger = Logger.getLogger("MyLog");  
                FileHandler fh;  
                 int i=0;
		Boy b[] = new Boy[1000];
              csvgeneratorboy bc = new csvgeneratorboy();
               bc.csvgenerate();
		String line = "";
		String csvSplit = ",";
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("boy.csv"));
			while((line = br.readLine() )!= null){
				String[] sb = line.split(csvSplit);
				
				b[i] = new Boy();
                                b[i].name = sb[0];
				b[i].attractiveness = Integer.parseInt(sb[1]);
				b[i].intelligence = Integer.parseInt(sb[2]); 
				b[i].budget = Integer.parseInt(sb[3]);
				b[i].minAtt = Integer.parseInt(sb[4]);
                               // b[i].type=sb[5];
				//b[i].girlname="";
				//b[i].status = boy[5];
				i++;
                               // System.out.println("hello");
			}
		}
		
		catch(FileNotFoundException e){
		}catch(IOException e){
		}
            
               
               int j=0;
         
                Girl g[]= new Girl[1000];
               csvgeneratorgirl gc = new csvgeneratorgirl();
               gc.csvgenerate();
            
                try{
			br = new BufferedReader(new FileReader("girl.csv"));
			while((line = br.readLine() )!= null){
				String[] sg = line.split(csvSplit);
				g[j] = new Girl();
                                g[j].name = sg[0];
				g[j].attractiveness = Integer.parseInt(sg[1]);
				g[j].intelligence = Integer.parseInt(sg[2]);
                                g[j].maintenance=Integer.parseInt(sg[3]);
                               // g[j].type=sg[4];
				//b[i].girlname="";
				//b[i].status = boy[5];
				j++;
                              
			}
		}
		
		catch(FileNotFoundException e){
		}catch(IOException e){
		}   
          	
         /*for(k=0;k<i;k++)
                {
                    System.out.println(g[k].name);
                }
         System.out.println("\n");*/
         int l,m;
         int store[] = new int[100];
         int x=0;
        
         
       
        try {
        fh = new FileHandler("logfile.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);
        } catch (SecurityException | IOException e) {  
        }
        
        
         
        for(l=0;l<i;l++){
             for(m=0;m<j;m++){
                 if(g[m].status == "false" && b[l].status == "false"){
                     if(b[l].budget >= g[m].maintenance && b[l].minAtt <= g[m].attractiveness){
                        
                        g[m].status="true";
                        b[l].status="true";
                        //System .out.println(b[l].name + ">>" +g[m].name);
                         logger.log(Level.INFO, "{0}>>{1}", new Object[]{b[l].name, g[m].name}); 
                        moc.storearray(x,b[l],g[m]);
                        x++;  
                     }
                 }
             }
             
         }
        
        
        
        //moc.main(args,x);
         int c=0;
          Gifts gft[] = new Gifts[100];
          String csvFile3 = "gifts.csv";
          try{
			br = new BufferedReader(new FileReader(csvFile3));
			while((line = br.readLine() )!= null){
				String[] gcsv = line.split(csvSplit);
				
				gft[c] = new Gifts();
                                gft[c].type = gcsv[0];
				gft[c].price = Integer.parseInt(gcsv[1]);
                                gft[c].status = 0;
                                c++; 
			}
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
            
    }
}
    


    

