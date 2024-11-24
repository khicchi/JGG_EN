package com.jgg.lessons.p2330;

public class MultipleCatchBlock2 {

  public static void main(String[] args){

    try{
      // Code that can throw various exceptions
    } catch (NumberFormatException e) {
      // handle NumberFormatException
    } catch (IllegalArgumentException e) {
      // handle IllegalArgumentException
    } catch (RuntimeException e) {
      // handle RuntimeException
    } catch (Exception e) {
      // handle Exception
    } catch (Throwable e) {
      // handle Throwable
    }

  }

}
