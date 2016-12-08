public class Barcode {
//implements Comparable<Barcode> {
// instance variables
   private String _zip;
   private static String[] codes = {"||:::0", ":::||1", "::|:|2", "::||:3", 
				    ":|::|4", ":|:|:5", ":||::6", "|:::|7",
				    "|::|:8", "|:|::9"};

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
     private int checkSum() {
	 int sum = 0;
	 for (int i = 0; i < _zip.length(); i++) {
	     sum += Integer.parseInt(_zip.substring(i, i + 1));
	 }
	 sum %= 10;
	 return sum;
     }

    public String getCheckSum() {
	String sum = "" + checkSum();
	return sum;
    }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
     public String toString() {
	 _zip += getCheckSum();
	 String barcodeStr = "|";
	 for (int i = 0; i < _zip.length(); i++) {
	     // should return index of i from the string and then the index of 
	     // whatever that value is from the array codes
	     barcodeStr += codes[Integer.parseInt(_zip.substring(i, i + 1))];
         }
	 barcodeStr += "|";
	 return barcodeStr;
     }


// postcondition: compares the zip + checkdigit, in numerical order. 
    // public int compareTo(Barcode other) {
    //}

    public static void main (String[] args) {
	/* Barcode uno = new Barcode("18345");
	System.out.println(uno.toString());
	// Barcode dos = new Barcode("1&204"); should be an  error
	// Barcode tres = new Barcode("hey!!!!!"); should be an error
	Barcode dos = new Barcode("11111");
	System.out.println(dos.clone()); */
	Barcode tres = new Barcode("08451");
	System.out.println(tres.toString());
	System.out.println("Should return |||:::|::|::|::|:|:|::::|||");    
	
    }
}
