import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestGradebookPaired {

	private TeamGradebook gb;

	@Before
	public void setUp() throws Exception {
		this.gb = new TeamGradebook();
		this.gb.handleCommand("add-student Alice");
		this.gb.handleCommand("add-student Bob");
		gb.handleCommand("add-team Ninjas Bob Alice");
	}

	@Test
	public void testImplicitCreation() {
		assertEquals("ok", gb.handleCommand("add-team Implicit Charlie Dave"));
		assertEquals("ok", gb.handleCommand("add-grade Implicit 97.5"));
		assertEquals("98", gb.handleCommand("get-average Charlie"));
		assertEquals("98", gb.handleCommand("get-average Dave"));
	}

	@Test
	public void testBasicBestTeam() {
		assertEquals("ok", gb.handleCommand("add-team Implicit Charlie Dave"));
		assertEquals("ok", gb.handleCommand("add-grade Implicit 50"));
		assertEquals("ok", gb.handleCommand("add-grade Ninjas 60"));
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));
		assertEquals("ok", gb.handleCommand("add-grade Implicit 100"));
		assertEquals("Implicit", gb.handleCommand("get-best-team"));
	}

	@Test
	public void testBasicBestTeamNotIndividuals() {
		assertEquals("ok", gb.handleCommand("add-team JustCharlie Charlie"));
		assertEquals("ok", gb.handleCommand("add-team JustAlice Alice"));
		assertEquals("ok", gb.handleCommand("add-team JustBob Bob"));
		assertEquals("ok", gb.handleCommand("add-grade JustCharlie 90"));
		assertEquals("ok", gb.handleCommand("add-grade JustAlice 0"));
		assertEquals("ok", gb.handleCommand("add-grade JustBob 0"));
		assertEquals("ok", gb.handleCommand("add-grade Ninjas 91"));

		assertEquals("Ninjas", gb.handleCommand("get-best-team"));

	}

	@Test

	public void testBestTeamNotIndividuals2() {

		assertEquals("ok", gb.handleCommand("add-team Implicit Dan Dave"));
		assertEquals("ok", gb.handleCommand("add-grade Ninjas 90"));
		assertEquals("ok", gb.handleCommand("add-grade Implicit 0"));
		assertEquals("ok", gb.handleCommand("add-grade Ninjas 90"));
		assertEquals("ok", gb.handleCommand("add-grade Implicit 100"));
		assertEquals("Ninjas", gb.handleCommand("get-best-team"));

	}

}
