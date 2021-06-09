/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 *
 * @author macbookair
 */
public class MyServiceHandler implements SOAPHandler<SOAPMessageContext> {
    
    public boolean handleMessage(SOAPMessageContext messageContext) {
    String outProperty = SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY;
        boolean outgoing = (Boolean)messageContext.get(outProperty);
        
        SOAPMessage msg = messageContext.getMessage();
        try
        {
            
          SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YY.MM.dd.HH.mm.ss");
          Timestamp timestamp = new Timestamp(System.currentTimeMillis());
          
           String filename = simpleDateFormat.format(timestamp);
        
            String loggingFile = "/Users/macbookair/Desktop/testxml/" + filename + ".xml";
            System.out.println(loggingFile);
         
          if (outgoing)       
             msg.writeTo(new FileOutputStream(loggingFile,true));
          else
             msg.writeTo(new FileOutputStream(loggingFile,true));
        }
        catch(IOException e)
        {
            throw new RuntimeException(e) ;
        }  
        catch(SOAPException e)
        {
            throw new RuntimeException(e);
        }
        return true;
    }
    
    public Set<QName> getHeaders() {
        return Collections.EMPTY_SET;
    }
    
    public boolean handleFault(SOAPMessageContext messageContext) {
        return true;
    }
    
    public void close(MessageContext context) {
    }
    
}
