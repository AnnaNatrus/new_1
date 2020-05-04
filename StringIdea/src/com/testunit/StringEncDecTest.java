package com.testunit;

import com.test.StringDecoding;
import com.test.StringEncoding;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringEncDecTest {
    @Test
    public void testEncoding() {
        StringEncoding encod = new StringEncoding();
        String str = "AAAAaaaBBBBBB\\12";
        assertEquals("4A3a6B\\\\\\1\\2", encod.encoding(str));

    }

    @Test
    public void testDecoding() {
        StringDecoding decod = new StringDecoding();
        String stri = "4A3a6B\\\\\\1\\2";
        assertEquals("AAAAaaaBBBBBB\\12", decod.decoding(stri));
    }
}