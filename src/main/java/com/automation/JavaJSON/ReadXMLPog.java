package com.automation.JavaJSON;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

public class ReadXMLPog {
	
	public static void main(String[] args) {
		ReadXMLPog xml = new ReadXMLPog();
		String response = "<response><lst name=\"responseHeader\"><int name=\"status\">0</int><int name=\"QTime\">20</int></lst><result name=\"match\" numFound=\"1\" start=\"0\" maxScore=\"1.0\"><doc><str name=\"id\">654544873047</str><str name=\"basePogId\">654544873047</str><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"isAdvertisable\">true</bool><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPC</str></arr><float name=\"score\">1.0</float></doc></result><result name=\"response\" numFound=\"2109\" start=\"0\" maxScore=\"44.35835\"><doc><str name=\"id\">650588963978</str><bool name=\"isAdvertisable\">true</bool><str name=\"basePogId\">650588963978</str><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">663745825315</str><str name=\"basePogId\">663745825315</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">660152540465</str><bool name=\"isAdvertisable\">true</bool><str name=\"basePogId\">660152540465</str><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">676619040653</str><str name=\"basePogId\">676619040653</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">650994548973</str><str name=\"basePogId\">650994548973</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">643491276790</str><str name=\"basePogId\">643491276790</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">657686845155</str><str name=\"basePogId\">657686845155</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">648322680948</str><str name=\"basePogId\">648322680948</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">622280099181</str><str name=\"basePogId\">622280099181</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">634125436471</str><str name=\"basePogId\">634125436471</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">665238090859</str><str name=\"basePogId\">665238090859</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">641917123788</str><str name=\"basePogId\">641917123788</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">618920873897</str><str name=\"basePogId\">618920873897</str><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"isAdvertisable\">true</bool><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">644995894811</str><str name=\"basePogId\">644995894811</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">674354327761</str><str name=\"basePogId\">674354327761</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">673631522840</str><str name=\"basePogId\">673631522840</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">625662615453</str><str name=\"basePogId\">625662615453</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">660178269861</str><str name=\"basePogId\">660178269861</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">629683732878</str><str name=\"basePogId\">629683732878</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc><doc><str name=\"id\">624953158596</str><str name=\"basePogId\">624953158596</str><bool name=\"isAdvertisable\">true</bool><str name=\"Brand\">Apple</str><int name=\"bucketId\">3655</int><double name=\"Price\">8000.0</double><bool name=\"ad_flag_quota\">true</bool><bool name=\"ad_flag_inventory\">true</bool><arr name=\"ad_campaign_metrics\"><str>CPT</str></arr><float name=\"score\">44.35835</float></doc></result></response>";
		xml.readDOMParser(response);
	}

	public void readDOMParser(String response) {
		try {
			// Get Document Builder
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			// Build Document
			Document document = builder.parse(new InputSource(new StringReader(response.toString())));

			// Normalize the XML Structure
			document.getDocumentElement().normalize();

			// Get all docs
			NodeList nList = document.getElementsByTagName("str");
			
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

//				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					if(eElement.getAttribute("name").equalsIgnoreCase("id")) {
						System.out.println(eElement.getChildNodes().item(0).getNodeValue());
					}
					
					if(eElement.getAttribute("name").equalsIgnoreCase("ad_flag_quota")) {
						System.out.println(eElement.getChildNodes().item(0).getNodeValue());
					}
//				}
			}			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

