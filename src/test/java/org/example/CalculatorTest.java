package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        
        //jak klasa ma metody instancyjne to w teście trzeba stworzyć instancję klasy
        
        //tylko 1 w klasie na początku
        @BeforeAll
        static  void before(){
                //tak można zdefiniować obiekt klasy dla testów metod niestatycznych
//                calculator = new Calculator();
                
                System.out.println("BeforeAll");
        }
        //tylko 1 w klasie na końcu
        @AfterAll
        static  void after(){
                System.out.println("AfterAll");
        }
        
        //przed każdą metodą testową w klasie, ta metoda nie jest static
        @BeforeEach
        void beforeeach(){
                System.out.println("beforeeach");
        }
        
        
        @Test
        @DisplayName("mytest co robi")
        void add() {
        
        //given
                int l = 5;
                int r = 7;
                Integer expected = 12;
                
        //when
                Integer result = Calculator.add(l,r);
                
                // w metodzie instancyjnej:
//                int result = calculator.add(l,r);
                
        //then
                //jeśl 1. asercja nie przejdzie to 2. nie jest sprawdzana
                Assertions.assertEquals(expected,result);
                
                //method wykona się zawsze
//                Assertions.assertEquals(expected,result,method());
                //method wykona się tylko gdy test się nie uda
//                Assertions.assertEquals(expected,result, ()->method());
        
                //test zdaje:
//                Assertions.assertFalse(false);
                
                //test nie zdaje, nie działa z typami prymitywnymi:
                Assertions.assertNotNull(null);
                //test zdaje, nie działa z typami prymitywnymi:
                Assertions.assertNotNull("");
        
                //takie sprawdzenie sprawdzi wszystkie metody i wydrukuje ewentualne wszystkie błędy:
//                Assertions.assertAll(
//                        ()->Assertions.assertEquals(expected,result1, ()->"sth"),
//                        ()->Assertions.assertEquals(expected,result2, ()->"sth2",
//                        ()->Assertions.assertEquals(expected,result3, ()->"sth3")
//                );
        
                //sprawdza czy dana metoda wyrzuci dany wyjątek lub klasę z której on dziedziczt
//                Assertions.assertThrows(NumberFormatException.class, ()->calculator.add(l,r));
        
                //sprwadzenie czy wiadomość wyrzucona jest równa wiadomości oczekiwanej przez nas:
//                NumberFormatException throwable = Assertions.assertThrows(NumberFormatException.class,
//                        ()->calculator.add(l,r));
//        Assertions.assertEquals("sth msg", throwable.getMessage());
      
        //AssertJ - biblioteka asercji bardziej skomplikowanych
        
//                //wyłączenie testu lub na klasie
//                @Test
//                @Disabled("msg")
        
        
/*        //metoda, do której przekażemy tablice z parametrami, każda tablica wykonuje się oddzielnie
                @ParameterizedTest
                        @MethodSource(value = "testData")
                void testCalculator(int[] testData){
                        // w jednym miejscu podajemy given,when,then
                        Assertions.assertEquals(testData[0],calculator.add(testData[1]), testData[2]);
                }
                
                //przekazanie parametrów:
                public static int[][] testData(){
                        return new int[][]{{5,2,3},{5,4,1},{5,5,0}};
                }
    */
                
                
        }
}