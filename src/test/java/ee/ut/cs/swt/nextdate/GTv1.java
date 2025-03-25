package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(2010, 2010, 2010);
	    String string0 = nextDate0.run(1, 1, 2010);
	    assertEquals("1/2/2010", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2019, 2019, 2019);
	    String string0 = nextDate0.run(12, 2019, 2019);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(2000, 2000, 2000);
	    String string0 = nextDate0.run(6, 31, 2000);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(2016, 2016, 2016);
	    String string0 = nextDate0.run(8, 31, 2016);
	    assertEquals("9/1/2016", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1975, 1975, 30);
	    String string0 = nextDate0.run(4, 30, 1975);
	    assertEquals("5/1/1975", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1981, 1981, 1981);
	    String string0 = nextDate0.run(11, 11, 1981);
	    assertEquals("11/12/1981", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2000, 2000, 30);
	    String string0 = nextDate0.run(2, 30, 2000);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1721), (-1721), (-1721));
	    String string0 = nextDate0.run((-1721), (-1721), (-1721));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1163), 1, (-1163));
	    String string0 = nextDate0.run((-1163), 1, (-1163));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(2011, 2011, 2011);
	    String string0 = nextDate0.run(9, 9, 2011);
	    assertEquals("9/10/2011", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(3297, 3297, 3297);
	    String string0 = nextDate0.run(3297, 3297, 3297);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 1936);
	    String string0 = nextDate0.run(10, 10, 1936);
	    assertEquals("10/11/1936", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3297, 3297, 3297);
	    String string0 = nextDate0.run(1, 3297, 3297);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(7, 7, 1936);
	    String string0 = nextDate0.run(7, 7, 1936);
	    assertEquals("7/7/1936", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2015, 2015, 2015);
	    String string0 = nextDate0.run(12, 12, 2015);
	    assertEquals("12/13/2015", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1966, 1966, 28);
	    String string0 = nextDate0.run(2, 28, 1966);
	    assertEquals("3/1/1966", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1986, 1986, 1986);
	    String string0 = nextDate0.run(2, 2, 1986);
	    assertEquals("2/3/1986", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(2014, 2014, 29);
	    String string0 = nextDate0.run(2, 29, 2014);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1929), (-1929), (-1929));
	    String string0 = nextDate0.run(5, 5, 1970);
	    assertEquals("5/6/1970", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, (-1868), 3);
	    String string0 = nextDate0.run(3, 3, 1943);
	    assertEquals("3/4/1943", string0);
	}

}