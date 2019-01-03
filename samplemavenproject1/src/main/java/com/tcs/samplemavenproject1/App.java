package com.tcs.samplemavenproject1;

import org.apache.commons.collections4.*;

/**
 * Hello world!
 *
 */

/*import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;*/
import org.apache.commons.collections4.bidimap.*;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        sayHello1();
        com.tcs.samplemavenproject.App.sayHello();
        BidiMap<String, String> map = new DualHashBidiMap();
        map.put("key1", "value1");
        map.put("key2", "value2"); 
        map.put("key3", "value3");
        map.put("key5", "value3");
        map.put("key4", "value4"); 
       String strKey = map.getKey("value3");
       System.out.println(strKey);
       
    }
    
    public static void sayHello1()
    {
    	  System.out.println( "samplemavenproject1 says Hello " );
    }

    
}


