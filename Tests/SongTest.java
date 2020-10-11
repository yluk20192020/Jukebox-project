
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 *
 * @author Yuk Chiu Luk
 */
public class SongTest {
	private Song testSong1, testSong2;

	public SongTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
							"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
							"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
	}

	@After
	public void tearDown() {
		testSong1 = null;
		testSong2 = null;
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void testGetName() {
		System.out.println("Running testGetName (Song class)");
		testSong1.setName("Song_1");
		assertEquals("Result", "Song_1", testSong1.getName());
	}

	@Test
	public void testGetArtist() {
		System.out.println("Running testGetArtist (Song class)");
		testSong1.setArtist("Alisa");
		assertEquals("Result", "Alisa", testSong1.getArtist());
	}

	@Test
	public void testGetAlbum() {
		System.out.println("Running testGetAlbum (Song class)");
		testSong1.setAlbum("Album_1");
		assertEquals("Result", "Album_1", testSong1.getAlbum());
	}

	@Test
	public void testGetUrl() {
		System.out.println("Running testGetUrl (Song class)");
		testSong1.setUrl("www.npu.edu");
		assertEquals("Result", "www.npu.edu", testSong1.getUrl());
	}

	@Test
	public void testGetFormat() {
		System.out.println("Running testGetFormat (Song class)");
		testSong1.setFormat("mp5");
		assertEquals("Result", "mp5", testSong1.getFormat());
	}

	@Test
	public void testGetDuration() {
		System.out.println("Running testGetDuration (Song class)");
		testSong1.setDuration(100);
		assertEquals("Result", 100, testSong1.getDuration());
	}

	@Test
	public void testIsLong1() {
		System.out.println("Running testIsLong1 (Song class)");
		assertEquals("Song is long if length is more than 50", true, testSong1.isLong());
	}

	@Test
	public void testIsLong2() {
		System.out.println("Running testIsLong2 (Song class)");
		assertEquals("Song is long if length is more than 50", true, testSong2.isLong());
	}
}