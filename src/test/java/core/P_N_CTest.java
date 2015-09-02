package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class P_N_CTest {
       private P_N_C pnc;

       @Before
       public void initialize() {
              pnc = new P_N_C();
       }
       @Parameter(value = 0)
       public Integer inputNumber;
       
       @Parameter(value = 1)
       public Boolean expectedResult;
                		   
       @Parameters(name = "Iteration # {index}  Number: {0} isPrime? {1}")
       public static Collection<Object[]> data() {
              Object[][] data = new Object[][] {
            		  {2,false},
            		  {3,false},
            		  {4,false},
            		  {5,false},
            		  {6,false},
            		  {7,false},
            		  {8,false},
            		  {9,false},
            		  {10,false},
            		  {11,false},
            		  {12,false},
            		  {13,false},
            		  {14,false},
            		  {15,false},
            		  {16,false},
            		  {17,false},
            		  {18,false},
            		  {19,false},
            		  {20,false},
            		  {21,false},
            		  {22,false},
            		  {23,false},
            		  {24,false},
            		  {25,false},
            		  {26,false},
            		  {27,false},
            		  {28,false},
            		  {29,false},
            		  {30,false},
            		  {31,false},
            		  {32,false},
            		  {33,false},
            		  {34,false},
            		  {35,false},
            		  {36,false},
            		  {37,false},
            		  {38,false},
            		  {39,false},
            		  {40,false},
            		  {41,false},
            		  {42,false},
            		  {43,false},
            		  {44,false},
            		  {45,false},
            		  {46,false},
            		  {47,false},
            		  {48,false},
            		  {49,false},
            		  {50,false},
            		  {51,false},
            		  {52,false},
            		  {53,false},
            		  {54,false},
            		  {55,false},
            		  {56,false},
            		  {57,false},
            		  {58,false},
            		  {59,false},
            		  {60,false},
            		  {61,false},
            		  {62,false},
            		  {63,false},
            		  {64,false},
            		  {65,false},
            		  {66,false},
            		  {67,false},
            		  {68,false},
            		  {69,false},
            		  {70,false},
            		  {71,false},
            		  {72,false},
            		  {73,false},
            		  {74,false},
            		  {75,false},
            		  {76,false},
            		  {77,false},
            		  {78,false},
            		  {79,false},
            		  {80,false},
            		  {81,false},
            		  {82,false},
            		  {83,false},
            		  {84,false},
            		  {85,false},
            		  {86,false},
            		  {87,false},
            		  {88,false},
            		  {89,false},
            		  {90,false},
            		  {91,false},
            		  {92,false},
            		  {93,false},
            		  {94,false},
            		  {95,false},
            		  {96,false},
            		  {97,false},
            		  {98,false},
            		  {99,false},
            		  {100,false}
       };
                     return Arrays.asList(data);
       }

       @Test
       public void testP_N_C() {
       System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
       assertEquals(expectedResult, pnc.wb(inputNumber));
      }
}