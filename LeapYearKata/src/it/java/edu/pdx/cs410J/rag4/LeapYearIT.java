package edu.pdx.cs410J.rag4;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration tests for the <code>LeapYear</code> class's main method.
 * These tests extend <code>InvokeMainTestCase</code> which allows them
 * to easily invoke the <code>main</code> method of <code>LeapYear</code>.
 */
public class LeapYearIT extends InvokeMainTestCase {
  private MainMethodResult invokeMain(String... args) {
    return invokeMain(LeapYear.class, args);
  }

  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain();
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("NOT ENOUGH COMMAND LINE ARGUMENTS"));
  }

  @Test
  public void goodLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("1240");
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void badLeapYear() {
    InvokeMainTestCase.MainMethodResult result = invokeMain("1239");
    assertThat(result.getExitCode(), equalTo(1));
  }
}
