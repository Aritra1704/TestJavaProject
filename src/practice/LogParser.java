package practice;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class LogParser {

	public static void main(String[] args) {
		String xml = 
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<log>\n" + 
                "    <entry id=\"1\">\n" + 
                "        <message>Application started</message>\n" + 
                "    </entry>\n" + 
                "    <entry id=\"2\">\n" + 
                "        <message>Application ended</message>\n" + 
                "    </entry>\n" + 
                "</log>";
        
        Collection<Integer> ids;
		try {
			ids = getIdsByMessage(xml, "Application ended");
			for(int id: ids)
	            System.out.println(id); 
		} catch (Exception e) {
			e.printStackTrace();
		}
        

	}

	public static Collection<Integer> getIdsByMessage(String xml, String message) throws Exception {		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		
		try {
		    db = dbf.newDocumentBuilder();
		    InputSource is = new InputSource();
		    is.setCharacterStream(new StringReader(xml));
		    try {
		        Document doc = db.parse(is);
		        String mess = doc.getDocumentElement().getTextContent();
		        if(mess.equalsIgnoreCase(message))
		        	System.out.println(mess);
		    } catch (SAXException e) {
		        // handle SAXException
		    } catch (IOException e) {
		        // handle IOException
		    }
		} catch (ParserConfigurationException e1) {
		    // handle ParserConfigurationException
		}
		
//		NodeList nList = doc.getElementsByTagName("staff");
		ArrayList<Integer> list = new ArrayList<>();
//		list.add(count.length);
		return list;
    }
}
