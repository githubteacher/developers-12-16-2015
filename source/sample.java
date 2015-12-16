package com.intuit.hr.workday;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.intuit.hr.workday.pages.WorkdayTest;


public class BoomiReportGetWorkerSensitiveByNIDTests extends WorkdayTest {
				
	private static final String EDIT_BUTTON_OK = "chain=automationName:EditButtonBar_OK";
	private static final String REPORT_EMPLOYEE_ID = "chain=automationName:{0_1}6$40834_FastTableText_1423$45492";
	private static final String SEARCH_BUTTON = "chain=automationName:Start_Search_Button";
	//private static final String REPORT_NATIONAL_ID = "chain=automationName:{0_62}6$40834_FastTableText_1423$45547";
	//private static final String REPORT_DATE_BIRTH = "chain=automationName:{0_17}6$40834_FastTableText_1423$45862";
	private static final String REPORT_NID_HEADER = "chain=automationName:DataGridHeader_1423$45547/htmlText:NID_UNFORMATTED";
	private static final String REPORT_DOB_HEADER = "chain=automationName:DataGridHeader_1423$45862/htmlText:BIRTHDATE";	
	private static final String NATIONAL_ID_TEXT_FIELD = "chain=label: /automationName:WForm/label:National ID/automationName:6$8269_TextField_ExternalField146_6665PromptQualifier4";
	private static final String SELECTOR_LAYER = "chain=name:selectionLayer";
	private static final String REPORT_DATA_GRID = "chain=automationName:WDataGrid_6$8105_6$8104";
	private static final String QUERY_REPORT_LINK = "chain=automationName:{0_0}FastLinkList/automationName:{0_0}1422$2374_link";
	private static final String TEST_USER = "101036";


	@BeforeMethod(alwaysRun = true)
	public void loginSetup() {
	logInAs(TEST_USER);
	//page.waitUntilReady(140000);
	
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//The After Method tears down the test, logging out the user.
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
	if (page != null)
	page.signOut();
	if (authentication != null)
	authentication.waitUntilSignedOut(1400000);
}
	
