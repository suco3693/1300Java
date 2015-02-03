/**
 * MusicTone Class
 * 
 * This class represents a single sound tone that has
 * a certain frequency, duration, and loudness. Each
 * MusicTone can be played through audio out. 
 * 
 * Tone: Requires StdAudio.java
 */

public class SoundTone
{
    private double [] toneValues;
    private double toneHz;
    private double toneDuration;
    private double toneAmplitude;
    
    /**
     * SoundTone constructor
     */
    public SoundTone(double hz, double duration, double amplitude)
    {
        toneHz = hz;
        toneDuration = duration;
        toneAmplitude = amplitude;
        
        int n = (int) (StdAudio.SAMPLE_RATE * duration);
        toneValues = new double[n + 1];
        
        createTone(hz, duration, amplitude);
    }
    
    /**
     * Creates sine wave values based on a specific frequency value,
     *  which then can be turned into a sound that can be played. The
     *  tone values generated are not guaranteed to actually be hearable.
     *  (i.e., Humans can only hear a specific range of sounds and this
     *  actually changes over time as someone ages.)
     * 
     * @param   hz          frequency value for the tone
     * @param   duration    time in seconds that the tone will be heard
     * @param   amplitude   the volume of the tone
     */
    private void createTone(double hz, double duration, double amplitude) 
    {
        for (int i = 0; i < toneValues.length; i++)
        {
            toneValues[i] = amplitude * Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        }
    }
    
    /**
     * Makes the tone play through the computer's audio out device
     */
    public void playTone()
    {
        StdAudio.play(toneValues);
    }
    
    /**
     * Gets a string containing information about the tone
     * 
     * @return String 
     */
    public String getToneInfo()
    {
        String toneInfo;
        
        toneInfo = toneHz + " Hz, " + toneDuration + " Seconds, " + toneAmplitude + " Amplitude, " +
        StdAudio.SAMPLE_RATE + " Sample Rate";
        System.out.println(toneValues.length);
        return toneInfo;
    }
    
    /*
     * This main method provides a test to make sure everything is working with 
     *  playing sounds. StdAudio.java and MusicTone.java need to be in the same
     *  directory for sound to be produced. 
     */
    public static void main(String[] args)
    {
        SoundTone myTone;
        
        for(int i = 63; i < 65; i++)
        {
            myTone = new SoundTone(i * 4, 1.0, 0.50);
            myTone.playTone();
            System.out.println(myTone.getToneInfo());
        }
        
        // need to call this in non-interactive stuff so the program doesn't terminate
        // until all the sound leaves the speaker.
        StdAudio.close(); 

        // need to terminate a Java program with sound
        System.exit(0);
    }
}