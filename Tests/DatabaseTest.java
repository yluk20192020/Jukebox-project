
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

/**
 *
 * @author Yuk Chiu Luk
 */
public class DatabaseTest {
	private java.util.List songList;
	private Song testSong1, testSong2;
	private Database testDB;

	public DatabaseTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		songList = new java.util.ArrayList();

		testSong1 = new Song("Kadhal Cricket", "Kharesma Ravichandran",
							"Thani Oruvan", "Cricket.mp3", "Mp3", 214);
		testSong2 = new Song("Kadhal Cricket", "Kharesma Ravichandran", 
							"Thani Oruvan", "Cricket.mp3", "Mp3", 214);

		songList.add(testSong1);
		songList.add(testSong2);

		testDB = new Database(songList);
	}

	@After
	public void tearDown() {
		songList = null;
		testDB = null;
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	@Test
	public void testGetSongList() {
		System.out.println("Running testGetSongList (Database class)");
		testDB.setSongList(songList);
		assertEquals("Result", songList, testDB.getSongList());
	}

	@Test
	public void testAddSong() {
		System.out.println("Running testAddSong (Database class)");
		songList.add(testSong1);
		assertEquals("Result", songList.get(1), songList.get(1));
	}

	@Test
	public void testRemoveSong() {
		System.out.println("Running testRemoveSong (Database class)");
		songList.remove(testSong1);
		assertNull(testDB.getSongList(0));
	}

	@Test
	public void testSongListIfEmpty() {
		System.out.println("Running testSongListIfEmpty (Database class)");
		assertEquals("SongList if empty should have 0 elements", true, songList.isEmpty());
	}
}