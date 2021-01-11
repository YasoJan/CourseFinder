import java.util.Scanner;

public class Main {

 public static void main(String[] args) 
 {
    System.out.println("\nList of Majors to choose:\n-------------------------\nANTH, ART, HIST, ART TRAI, BIO, HUMN, COM ENG, COM SCI, MASS COM, SPAN, PHYS, POLI SCI, MUSC, LING, KINES, INSTRU DES, GEOL, GEOG, PUBL ARC, SOC WOR, SOCIOL, FACS, EAOH, DCDL, ELECT ENG, URB PLAN, COM STU, COM DIS, CHIC, TAX\n-------------------------\n");
    System.out.println("Enter desrired major:(CASE SENSITIVE)\n");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine(); //getting the user's input

    switch (userInput) //Comparing userInput to different cases. Each case is a major.
    {
      case "ANTH": 
      if (compare(userInput, "ANTH") == true) //Calling the compare function (seen below).
      {
        System.out.println("Courses Needed:");
        System.out.println("ANTH101, ANTH110, ... , ANTH330");
        break;
      }
      case "ART": 
      if (compare(userInput, "ART") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("ART101, ART110, ... , ART280");
        break;
      }
      case "HIST":
      if (compare(userInput, "HIST") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("HIST110, HIST135, ... , HIST220");
        break;
      }
      case "ART TRAI":
      if (compare(userInput, "ART TRAI") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("ATH TRAI110, ATH TRAI130, ... , ATH TRAI330");
        break;
      }
      case "BIO":
      if (compare(userInput, "BIO") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("BIO101, BIO110, ... , BIO330");
        break;
      }
      case "HUMN":
      if (compare(userInput, "HUMN") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("HUMN101, HUMN110, ... , HUMN330");
        break;
      }
      case "COM ENG":
      if (compare(userInput, "COM ENG") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("COM ENG101, COM ENG110, ... , COM ENG330");
        break;
      }
      case "MASS COM":
      if (compare(userInput, "MASS COM") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("MASS COM101, MASS COM110, ... , MASS COM330");
        break;
      }
      case "SPAN":
      if (compare(userInput, "SPAN") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("SPAN101, SPAN110, ... , SPAN330");
        break;
      }
      case "PHYS":
      if (compare(userInput, "PHYS") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("PHYS101, PHYS110, ... , PHYS330");
        break;
      }
      case "POLI SCI":
      if (compare(userInput, "POLI SCI") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("POLI SCI101, POLI SCI110, ... , POLI SCI330");
        break;
      }
      case "MUSC":
      if (compare(userInput, "MUSC") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("MUSC101, MUSC110, ... , MUSC330");
        break;
      }
      case "LING":
      if (compare(userInput, "LING") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("LING101, LING110, ... , LING330");
        break;
      }
      case "KINEG":
      if (compare(userInput, "KINEG") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("KINEG101, KINEG110, ... , KINEG330");
        break;
      }
      case "INSTRU DES":
      if (compare(userInput, "INSTRU_DES") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("INSTRU_DES101, INSTRU_DES110, ... , INSTRU_DES330");
        break;
      }
      case "GEOL":
      if (compare(userInput, "GEOL") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("GEOL101, GEOL110, ... , GEOL330");
        break;
      }
      case "GEOG":
      if (compare(userInput, "GEOG") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("GEOG101, GEOG110, ... , GEOG330");
        break;
      }
      case "PUBL ARC":
      if (compare(userInput, "PUBL ARC") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("PUBL ARC101, PUBL ARC110, ... , PUBL ARC330");
        break;
      }
      case "SOR WOR":
      if (compare(userInput, "SOC WOR") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("SOC WOR101, SOC WOR110, ... , SOC WOR330");
        break;
      }
      case "SOCIOL":
      if (compare(userInput, "SOCIOL") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("SOCIOL101, SOCIOL110, ... , SOCIOL330");
        break;
      }
      case "FACS":
      if (compare(userInput, "FACS") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("FACS101, FACS110, ... , FACS330");
        break;
      }
      case "EAOH":
      if (compare(userInput, "EAOH") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("EAOH101, EAOH110, ... , EAOH330");
        break;
      }
      case "DCDL":
      if (compare(userInput, "DCDL") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("DCDL101, DCDL110, ... , DCDL330");
        break;
      }
      case "ELECT ENG":
      if (compare(userInput, "ELECT ENG") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("ELECT ENG101, ELECT ENG110, ... , ELECT ENG330");
        break;
      }
      case "URB PLAN":
      if (compare(userInput, "URB PLAN") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("URB PLAN101, URB PLAN110, ... , URB PLAN330");
        break;
      }
      case "COM STU":
      if (compare(userInput, "COM STU") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("COM STU101, COM STU110, ... , COM STU330");  break;
      }
      case "COM DIS":
      if (compare(userInput, "COM DIS") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("COM DIS101, COM DIS110, ... , COM DIS330");
        break;
      }
      case "CHIC":
      if (compare(userInput, "CHIC") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("CHIC101, CHIC110, ... , CHIC330");
        break;
      }
      case "TAX":
      if (compare(userInput, "TAX") == true)
      {
        System.out.println("Courses Needed:");
        System.out.println("TAX101, TAX110, ... , TAX330");
        break;
      }
      default:
      System.out.println("ERROR: Major not found."); //Exception: casused by userInput not matching list.
    }
  }

  public static boolean compare(String A, String B) //Naive/bruteforce Algorithim
  {  
    for(int i=0; i<A.length() && i<B.length() ; i++) //Looping the characters in both userInput and the Major.
    {  
      char c = A.charAt(i); //initializing char for userInput at index i of the string.
      char d = B.charAt(i); //initializing char for Major at index i of the string.
      if (c != d && d != c) //if not an exact match...
      {
        return false; //...return false.
      }
    }  
    return true; //Otherwise, true.
  }

}


