/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.lang.reflect.Array;
import static main.Main.main;

/**
 *
 * @author nitin
 */
public class commitedarray {
    static Gifts gt[] = new Gifts[100];  
    static Boy boy_commited[] = new Boy[100];
    static Girl girl_commited[] = new Girl[100];
    void storearray(int x, Boy b, Girl g){
        int len1=0;
        int len2=0;
        boy_commited[x] = new Boy();
        len1++;
        
        boy_commited[x]=b;
         //System.out.println(boy_commited[x].name);
        
        girl_commited[x] = new Girl();
        girl_commited[x] = g;
        len2++;
    }
}


