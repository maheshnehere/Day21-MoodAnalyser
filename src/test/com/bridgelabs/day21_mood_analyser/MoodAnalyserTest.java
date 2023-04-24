package test.com.bridgelabs.day21_mood_analyser; 

import com.bridgelabs.day21_mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    String message = "";
    MoodAnalyser moodAnalyser = new MoodAnalyser(message);
@Test
public void testAnalyseMood() throws Exception {
    String actual = moodAnalyser.analyseMood();
    Assert.assertEquals("", actual);
}
} 
