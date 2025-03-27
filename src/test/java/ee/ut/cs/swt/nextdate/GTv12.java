package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 3104);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2020, 2020, 2020);
	    String string0 = nextDate0.run(10, 11, 2020);
	    assertEquals("10/12/2020", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(8, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2020, 2020, 2020);
	    String string0 = nextDate0.run(9, 31, 2020);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(2020, 2020, 2020);
	    String string0 = nextDate0.run(1, 31, 2020);
	    assertEquals("2/1/2020", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-552), 1801, (-552));
	    String string0 = nextDate0.run(2, 30, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-552), 1801, (-552));
	    String string0 = nextDate0.run((-1), 2021, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate((-552), 1801, (-552));
	    String string0 = nextDate0.run(2021, (-414), 3514);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1288, 1288, 1288);
	    String string0 = nextDate0.run(2, 29, 1872);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate((-552), 1801, (-552));
	    String string0 = nextDate0.run(1801, 1801, 12);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(2002, 2002, 2002);
	    String string0 = nextDate0.run(2, 28, 2002);
	    assertEquals("3/1/2002", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(3176, 1998, 1998);
	    String string0 = nextDate0.run(5, 5, 1998);
	    assertEquals("5/6/1998", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate((-17), 2016, 2016);
	    String string0 = nextDate0.run(3, 3, 2016);
	    assertEquals("3/4/2016", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1804, 1804);
	    String string0 = nextDate0.run(6, 30, 1804);
	    assertEquals("7/1/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1813, 1813, 1813);
	    String string0 = nextDate0.run(8, 30, 1813);
	    assertEquals("8/31/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1903);
	    String string0 = nextDate0.run(11, 1, 1903);
	    assertEquals("11/2/1903", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1830, 1830, 1830);
	    String string0 = nextDate0.run(9, 30, 1830);
	    assertEquals("10/1/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate((-653), (-653), (-653));
	    String string0 = nextDate0.run(4, 4, 2016);
	    assertEquals("4/5/2016", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(2002, 2002, 2002);
	    String string0 = nextDate0.run(12, 12, 2002);
	    assertEquals("12/13/2002", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate((-552), 1801, (-552));
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2020, 2020, 2020);
	    String string0 = nextDate0.run(12, 31, 2020);
	    assertEquals("1/1/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1998, 1998, 1998);
	    String string0 = nextDate0.run(2, 2, 1998);
	    assertEquals("2/3/1998", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate((-17), 2011, 2011);
	    String string0 = nextDate0.run(7, 7, 2011);
	    assertEquals("7/7/2011", string0);
	}

}