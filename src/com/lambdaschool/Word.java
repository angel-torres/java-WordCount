package com.lambdaschool;

public class Word
{
    private String word;
    private int wordCount;

    public Word(String word, int wordCount)
    {
        this.word = word;
        this.wordCount = wordCount;
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public int getWordCount()
    {
        return wordCount;
    }

    public void setWordCount(int wordCount)
    {
        this.wordCount = wordCount;
    }

    @Override
    public String toString()
    {
        return "Word{" +
                "word='" + word + '\'' +
                ", wordCount=" + wordCount +
                '}';
    }
}
