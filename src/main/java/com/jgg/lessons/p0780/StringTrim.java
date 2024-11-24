package com.jgg.lessons.p0780;

public class StringTrim {

  public static void main(String[] args){

    // trim the white spaces of " eat well   "
    System.out.println(" eat well   ".trim());
    // eat well

    // trim the white spaces of " dress    well   "
    System.out.println(" dress    well   ".trim());
    // dress    well

    // trim the white spaces of "          ", and print its length
    System.out.println("          ".trim().length());
    // 0

    // check if "          " equals "" when trimmed
    System.out.println("          ".trim().equals(""));
    // true

  }
}
