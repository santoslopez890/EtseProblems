package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Anagrams_funTest {

    @Test
    void anagrams_Fun() {
        //given
        ArrayList<String> words=new ArrayList<>(Arrays.asList("code", "doce", "ecod", "framer", "frame"));
        List<String> expected=new ArrayList<>(Arrays.asList("code", "framer", "frame"));
        //when
        Anagrams_fun anagrams=new Anagrams_fun();
        //then
        Assert.assertEquals(expected,anagrams.anagrams_Fun(words));
    }
}