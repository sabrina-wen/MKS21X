public class Barcode {
//implements Comparable<Barcode> {
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
// precondtion: _zip.length() = 5 and zip contains only digits.
// postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      _zip = zip;
      _checkDigit = 0;
      if (_zip.length() != 5) {
	  throw new IllegalArgumentException();
      }
      for (int i = 0; i < _zip.length(); i++) {
	  if ( (_zip.charAt(i) < '0') || (_zip.charAt(i) > '9') ) {
	      throw new IllegalArgumentException();
	  }
      }
  }

// postcondition: Creates a copy of a bar code.
    public Barcode clone() {
	Barcode barz = new Barcode(_zip);
	return barz;
    }


// postcondition: computes and returns the check sum for _zip
     private int checkSum() {
	 int sum = 0;
	 for (int i = 0; i < _zip.length(); i++) {
	     sum += i;
	 }
	 sum %= 10;
	 return sum;
     }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
     public String toString() {
	 String barcodeStr = "|";
	 for (int i = 0; i < _zip.length(); i++) {
	     switch(i) {
	     case 0: barcodeStr += "||:::";
		 break;
	     case 1: barcodeStr += ":::||";
		 break;
	     case 2: barcodeStr += "::|:|";
		 break;
	     case 3: barcodeStr += "::||:";
		 break;
	     case 4: barcodeStr += ":|::|";
		 break;
	     case 5: barcodeStr += ":|:|:";
		 break;
	     case 6: barcodeStr += ":||::";
		 break;
	     case 7: barcodeStr += "|:::|";
		 break;
	     case 8: barcodeStr += "|::|:";
		 break;
	     case 9: barcodeStr += "|:|::";
		 break;
	     default: barcodeStr = "dis should not be here...";
		 break;
	     }
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
	
    }
}
