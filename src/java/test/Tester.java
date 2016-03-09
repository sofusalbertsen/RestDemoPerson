
package test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Tester {
  
  public static void main(String[] args) {
    Persistence.generateSchema("pu_development", null);
    Persistence.generateSchema("pu_test", null);
  }
  
}
