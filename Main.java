// YOUR NAME: Dante Pineda
// COLLABORATORS: Xavier Liberty
// DATE: 

public class Main
{
        

        static final String ASCII_ART_0 = "    .----.    .----.  ",
        ASCII_ART_1 = "   (  --  \\  /  --  )",
        ASCII_ART_2 = "          |  |        ",
        ASCII_ART_3 = "         _/  \\_      ",
        ASCII_ART_4 = "        (_    _)      ",
        ASCII_ART_5 = "     ,    `--`    ,   ",
        ASCII_ART_6 = "     \\'-.______.-'/  ",
        ASCII_ART_7 = "      \\          /   ",
        ASCII_ART_8 = "       '.--..--.'     ",
        ASCII_ART_9 = "         `\"\"\"\"\"` ",
        ASCII_CREDIT = "   ascii art by: jgs    ";

        static final String TITLE_USA = "UNITED STATES OF AMERICA",
        TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";
        static final String LABEL_SURNAME = "Surname", LABEL_GIVEN_NAME = "Given Name", LABEL_USCIS_NUM = "USCIS#",
        LABEL_CATEGORY = "Category", LABEL_CARD_NUM = "Card#", LABEL_BIRTH_COUNTRY = "Country of Birth",
        LABEL_TERMS_CONDITIONS = "Terms and Conditions", LABEL_BIRTH_DATE = "Date of Birth",
        LABEL_SEX = "Sex", LABEL_VALID_DATE = "Valid From:", LABEL_EXPIRE_DATE = "Card Expires:",
        LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";
    

    public static void main(String[] args)
    {
       

        //DECLARATION SECTION
        //complete fields
        String surname, givenName, category, cardNum, birthCountry, termsAndConditions;
        char sex;

        //parts of fields
        String birthMonth;
        int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear,
                validDay, validMonth, validYear, expireMonth, expireDay, expireYear;

        //extra vars to help with formatting of Strings (not raw data like above vars)
        String uscisNum, dateOfBirth, validDate, expireDate;

        //INITIALIZATION SECTION
        surname = "CHAPETON-LAMAS";
        givenName = "NERY";
        uscisNum1 = 12;
        uscisNum2 = 4;
        uscisNum3 = 789;
        category = "C09";
        cardNum = "SRC9876543210";
        birthCountry = "Guatemala";
        termsAndConditions = "None";

        birthDay = 1;
        birthMonth = "JAN";
        birthYear = 1970;

        sex = 'M'; //note single quotes

        validMonth = 2;
        validDay = 2;
        validYear = 2020;

        expireMonth = 2;
        expireDay = 2;
        expireYear = 2022;

        //Strings to help clean up long printf's below
        uscisNum = String.format("%03d-%03d-%03d", uscisNum1, uscisNum2, uscisNum3);
        dateOfBirth = String.format("%02d %s %d", birthDay, birthMonth, birthYear);
        validDate = String.format("%02d/%02d/%4d", validMonth, validDay, validYear);
        expireDate = String.format("%02d/%02d/%4d", expireMonth, expireDay, expireYear);


        //INPUT + CALCULATION SECTION
        //N/A

        

        //OUTPUT SECTION
      
        
    }
    
    public static String formatCard(String surname, String givenName,
    String category, String cardNum, String birthCountry, 
    String termsAndConditions, char sex, String uscisNum, 
    String dateOfBirth, String validDate, String expireDate)
    {
        String formatcard1, formatcard2, formatcard3, formatcard4, formatcard5, formatcard6, formatcard7, formatcard8, formatcard9, formatcard10, formatcard11, formatcard12, formatcard13, 
        formatcard14, formatcard15, formatcard16, formatcard17, formatcard18, formatcard19;

        formatcard1 = String.format("╔══════════════════════════════════════════════════════════════════════╗%n");
        formatcard2 = String.format("║%35s%35s║%n", TITLE_USA, "");
        formatcard3 = String.format("║%60s%10s║%n", TITLE_EAC, "");
        formatcard4 = String.format("║%-25s%-45s║%n", "", LABEL_SURNAME);
        formatcard5 = String.format("║%-25s%-45s║%n", "", surname);
        formatcard6 = String.format("║%-25s%-45s║%n", ASCII_ART_0, LABEL_GIVEN_NAME);
        formatcard7 = String.format("║%-25s%-45s║%n", ASCII_ART_1, givenName);
        formatcard8 = String.format("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_2, LABEL_USCIS_NUM, LABEL_CATEGORY, LABEL_CARD_NUM);
        formatcard9 = String.format("║%-25s%-15s%-15s%-15s║%n", ASCII_ART_3, uscisNum, category, cardNum);
        formatcard10 =  String.format("║%-25s%-45s║%n", ASCII_ART_4, LABEL_BIRTH_COUNTRY);
        formatcard11 = String.format("║%-25s%-45s║%n", ASCII_ART_5, birthCountry);
        formatcard12 = String.format("║%-25s%-45s║%n", ASCII_ART_6, LABEL_TERMS_CONDITIONS);
        formatcard13 = String.format("║%-25s%-45s║%n", ASCII_ART_7, termsAndConditions);
        formatcard14 = String.format("║%-25s%-15s%-30s║%n", ASCII_ART_8, LABEL_BIRTH_DATE, LABEL_SEX);
        formatcard15 = String.format("║%-25s%-15s%-30s║%n", ASCII_ART_9, dateOfBirth, sex);
        formatcard16 = String.format("║%-25s%-15s%-30s║%n", "", LABEL_VALID_DATE, validDate);
        formatcard17 = String.format("║%-25s%-15s%-30s║%n", "", LABEL_EXPIRE_DATE, expireDate);
        formatcard18 = String.format("║%-25s%-45s║%n", ASCII_CREDIT, LABEL_REENTRY_DISCLAIMER);
        formatcard19 = String.format("╚══════════════════════════════════════════════════════════════════════╝%n");
    }



}