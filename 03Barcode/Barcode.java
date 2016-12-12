public class Barcode {
//implements Comparable<Barcode> {
// instance variables
   private static String _zip;

    private static String[] codes = {"||:::", ":::||", "::|:|", "::||:", 
				    ":|::|", ":|:|:", ":||::", "|:::|",
				    "|::|:", "|:|::"}; 
    // use this array for debugging purposes:
    // private static String[] codes = {"||:::0", ":::||1", "::|:|2", "::||:3", 
    //				    ":|::|4", ":|:|:5", ":||::6", "|:::|7",
    //				    "|::|:8", "|:|::9"};

// constructors
// precondtion: _zip.length() = 5 and zip contains only digits.
// postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      _zip = zip;
      if (_zip.length() != 5) {
	  throw new IllegalArgumentException();
      }
      for (int i = 0; i < _zip.length(); i++) {
	  if ( (_zip.charAt(i) < '0') || (_zip.charAt(i) > '9') ) {
	      throw new IllegalArgumentException();
	  }
      }
  }

// postcondition: computes and returns the check sum for _zip
     private static int checkSum() {
	 int sum = 0;
	 for (int i = 0; i < _zip.length(); i++) {
	     sum += Integer.parseInt(_zip.substring(i, i + 1));
	 }
	 sum %= 10;
	 return sum;
     }

    public static String getCheckSum() {
	String sum = "" + checkSum();
	return sum;
    }

//postcondition: Barcode (includes getCheckSum()!)
//ex. "|||:::|::|::|::|:|:|::::|||::|:|"      
     public static String toCode(String zip) {
	 zip += getCheckSum();
	 String barcodeStr = "|";
	 for (int i = 0; i < zip.length(); i++) {
	     // should return index of i from the string and then the index of 
	     // whatever that value is from the array codes
	     barcodeStr += codes[Integer.parseInt(zip.substring(i, i + 1))];
         }
	 barcodeStr += "|";
	 return barcodeStr;
     }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|" 
    public String toString() {
        String barcodeStr = _zip + getCheckSum() +  " " + toCode(_zip);
	return barcodeStr; 
    }

    public static String getCodesIndex(String barSection) {
	String bar = "";
	for (int i = 0; i < codes.length; i++) {
	    if (codes[i].equals(barSection)) {
		bar += "" + i;
	    }
	}
	return bar;
    }
    
    public static String toZip(String code) {
	String barcodeNum = "";

	if (code.length() != 32) {
	    throw new IllegalArgumentException("length of code is not 32...");
	}

	if (code.charAt(0) != '|' || code.charAt(31) != '|') {
	    throw new IllegalArgumentException("where those guardrails at tho");
	}
	
      	if (!(getCheckSum().equals(getCodesIndex(code.substring(26, 31))))) {
	    throw new IllegalArgumentException("Checksum is invalid. Try again!");
        }

	for (int i = 0; i < code.length(); i++) {
	    if ((code.charAt(i) != '|') && (code.charAt(i) != ':')) {
	        throw new IllegalArgumentException("Invalid characters! Try again.");
	    }
	}
	
	for (int i = 1; i < code.length() - 6; i += 5) {
	    barcodeNum += getCodesIndex(code.substring(i, i + 5));
	}

	if (barcodeNum.length() != 5) {
	    throw new IllegalArgumentException("Codes are off...");
	}
	
	return barcodeNum;
    }


// postcondition: compares the zip + checkdigit, in numerical order. 
     public int compareTo(Barcode other) {
	 return Integer.compare(Integer.parseInt(this._zip), Integer.parseInt(other._zip));				     
    }

    public static void main (String[] args) {
	try {
	    System.out.println("Return error b/c zip has a non-digit!");
	    Barcode uno = new Barcode("1&204"); 
	}
	catch (IllegalArgumentException e) {
	    e.printStackTrace();
	}
	// Barcode tres = new Barcode("hey!!!!!"); should be an error
	// Barcode cuatro = new Barcode("1903"); error
	// Barcode cinco = new Barcode("482045829434"); error
	Barcode dos = new Barcode("15925");
	System.out.println(dos.toCode("15925"));
	System.out.println(dos.toString());
	Barcode tres = new Barcode("08451");
	System.out.println(tres.toCode("09451"));
       	System.out.println(tres.toString());
	System.out.println("|||:::|::|::|::|:|:|::::|||::|:| <-- should return ");
	System.out.println(tres.compareTo(dos));
	Barcode cuatro = new Barcode("91047");
	System.out.println(cuatro.toCode("91047"));
	System.out.println("next output should be 91047");
       	System.out.println(cuatro.toZip("||:|:::::||||::::|::||:::|:::|||"));
       	// System.out.println(cuatro.toZip(":|:|:::::||||::::|::||:::|:::||:"));
	// System.out.println(cuatro.toZip("||:|:::::||||::::|::||:::||:|::|"));
	// System.out.println(cuatro.toZip("hitherethisshouldbeanerrorokjava"));
       	// System.out.println(cuatro.toZip("||||||:::||||::::|::||:::|:::|||"));
	} 
}
