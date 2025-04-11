package org.iesvdm.compressor;

import org.junit.Assert;
import org.junit.Test;

public class SimpleStringCompressorTest {
	
	@Test
	public void decompressNormalTest() {
		//Given:
		String  str = "a4b3c2a1";
		
		//When:
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("aaaabbbcca", decompressed);
	}
	
	@Test
	public void decompressCadVacia() {
		
		//Given:
		String str = "";
		
		//When:
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect
		Assert.assertEquals("", decompressed);
	}
	
	@Test
	public void decompress1DigitVacia() {
	
		//Given
		String str = "a1";
			
		//When
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("a", decompressed);
	}
	
	@Test
	public void decompress2Digit() {
	
		//Given
		String str = "a10b3c5";
			
		//When
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("aaaaaaaaaabbbccccc", decompressed);
	}
	
	@Test
	public void decompressRareChar() {
	
		//Given
		String str = "b3c5ñ6a10";
			
		//When
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("bbbcccccññññññaaaaaaaaaa", decompressed);
	}
	
	@Test
	public void decompressDigitChar() {
	
		//Given
		String str = "13a5";
			
		//When
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("111aaaaa", decompressed);
	}
	
	@Test
	public void decompressDigitChar2() {
	
		//Given
		String str = "b313a5";
			
		//When
		String decompressed = SimpleStringCompressor.decompress(str);
		
		//Expect:
		Assert.assertEquals("111aaaaa", decompressed);
	}
	

}
