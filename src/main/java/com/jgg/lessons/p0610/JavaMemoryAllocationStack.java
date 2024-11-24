package com.jgg.lessons.p0610;

public class JavaMemoryAllocationStack {

  public static void main(String[] args){

    byte b = 1; // 1 byte is allocated

    int i = 1;  // 4 bytes are allocated

    long l = 1; // 8 bytes are allocated

  }

  public static int sizeOf(byte b) {
    // byte parameter b occupies 1 byte of memory
    return 1;
  }

  public static int sizeOf(int i) {
    // int parameter i occupies 4 bytes of memory
    return 4;
  }

  public static int sizeOf(long l) {
    // long parameter l occupies 8 bytes of memory
    return 8;
  }

}
