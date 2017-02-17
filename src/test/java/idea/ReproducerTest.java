package idea;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(CustomParameterized.class)
public class ReproducerTest {

   @CustomParameterized.Order(0)
   @Parameterized.Parameters(name = "{0}")
   public List<Object[]> getJtaParameters() {
      return Arrays.asList(
            new Object[] { "JTA", null },
            new Object[] { "non-JTA", null });
   }

   @Test
   public void testApp()
   {
      assertTrue( true );
   }

}
