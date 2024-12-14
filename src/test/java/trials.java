import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class trials {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> tagMap = new HashMap<String, String>();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("C://Users//Shakeer//Documents//SwiftMessage.txt");
		document.getDocumentElement().normalize();
		
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		
		//Accessing Message ID
		
		NodeList MessageIdList = document.getElementsByTagName("MsgId");
		if(MessageIdList.getLength()>0) {
		String MessageId = MessageIdList.item(0).getTextContent();
		tagMap.put("Message ID", MessageId);
			System.out.println(MessageId);
		}else {
			System.out.println("Message Id is not found.");
		}
		
		
		// Accessing payment informtaion
		
		
		NodeList PaymentInformationIdList = document.getElementsByTagName("PmtInfId");
		if(PaymentInformationIdList.getLength()>0) {
			String PaymentInformationId = PaymentInformationIdList.item(0).getTextContent();
			tagMap.put("Payment Information ID", PaymentInformationId);
			System.out.println(PaymentInformationId);
		}else {
			System.out.println("payment information Id is not found.");
		}
		
		//ReqdExctnDt
		
		NodeList RequestedExecutiontransactionDates = document.getElementsByTagName("ReqdExctnDt");
		if(RequestedExecutiontransactionDates.getLength()>0) {
			String RequestedExecutiontransactionDate = RequestedExecutiontransactionDates.item(0).getTextContent();
			tagMap.put("Request Execution transaction Date", RequestedExecutiontransactionDate);
			System.out.println(RequestedExecutiontransactionDate);
		}else {
			System.out.println("Requested transaction date is not found.");
		}
		
		//Ustrd
		
		NodeList remittanceInformation = document.getElementsByTagName("Ustrd");
		if(remittanceInformation.getLength()>0) {
			String ustrd = remittanceInformation.item(0).getTextContent();
			tagMap.put("Remittance detailed Information", ustrd);
			System.out.println(ustrd);
		}else {
			System.out.println("ustrd is not found.");
		}
		
		//CreDtTm
		
		NodeList creationDateandTime = document.getElementsByTagName("CreDtTm");
		if(creationDateandTime.getLength()>0) {
			String creationdateTime = creationDateandTime.item(0).getTextContent();
			tagMap.put("Creation Date and Time", creationdateTime);
			System.out.println(creationdateTime);
		}else {
			System.out.println("creation Date and Time is not found.");
		}
		
		//NbOfTxs
		NodeList NumberofTransactions = document.getElementsByTagName("NbOfTxs");
		if(NumberofTransactions.getLength()>0) {
			String Numberoftransaction = NumberofTransactions.item(0).getTextContent();
			tagMap.put("Number of transactions", Numberoftransaction);
			System.out.println(Numberoftransaction);
		}else {
			System.out.println("Number of transaction is not found.");
		}
		
		//Dbtr
		NodeList DebtorDetails = document.getElementsByTagName("Dbtr");
		if(DebtorDetails.getLength()>0) {
			String DebtorInf = DebtorDetails.item(0).getTextContent();
			tagMap.put("Debtor Information" , DebtorInf);
			System.out.println(DebtorInf);
		}else {
			System.out.println("Debtor Details is not found.");
		}
		
		
		//Cdtr
				NodeList CreditorDetails = document.getElementsByTagName("Cdtr");
				if(CreditorDetails.getLength()>0) {
					String CreditorInf = CreditorDetails.item(0).getTextContent();
					tagMap.put("Creditor Information", CreditorInf);
					System.out.println(CreditorInf);
				}else {
					System.out.println("Creditor Details is not found.");
				}
				
				System.out.println("All Tag-Value Pairs:");
				
				for(Map.Entry<String, String> entry : tagMap.entrySet()) {
					System.out.println("Tag:" + entry.getKey() + ", Value: " + entry.getValue());
				}
	
//		NodeList nodeList = root.getChildNodes();
//		for(int i=0;i<nodeList.getLength();i++)
//		{
//			Node node = nodeList.item(i);
//			if(node.getNodeType()==Node.ELEMENT_NODE)
//			{
//				Element element =(Element) node;
//				String tagname = element.getTagName();
//				String textContent = element.getTextContent();
//				System.out.println(tagname);
//				System.out.println(textContent);
//				}
//			}
		
			}
		}


