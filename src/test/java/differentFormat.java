import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class differentFormat {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
Map<String,String> tagMap = new HashMap<String, String>();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("C://Users//Shakeer//Documents//SwiftMessage.txt");
		document.getDocumentElement().normalize();
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		String[] tagnames = {"MsgId", "PmtInfId", "ReqdExctnDt", "Ustrd", "CreDtTm", "NbOfTxs", "Dbtr", "Cdtr"};
		String[] tagDescriptions = {"Message ID", "Payment Information Id", "Request Execution Transaction Date", "Remittance Detailed Information" ,"Creation Date and Time","Number of Transactions","Debtor Information", "Creditor Information"};

		for(int i=0;i<tagnames.length;i++) {
			extractTagValue(document, tagnames[i], tagDescriptions[i],tagMap);
		}
	}
	private static void extractTagValue(Document document, String tagnames, String tagDescriptions, Map<String, String> tagMap) {
		// TODO Auto-generated method stub
		NodeList nodelist = document.getElementsByTagName(tagnames);
		if(nodelist.getLength()>0) {
			String value = nodelist.item(0).getTextContent();
			tagMap.put(tagDescriptions, value);
			System.out.println(tagDescriptions + ":" + value);
		}else {
			System.out.println(tagDescriptions + ":" + " not found.");
		}
	}
}
