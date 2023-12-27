package org.ETSEQuestions;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SellingProductsTest {

    @org.junit.jupiter.api.Test
    void deleteProducts() {
    //given
        int expected=2;
        List<Integer> input= new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 2, 1));
        // when
        SellingProducts products=new SellingProducts();
        //then
        Assert.assertEquals(expected,products.deleteProducts(input,3));
    }
    @org.junit.jupiter.api.Test
    void deleteProducts2() {
        //given
        int expected=1;
        List<Integer> input2= new ArrayList<>(Arrays.asList(1, 1, 5, 5));
        // when
        SellingProducts products=new SellingProducts();
        //then
        Assert.assertEquals(expected,products.deleteProducts(input2,2));
    }

}